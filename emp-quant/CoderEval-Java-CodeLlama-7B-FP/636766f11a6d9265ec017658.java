public static int indexOfLastSeparator(String filename){
int lastUnixPos = filename.lastIndexOf('/');
	int lastWindowsPos = filename.lastIndexOf('\\');
	return Math.max(lastUnixPos, lastWindowsPos);
}