package sc.umlsc._gen;

import de.monticore.expressions.prettyprint.MCExpressionsPrettyPrinter;
import de.monticore.mcexpressions._ast.ASTExpression;
import de.monticore.prettyprint.IndentPrinter;
import de.se_rwth.commons.Names;
import sc.umlsc._ast.*;

import java.util.Optional;

public class TransitionPrinter {

    public String printGuard(ASTTransition transition) {
        ASTIGuardExpr iGuardExpr = transition.getIGuardExpr();
        if(iGuardExpr instanceof ASTBaseGuardExpression) {
            ASTExpression expression = ((ASTBaseGuardExpression) iGuardExpr).getExpression();
            IndentPrinter printer = new IndentPrinter();
            MCExpressionsPrettyPrinter prettyPrinter = new MCExpressionsPrettyPrinter(printer);
            expression.accept(prettyPrinter);
            return prettyPrinter.getPrinter().getContent();
        }
        return "";
    }

    public String printAction(ASTTransition transition) {
        ASTIAction iAction = transition.getIAction();
        if(iAction instanceof ASTActionBase) {
            ASTActionBase action = (ASTActionBase) iAction;
            Optional<ASTAssignment> assignmentOpt = action.getAssignmentOpt();
            Optional<ASTExpression> expressionOpt = action.getExpressionOpt();
            IndentPrinter printer = new IndentPrinter();
            MCExpressionsPrettyPrinter prettyPrinter = new MCExpressionsPrettyPrinter(printer);

            if(assignmentOpt.isPresent()) {
                String propertyReference = Names.getQualifiedName(assignmentOpt.get().getPropertyReference().getQualifiedName().getPartList());
                ASTExpression expression = assignmentOpt.get().getValue().getExpression();
                expression.accept(prettyPrinter);
                return propertyReference + " = " + prettyPrinter.getPrinter().getContent();
            }
            if(expressionOpt.isPresent()) {
                ASTExpression expression = expressionOpt.get();
                expression.accept(prettyPrinter);
                return prettyPrinter.getPrinter().getContent();
            }
        }

        return "";
    }

}
