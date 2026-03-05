class Generated {
    private int pop(){
    int value = outputFrame.pop();
    	outputFrame = outputFrame.getPrevious();
    	return value;
    }
}
