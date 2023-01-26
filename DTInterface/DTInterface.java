

public interface DigitalTwin{	
	String twinName; 
	
	public Value getAttributeValue(String name)
	
	public Value executeCommand(String name, List<Parameter> params)
	
}

class AzureDigitalTwin implements DigitalTwin{
	String twinName;
	String URI;
	
	public AzureDigitalTwin(twinName, adtURI){
		this.twinName = twinName;
		this.URI = adtURI;
	}
	
	public String getAttributeValue(String name){
		String path = this.URI + "/digitaltwins/" + this.twinName + "";
		JSONObject  response = httpFramework.performGet(path);
		String result = response.get(name);
		return result;
	}
	
	public String executeCommand(String name, List<Parameter> params){
		String path = this.UIR + "/digitaltwins/" + this.twinName + "/commands/" + name + "?api-version=2020-05-31-preview";
		JSONObject response = httpFramework.performPost(path, params);
		return response.toString();
	}
}
