class Generated {
    public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
    if(genericType instanceof ParameterizedType){
            ParameterizedType pType = (ParameterizedType)genericType;
            Type[] actualTypeArguments = pType.getActualTypeArguments();
            if(actualTypeArguments.length == 0){
                return null;
            }
            Class<?>[] result = new Class[actualTypeArguments.length];
            for(int i=0;i<actualTypeArguments.length;i++){
                Type argType = actualTypeArguments[i];
                if(argType instanceof Class){
                    result[i] = (Class<?>)argType;
                }else if(argType instanceof ParameterizedType){
                    ParameterizedType pt = (ParameterizedType)argType;
                    Type rawType = pt.getRawType();
                    if(rawType instanceof Class){
                        result[i] = (Class<?>)rawType;
                    }
                }else{
                    return null;
                }
            }
            return result;
        }else{
            return null;
        }
    }
}
