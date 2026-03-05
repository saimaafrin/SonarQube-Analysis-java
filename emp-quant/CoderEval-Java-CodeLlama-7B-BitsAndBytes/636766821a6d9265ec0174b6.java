public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
if(genericType instanceof ParameterizedType){
		ParameterizedType parameterizedType=(ParameterizedType)genericType;
		Type[] actualTypeArguments=parameterizedType.getActualTypeArguments();
		Class<?>[] resolvedArguments=new Class<?>[actualTypeArguments.length];
		for(int i=0;i<actualTypeArguments.length;i++){
			Type actualTypeArgument=actualTypeArguments[i];
			Class<?> resolvedArgument=resolveArgument(actualTypeArgument,targetType);
			if(resolvedArgument==null){
				return null;
			}
			resolvedArguments[i]=resolvedArgument;
		}
		return resolvedArguments;
	}
	return null;
}