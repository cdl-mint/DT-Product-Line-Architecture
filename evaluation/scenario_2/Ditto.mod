module AWSIoTTwinMaker implements DTPlatform {
  software DittoInterface {
    data extends data;
    function extends command;
  }
  language VortoLang {
    FunctionBlock -> TypeDef; 
    Operation -> MethodDef;
    OperationParameter -> MethodParamDef;
    PropertyDefinition -> PropertyDef;
  }
}
