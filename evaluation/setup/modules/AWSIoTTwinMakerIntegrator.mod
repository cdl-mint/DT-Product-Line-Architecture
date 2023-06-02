module AWSIoTTwinMaker implements DTPlatform {
  software AWSDTService {
    state extends outgoingData;
    setState extends incomingData;
    executeCommand extends incomingCommand;
    getCommand extends outgoingCommand;
  }
  language AWSIoTTwinMakerLang {
    ComponentType -> IN_TypeDef; 
    Function -> IN_MethodDef;
    FunctionParameter -> IN_MethodParamDef;
    PropertyDefinition -> IN_PropertyDef;
    Component -> IN_Instance;
    ComponentType -> OUT_TypeDef; 
    Function -> OUT_MethodDef;
    FunctionParameter -> OUT_MethodParamDef;
    PropertyDefinition -> OUT_PropertyDef;
    Component -> OUT_Instance;
  }
}
