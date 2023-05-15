featuremodel MPE {
	tree DigitalTwin {
		mandatory CoreDT {
			AWSTwinMaker; xor AzureDT;
		}
		mandatory Planner {
            TimedStatecharts; xor BasicStatecharts; xor MOMOT;
        }
	}
}
