class Generated {
    private Map<String,Object> buildContent(JsonObject jsonObject){
    Map<String,Object> content = new HashMap<>();
        for(String key : jsonObject.keySet()){
            content.put(key,jsonObject.get(key));
        }
        return content;
    }
}
