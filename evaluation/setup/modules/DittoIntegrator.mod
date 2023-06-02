module AWSIoTTwinMaker implements DTPlatform {
  software DittoInterface {
    data extends data;
    function extends command;
    data extends outgoingData;
    sendData extends incomingData;
    function extends incomingCommand;
    getFunction extends outgoingCommand;
  }
  language VortoLang {
    FunctionBlock -> IN_TypeDef; 
    Operation -> IN_MethodDef;
    OperationParameter -> IN_MethodParamDef;
    PropertyDefinition -> IN_PropertyDef;
    FunctionBlock -> OUT_TypeDef; 
    Operation -> OUT_MethodDef;
    OperationParameter -> OUT_MethodParamDef;
    PropertyDefinition -> OUT_PropertyDef;
  }
}
