public static String findAndSubst(String key,Properties props){
String value=props.getProperty(key);
	if(value==null){
		return null;
	}
	String result=value;
	try{
		result=StringUtil.substitute(value,props);
	}catch(Exception e){
		return value;
	}
	return result;
}