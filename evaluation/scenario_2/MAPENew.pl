featuremodel MAPE {
	tree DigitalTwin {
		mandatory DTPlatform {
			AWSIoTTwinMaker; xor Azure;
		}
		mandatory Planner {
            TimedStatecharts; xor BasicStatecharts; xor MOMOT;
        }
        mandatory DeviationChecker {
            EventBasedChecker; xor TimeBasedChecker;
        }
	}
}
