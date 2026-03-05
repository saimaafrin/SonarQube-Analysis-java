private JsonObject convertProperties(List<KeyStringValuePair> properties){
JsonObject jsonObject = new JsonObject();
    for (KeyStringValuePair keyStringValuePair : properties) {
        jsonObject.addProperty(keyStringValuePair.getKey(), keyStringValuePair.getValue());
    }
    return jsonObject;
}