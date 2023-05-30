module Azure implements DTPlatform {
  software AzureDTService {
    state extends data;
    executeCommand extends command;
  }
  language AzureDTDefinitionLanguage {
    Interface -> TypeDef; 
    Command -> MethodDef;
    CommandPayload -> MethodParamDef;
    Property -> PropertyDef;
    Telemetry -> PropertyDef;
    Twin -> Instance;
    OperationCall -> MethodCall;
  }
}
