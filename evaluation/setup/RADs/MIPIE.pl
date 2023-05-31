featuremodel MPE {
	tree DigitalTwin {
		mandatory DTPlatform {
			AWSIoTTwinMaker; xor Azure;
		}
		mandatory Planner {
            TimedStatecharts; xor BasicStatecharts; xor MOMOT;
        }
	}
}
