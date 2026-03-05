private JsonObject convertProperties(List<KeyStringValuePair> properties){
JsonObject jsonObject = new JsonObject();
    for(KeyStringValuePair property : properties){
        jsonObject.put(property.getKey(), property.getValue());
    }
    return jsonObject;
}