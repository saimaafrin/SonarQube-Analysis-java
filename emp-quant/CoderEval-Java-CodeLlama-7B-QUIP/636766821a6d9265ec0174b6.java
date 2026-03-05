public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
if(genericType instanceof ParameterizedType){
		ParameterizedType parameterizedType=(ParameterizedType)genericType;
		Type[] typeArguments=parameterizedType.getActualTypeArguments();
		Class<?>[] arguments=new Class<?>[typeArguments.length];
		for(int i=0;i<typeArguments.length;i++){
			Type typeArgument=typeArguments[i];
			if(typeArgument instanceof TypeVariable){
				TypeVariable typeVariable=(TypeVariable)typeArgument;
				String name=typeVariable.getName();
				if(name.startsWith("?")&&name.length()>1){
					name=name.substring(1);
				}
				if(name.startsWith("T")){
					name=name.substring(1);
				}
				if(name.startsWith("_")){
					name=name.substring(1);
				}
				if(name.startsWith("$")){
					name=name.substring(1);
				}
				if(name.startsWith("&")){
					name=name.substring(1);
				}
				if(name.startsWith("*")){
					name=name.substring(1);
				}
				if(name.startsWith("+")){
					name=name.substring(1);
				}
				if(name.startsWith("-")){
					name=name.substring(1);
				}
				if(name.startsWith(".")){
					name=name.substring(1);
				}
				if(name.startsWith(":")){
					name=name.substring(1);
				}
				if(name.startsWith(";")){
}}}}}