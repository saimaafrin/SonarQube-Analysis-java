private String buildContentRange(){
StringBuilder sb = new StringBuilder();
	sb.append(offset);
	sb.append("-");
	sb.append(limit);
	sb.append("/");
	sb.append(count);
	return sb.toString();
}