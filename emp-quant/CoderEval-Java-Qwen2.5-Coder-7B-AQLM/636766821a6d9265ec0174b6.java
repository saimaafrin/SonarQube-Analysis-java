public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
if(genericType instanceof ParameterizedType){  
        ParameterizedType parameterizedType = (ParameterizedType)genericType;  
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();  
        if(actualTypeArguments.length > 0){  
            Type[] resolvedTypes = new Type[actualTypeArguments.length];  
            for(int i = 0; i < actualTypeArguments.length; i++){  
                Type actualTypeArgument = actualTypeArguments[i];  
                if(actualTypeArgument instanceof TypeVariable){  
                    TypeVariable<?> typeVariable = (TypeVariable<?>)actualTypeArgument;  
                    Type[] bounds = typeVariable.getBounds();  
                    if(bounds.length > 0){  
                        Type bound = bounds[0];  
                        if(bound instanceof Class){  
                            resolvedTypes[i] = bound;  
                        }else{  
                            return null;  
                        }  
                    }else{  
                        return null;  
                    }  
                }else if(actualTypeArgument instanceof Class){  
                    resolvedTypes[i] = actualTypeArgument;  
                }else{  
                    return null;  
                }  
            }  
            return (Class<?>[])resolvedTypes;  
        }  
    }  
    return null;  
}