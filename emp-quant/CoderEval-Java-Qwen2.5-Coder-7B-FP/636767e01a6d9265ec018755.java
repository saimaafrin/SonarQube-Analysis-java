private Map<String,Object> buildContent(JsonObject jsonObject){
Map<String, Object> content = new HashMap<>();
    for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
        String key = entry.getKey();
        JsonElement value = entry.getValue();
        if (value.isJsonObject()) {
            // Recursively process nested JsonObject
            content.put(key, buildContent(value.getAsJsonObject()));
        } else if (value.isJsonArray()) {
            // Process JsonArray
            List<Object> arrayContent = new ArrayList<>();
            for (JsonElement element : value.getAsJsonArray()) {
                if (element.isJsonObject()) {
                    arrayContent.add(buildContent(element.getAsJsonObject()));
                } else {
                    arrayContent.add(element.getAsString());
                }
            }
            content.put(key, arrayContent);
        } else {
            // Handle primitive values
            content.put(key, value.getAsString());
        }
    }
    return content;
}