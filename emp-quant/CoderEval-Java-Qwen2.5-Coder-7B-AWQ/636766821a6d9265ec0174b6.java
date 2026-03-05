public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
if(genericType instanceof ParameterizedType){
        ParameterizedType parameterizedType = (ParameterizedType)genericType;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type rawType = parameterizedType.getRawType();

        // Check if the rawType matches the targetType
        if(!rawType.equals(targetType)){
            return null; // The targetType does not match the rawType of the parameterizedType
        }

        // Resolve each actualTypeArgument to a Class
        Class<?>[] resolvedArgs = new Class[actualTypeArguments.length];
        for(int i = 0; i < actualTypeArguments.length; i++){
            Type argType = actualTypeArguments[i];
            if(argType instanceof Class){
                resolvedArgs[i] = (Class<?>)argType;
            } else if(argType instanceof ParameterizedType){
                // Handle nested parameterized types
                resolvedArgs[i] = resolveArguments(argType, targetType);
            } else {
                // Unsupported type argument
                return null;
            }
        }

        return resolvedArgs;
    } else {
        // The genericType is not parameterized
        return null;
    }
}