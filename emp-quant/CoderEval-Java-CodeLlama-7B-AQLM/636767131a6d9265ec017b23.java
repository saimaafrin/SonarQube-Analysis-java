final void addLineNumber(final int lineNumber){
if(lineNumber < 0){
		throw new IllegalArgumentException("lineNumber < 0");
	}
	this.lineNumber += lineNumber;
}