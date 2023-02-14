package generic;

import java.util.List;

public interface IStructure {	
	
	String getAttributeValue(String name);
	
	Operation getOperation(String name);
	
	public interface Operation{
		public void execute();
		
		public void setParameterValue(String name, String value);
	}
	
	public interface Attribute{
		public String getValue();
	}
}
