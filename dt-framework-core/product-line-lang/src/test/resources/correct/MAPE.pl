featuremodel MAPE {
	tree DigitalTwin {
		mandatory CoreDT {
			AWSTwinMaker; xor AzureDT;
		}
		mandatory Planner {
            TimedStatecharts; xor BasicStatecharts; xor MOMOT;
        }
        mandatory DeviationChecker {
            EventBased; xor TimeBased;
        }
	}
}
