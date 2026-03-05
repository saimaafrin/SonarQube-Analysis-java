class Generated {
    public static String encodeTemplateNames(String s){
    StringBuilder sb = new StringBuilder();
    	int i = 0;
    	while(i < s.length()){
    		char c = s.charAt(i);
    		if(c == '{'){
    			sb.append("{{");
    		}else if(c == '}'){
    			sb.append("}}");
    		}else{
    			sb.append(c);
    		}
    		i++;
    	}
    	return sb.toString();
    }
}
