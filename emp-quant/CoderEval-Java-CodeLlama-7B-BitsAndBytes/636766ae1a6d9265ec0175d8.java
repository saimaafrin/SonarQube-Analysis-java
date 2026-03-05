private String buildContentRange(){
StringBuilder sb = new StringBuilder();
	sb.append("bytes ");
	sb.append(offset);
	sb.append("-");
	if(limit == 0){
		sb.append(count-1);
	}else{
		sb.append(limit);
	}
	sb.append("/");
	sb.append(count);
	return sb.toString();
}