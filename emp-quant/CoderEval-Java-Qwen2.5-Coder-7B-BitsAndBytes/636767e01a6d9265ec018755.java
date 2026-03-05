private Map<String,Object> buildContent(JsonObject jsonObject){
Map<String, Object> content = new HashMap<>();  
    for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {  
        String key = entry.getKey();  
        JsonElement value = entry.getValue();  
        if (value.isJsonObject()) {  
            content.put(key, buildContent(value.getAsJsonObject()));  
        } else if (value.isJsonArray()) {  
            List<Object> list = new ArrayList<>();  
            for (JsonElement element : value.getAsJsonArray()) {  
                if (element.isJsonObject()) {  
                    list.add(buildContent(element.getAsJsonObject()));  
                } else {  
                    list.add(element.getAsString());  
                }  
            }  
            content.put(key, list);  
        } else {  
            content.put(key, value.getAsString());  
        }  
    }  
    return content;  
}  

**This method is used to convert a JsonObject to a Map<String, Object>. It recursively processes nested JsonObjects and JsonArrays. If an element is another JsonObject, it calls itself to process that JsonObject. If an element is a JsonArray, it iterates through each element in the array. If the element is another JsonObject, it calls itself to process that JsonObject; otherwise, it adds the string representation of the element to the list. Finally, it adds the key-value pair to the content map.**

**The purpose of this method is to convert a complex JSON structure into a Java object that can be easily manipulated and accessed. By using recursion, it handles nested structures without requiring additional code for each level of nesting. This makes the method versatile and applicable to various JSON structures.**