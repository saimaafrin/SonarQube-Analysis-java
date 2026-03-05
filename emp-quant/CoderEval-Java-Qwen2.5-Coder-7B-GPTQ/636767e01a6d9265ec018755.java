class Generated {
    private Map<String,Object> buildContent(JsonObject jsonObject){
    Map<String, Object> content = new HashMap<>();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if(value.isJsonObject()){
                content.put(key, buildContent(value.getAsJsonObject()));
            } else if(value.isJsonArray()){
                List<Object> list = new ArrayList<>();
                for (JsonElement element : value.getAsJsonArray()) {
                    if(element.isJsonObject()){
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
}
