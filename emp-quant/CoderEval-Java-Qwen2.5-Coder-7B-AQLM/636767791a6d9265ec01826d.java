class Generated {
    public static String findAndSubst(String key,Properties props){
    String value=props.getProperty(key);if(value==null){return key;}try{StringBuffer buffer=new StringBuffer();int start=0;int end=0;while(start!=-1){end=value.indexOf("${",start);if(end==-1){buffer.append(value.substring(start));break;}buffer.append(value.substring(start,end));start=value.indexOf("}",end);if(start==-1){buffer.append(value.substring(end));break;}buffer.append(value.substring(end+1,start));start++;}return buffer.toString();}catch(Exception e){return value;}}
}
