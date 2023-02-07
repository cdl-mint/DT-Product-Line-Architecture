package generic;

import java.util.List;

public interface IStructure {	
	
	String getAttributeValue(String name);
	
	void executeOperation(String opName);
	
	public interface Operation{
		public void execute();
	}
	
	public interface Attribute{
		public String getValue();
	}
}
