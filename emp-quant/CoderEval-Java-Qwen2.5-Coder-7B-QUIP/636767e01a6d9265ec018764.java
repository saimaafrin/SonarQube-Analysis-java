class Generated {
    private JsonObject convertProperties(List<KeyStringValuePair> properties){
    JsonObject propertiesJson = new JsonObject();
        for(KeyStringValuePair property : properties){
            propertiesJson.addProperty(property.getKey(), property.getValue());
        }
        return propertiesJson;
    }
}
