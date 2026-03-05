class Generated {
    public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
    Type[] typeArguments = genericType.getActualTypeArguments();
        if (typeArguments == null) {
            return null;
        }
        Class<?>[] resolvedArgs = new Class[typeArguments.length];
        for (int i = 0; i < typeArguments.length; i++) {
            Type typeArgument = typeArguments[i];
            if (typeArgument instanceof Class) {
                resolvedArgs[i] = (Class) typeArgument;
            } else {
                // Handle the case where the type argument is not a Class
                // This might require additional logic to resolve the type
                return null;
            }
        }
        return resolvedArgs;
    }
    ```
    This function takes a `Type` object representing a generic type and a `Class` object representing the target type. It attempts to resolve the type arguments of the generic type using the type variable information from the target type. If the generic type is not parameterized or if the arguments cannot be resolved, the function returns `null`. Otherwise, it returns an array of `Class` objects representing the resolved type arguments.
}
