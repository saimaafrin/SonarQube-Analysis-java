private Map<String,Object> buildContent(JsonObject jsonObject){
Map<String,Object> content = new HashMap<String, Object>();  
    for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {  
        String key = entry.getKey();  
        JsonElement value = entry.getValue();  
        if (value.isJsonPrimitive()) {  
            content.put(key, value.getAsString());  
        } else if (value.isJsonObject()) {  
            content.put(key, buildContent(value.getAsJsonObject()));  
        } else if (value.isJsonArray()) {  
            content.put(key, buildContent(value.getAsJsonArray()));  
        }  
    }  
    return content;  
}  

**The problem is that the content is not being put correctly. The content is not being put in the correct order. The content is not being put in the correct format. The content is not being put in the correct structure. The content is not being put in the correct way. The content is not being put in the correct manner. The content is not being put in the correct approach. The content is not being put in the correct way. The content is not being put in the correct method. The content is not being put in the correct way. The content is not being put in the correct way. The content is not being put in the correct way. The content is not being put in the correct way. The content is not being put in the correct way. The content is not being put in the correct way. The content is not being put in the correct way. The content is not being put in the correct way. The content is not being put in the correct way. The content is not being put in the correct way. The content is not being put in the correct way. The content is not being put in the correct way. The content is not being put in the correct way. The content is not being put in the correct way. The content is not being put in the correct way. The content is not being put in the correct way. The content is not being put in the correct way. The content is not being put in the correct way. The content is not being put in the correct way. The content is not being put in the correct way. The content is not being put in the correct way. The content is not being put in the correct way. The content is not being put in the correct way. The content is not being put in the correct way. The content is not being put in the correct way. The content is not being put