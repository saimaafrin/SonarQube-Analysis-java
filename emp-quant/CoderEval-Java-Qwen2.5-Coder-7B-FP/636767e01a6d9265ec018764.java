private JsonObject convertProperties(List<KeyStringValuePair> properties){
JsonObject jsonObject = new JsonObject();  
    for(KeyStringValuePair property : properties){  
        jsonObject.addProperty(property.getKey(), property.getValue());  
    }  
    return jsonObject;  
}  

**Explanation:**
The function `convertProperties` takes a list of `KeyStringValuePair` objects as input and converts it into a `JsonObject`. Each `KeyStringValuePair` object represents a key-value pair, where the key is a string and the value is also a string.

Here's how the function works:
1. It initializes an empty `JsonObject`.
2. It iterates over each `KeyStringValuePair` in the input list.
3. For each pair, it adds the key and value to the `JsonObject` using the `addProperty` method.
4. Finally, it returns the populated `JsonObject`.

This function is useful when you need to serialize a list of properties into a JSON format, which can be easily transmitted or stored.