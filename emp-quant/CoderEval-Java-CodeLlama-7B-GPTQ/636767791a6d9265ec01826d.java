class Generated {
    public static String findAndSubst(String key,Properties props){
    String value = props.getProperty(key);
        if(value == null){
            return value;
        }
        try{
            return substitute(value,props);
        }catch(Exception e){
            return value;
        }
    }
}
