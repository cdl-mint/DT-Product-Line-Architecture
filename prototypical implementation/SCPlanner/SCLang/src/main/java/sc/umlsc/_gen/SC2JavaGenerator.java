package sc.umlsc._gen;

import de.monticore.generating.GeneratorEngine;
import de.monticore.generating.GeneratorSetup;
import de.monticore.types.TypesPrinter;
import de.se_rwth.commons.Names;
import sc.umlsc._ast.*;
import sc.umlsc._parser.UMLSCParser;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SC2JavaGenerator {

    public String generateSC2Java(Path model, Path outputDir) {

        return "";
    }

    public String generateSC2Java(ASTSCCompilationUnit node) {
        GeneratorSetup setup = new GeneratorSetup();
        GeneratorEngine ge = new GeneratorEngine(setup);
        List<ASTIState> iStateList = node.getSC().getIStateList();
        List<String> stateNames = new ArrayList<>();
        iStateList.stream().filter(s -> s instanceof ASTStateBase).forEach((s -> stateNames.add(((ASTStateBase) s).getName())));
        TransitionPrinter printer = new TransitionPrinter();
        String packageName = Names.getQualifiedName(node.getPackageList());
        List<String> importList = new ArrayList<>();
        node.getImportStatementLOCALList().forEach(i -> importList.add(Names.getQualifiedName(i.getImportList())));


        List<String> parameterList = new ArrayList<>();
        node.getSC().getParameterList().forEach(p -> parameterList.add(TypesPrinter.printType(p.getType()) + " " + p.getName()));


        StringBuilder generate = ge.generate("templates.SC2Java.ftl", node, packageName, importList,parameterList, stateNames, node.getSC().getTransitionList(), printer);

        return generate.toString();
    }

}
