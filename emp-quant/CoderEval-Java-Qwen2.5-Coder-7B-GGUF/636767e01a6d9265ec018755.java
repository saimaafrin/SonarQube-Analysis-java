class Generated {
    private Map<String,Object> buildContent(JsonObject jsonObject){
    Map<String,Object> content = new HashMap<String,Object>();  
        for (Map.Entry<String,JsonElement> entry : jsonObject.entrySet()) {  
            String key = entry.getKey();  
            JsonElement value = entry.getValue();  
            if (value.isJsonObject()) {  
                content.put(key, buildContent(value.getAsJsonObject()));  
            } else if (value.isJsonArray()) {  
                content.put(key, buildArray(value.getAsJsonArray()));  
            } else if (value.isJsonPrimitive()) {  
                content.put(key, value.getAsJsonPrimitive().toString());  
            } else if (value.isJsonNull()) {  
                content.put(key, null);  
            }  
        }  
        return content;  
    }
}
