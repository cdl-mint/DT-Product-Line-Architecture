package parser;

import aut.umlsc._symboltable.SCSymbol;
import aut.umlsc._symboltable.UMLSCLanguageFamily;
import de.monticore.io.paths.ModelPath;
import de.monticore.lang.awstm._symboltable.ComponentTypeSymbol;
import de.monticore.lang.awstm._symboltable.PropertyDefinitionSymbol;
import de.monticore.symboltable.GlobalScope;
import de.monticore.symboltable.Symbol;
import org.junit.Ignore;
import org.junit.Test;

import java.nio.file.Paths;
import java.util.Optional;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class SymbolTableTest {

    private static final ModelPath MODEL_PATH =
            new ModelPath(Paths.get("src/test/resources/"));
    @Test
    @Ignore
    public void testSymbolTableModelLoading() {
        final GlobalScope symTab =
                new GlobalScope(MODEL_PATH, new UMLSCLanguageFamily());

        final Optional<SCSymbol> resolvedAut =
                symTab.resolve("correct.TemperatureControl", SCSymbol.KIND);

        final Optional<ComponentTypeSymbol> resolvedThermostat =
                symTab.resolve("correct.Thermostat", ComponentTypeSymbol.KIND);

        assertTrue(resolvedAut.isPresent());
        assertTrue(resolvedThermostat.isPresent());

        SCSymbol automatonSymbol = resolvedAut.get();
        Optional<Symbol> propertyDefinition = automatonSymbol.getSpannedScope().resolve("temp", PropertyDefinitionSymbol.KIND);
        assertTrue(propertyDefinition.isPresent());

        Optional<PropertyDefinitionSymbol> temp = resolvedThermostat.get().getSpannedScope().resolve("temp", PropertyDefinitionSymbol.KIND);
        assertTrue(temp.isPresent());

        

//
//        final LanguageComponentSymbolReference
//                languageComponent1 = resolvedLC.get().getLanguageComponents().get(0);
//
//        assertFalse(languageComponent1.isReferencedSymbolLoaded());
//        assertTrue(languageComponent1.existsReferencedSymbol());
//
//        final LanguageComponentSymbol languageComponentSymbol = languageComponent1.getReferencedSymbol();
//        assertTrue(languageComponentSymbol.getLanguageComponentNode().isPresent());
//
//        final Optional<FeatureDeclarationSymbol> statecharts =
//                resolvedLC.get().getFeatureBinding("Automaten");
//
//        assertTrue(statecharts.isPresent());

    }
}
