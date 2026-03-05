@Override public int hashCode(){
return 31 * super.hashCode() + (int) (this.type ^ (this.type >>> 32));
}