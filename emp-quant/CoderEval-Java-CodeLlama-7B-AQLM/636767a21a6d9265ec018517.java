public final byte[] toByteArray(){
if(this.buffer.length() == 0){
		return new byte[0];
	}
	byte[] bytes = new byte[this.buffer.length()];
	for(int i = 0; i < this.buffer.length(); i++){
		bytes[i] = this.buffer.get(i);
	}
	return bytes;
}