private Map<String,Object> buildContent(JsonObject jsonObject){
Map<String,Object> content = new HashMap<String,Object>();  
    for(String key : jsonObject.keySet()){  
        Object value = jsonObject.get(key);  
        if(value instanceof JsonObject){  
            content.put(key, buildContent((JsonObject)value));  
        }else if(value instanceof JsonArray){  
            content.put(key, buildContent((JsonArray)value));  
        }else{  
            content.put(key, value);  
        }  
    }  
    return content;  
}