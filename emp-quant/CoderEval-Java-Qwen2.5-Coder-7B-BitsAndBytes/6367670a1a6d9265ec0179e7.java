public Converter lookup(final Class<?> clazz){
for(Converter c : converters){
        if(c.supports(clazz)){
            return c;
        }
    }
    return null;
} 

**Explanation:**
The `lookup` method iterates through a list of `Converter` objects stored in the `converters` field. For each converter, it checks if the converter supports the given class using the `supports` method. If a converter that supports the class is found, it is returned. If no such converter is found after checking all converters, the method returns `null`. This allows for easy retrieval of a suitable converter based on the type of class provided.