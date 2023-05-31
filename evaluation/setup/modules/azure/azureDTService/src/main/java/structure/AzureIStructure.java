package generic.structure.azure;

import generic.structure.IStructure;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AzureIStructure implements IStructure {
    Map<String, String> attributes;

    public AzureIStructure(){
        this.attributes = new LinkedHashMap<>();
    }
    @Override
    public String getAttributeValue(String name) {
        return this.attributes.get(name);
    }

    @Override
    public void setAttributeValue(String name, String value) {
        this.attributes.put(name, value);
    }

    @Override
    public Operation getOperation(String name) {
        return null;
    }
}
