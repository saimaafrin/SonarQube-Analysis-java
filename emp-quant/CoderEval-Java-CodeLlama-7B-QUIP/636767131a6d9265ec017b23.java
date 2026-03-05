final void addLineNumber(final int lineNumber){
if(lineNumber < 0){
		throw new IllegalArgumentException("Line number must be greater than or equal to 0.");
	}
	
	this.lineNumber = lineNumber;
}