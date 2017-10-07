function beforeStateEntry(sequenceId){
	
	if (sequenceId == 9) {
		hAPI.setCardValue("aprova", "s");
	}
	
	if (sequenceId == 11) {
		hAPI.setCardValue("aprova", "n");
	}
}