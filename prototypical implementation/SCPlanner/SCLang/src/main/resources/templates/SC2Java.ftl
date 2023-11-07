${tc.signature("package", "importList", "parameterList", "states", "transitionList", "transitionPrinter")}

package ${package};

<#list importList as import>
    import ${import};
</#list>

public class ${ast.getSC().getName()} {
State state = State.IDLE;

public enum State {
<#list states as state>
    ${state}<#if state?has_next>,<#else>;</#if>
</#list>
}

  public void compute (
<#list parameterList as parameter>
    ${parameter}
    <#if parameter_has_next>
        ,
    </#if>
</#list>
) {
<#list transitionList as transition>
    if (state == State.${transition.getSource()}) {
    if (${transitionPrinter.printGuard(transition)}) {
    ${transitionPrinter.printAction(transition)}
    state = ${transition.getTarget()};
    }
    }
</#list>
  }
}