package generic.structure;

public interface IStructure {

    String getAttributeValue(String temperature);

    Operation getOperation(String setTemp);

    public interface Operation {

        void setParameterValue(String targetTemp, String s);
    }
}
