class Generated {
    public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
    if(genericType instanceof ParameterizedType){
            ParameterizedType pType = (ParameterizedType)genericType;
            Type[] args = pType.getActualTypeArguments();
            Class<?>[] classes = new Class[args.length];
            for(int i=0;i<args.length;i++){
                Type arg = args[i];
                if(arg instanceof Class){
                    classes[i] = (Class<?>)arg;
                }else if(arg instanceof ParameterizedType){
                    ParameterizedType paramType = (ParameterizedType)arg;
                    Type rawType = paramType.getRawType();
                    if(rawType instanceof Class){
                        classes[i] = (Class<?>)rawType;
                    }
                }else{
                    // Handle other types of Type
                    return null;
                }
            }
            return classes;
        }else{
            return null;
        }
    }
}
