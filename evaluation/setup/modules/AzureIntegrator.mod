module Azure implements DTPlatform {
  software AzureDTService {
    state extends outgoingData;
    changeState extends incomingData;
    executeCommand extends incomingCommand;
    commandExecution extends incomingCommand;
  }
  language AzureDTDefinitionLanguage {
    Interface -> IN_TypeDef; 
    Command -> IN_MethodDef;
    CommandPayload -> IN_MethodParamDef;
    Property -> IN_PropertyDef;
    Telemetry -> IN_PropertyDef;
    Twin -> IN_Instance;
    OperationCall -> IN_MethodCall;
    Interface -> OUT_TypeDef; 
    Command -> OUT_MethodDef;
    CommandPayload -> OUT_MethodParamDef;
    Property -> OUT_PropertyDef;
    Telemetry -> OUT_PropertyDef;
    Twin -> OUT_Instance;
    OperationCall -> OUT_MethodCall;
  }
}
