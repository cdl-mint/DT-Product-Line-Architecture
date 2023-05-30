module AWSIoTTwinMaker implements DTPlatform {
  software AWSDTService {
    state extends data;
    executeCommand extends command;
  }
  language AWSIoTTwinMakerLang {
    ComponentType -> TypeDef; 
    Function -> MethodDef;
    FunctionParameter -> MethodParamDef;
    PropertyDefinition -> PropertyDef;
    Component -> Instance;
  }
}
