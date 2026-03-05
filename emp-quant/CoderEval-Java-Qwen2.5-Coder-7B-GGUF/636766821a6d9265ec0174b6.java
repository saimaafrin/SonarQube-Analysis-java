public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
if(genericType instanceof ParameterizedType){  
        ParameterizedType parameterizedType = (ParameterizedType)genericType;  
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();  
        Class<?>[] resolvedArgs = new Class<?>[actualTypeArguments.length];  
        for(int i=0;i<actualTypeArguments.length;i++){  
            Type actualTypeArgument = actualTypeArguments[i];  
            if(actualTypeArgument instanceof Class){  
                resolvedArgs[i] = (Class<?>)actualTypeArgument;  
            }else if(actualTypeArgument instanceof ParameterizedType){  
                ParameterizedType parameterizedTypeArgument = (ParameterizedType)actualTypeArgument;  
                Type rawType = parameterizedTypeArgument.getRawType();  
                if(rawType instanceof Class){  
                    resolvedArgs[i] = (Class<?>)rawType;  
                }else{  
                    return null;  
                }  
            }else{  
                return null;  
            }  
        }  
        return resolvedArgs;  
    }else{  
        return null;  
    }  
}  
```