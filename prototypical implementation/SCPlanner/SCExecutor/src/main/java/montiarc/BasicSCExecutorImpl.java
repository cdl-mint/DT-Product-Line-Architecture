package montiarc;

import de.montiarcautomaton.runtimes.timesync.implementation.IComputable;
import generic.structure.IStructure;

public class BasicSCExecutorImpl implements IComputable<BasicSCExecutorInput, BasicSCExecutorResult> {
    @Override
    public BasicSCExecutorResult getInitialValues() {
        return null;
    }

    @Override
    public BasicSCExecutorResult compute(BasicSCExecutorInput input) {
        IStructure data = input.getData();
        String temp = data.getAttributeValue("temp");


        BasicSCExecutorResult result = new BasicSCExecutorResult();

        return result;
    }
}
