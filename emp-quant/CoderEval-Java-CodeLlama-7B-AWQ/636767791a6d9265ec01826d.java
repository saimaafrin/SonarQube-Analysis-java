public static String findAndSubst(String key,Properties props){
String value=props.getProperty(key);
    if(value==null)
        return key;
    else
        return substitute(value,props);
}