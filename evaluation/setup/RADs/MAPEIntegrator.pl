featuremodel MAPE {
	tree DigitalTwin {
		mandatory pf1 {
			AWSIoTTwinMaker; xor Azure;
		}
		mandatory pf2 {
			AWSIoTTwinMaker; xor Azure;
		}
		mandatory Planner {
            TimedStatecharts; xor BasicStatecharts; xor MOMOT;
        }
		mandatory integr {
            AWSIoTTwinMakerIntegrator; xor AzureIntegrator;
        }
        mandatory DeviationChecker {
            EventBasedChecker; xor TimeBasedChecker;
        }
	}
}
