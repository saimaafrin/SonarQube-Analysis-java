private Map<String,Object> buildContent(JsonObject jsonObject){
Map<String,Object> content = new HashMap<>();
    content.put("title",jsonObject.get("title").getAsString());
    content.put("description",jsonObject.get("description").getAsString());
    content.put("image",jsonObject.get("image").getAsString());
    content.put("link",jsonObject.get("link").getAsString());
    return content;
}