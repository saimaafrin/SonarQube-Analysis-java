class Generated {
    static String[] toNoNullStringArray(Object[] array){
    if(array.length == 0){  
            throw new IllegalArgumentException("The size of the array is zero");  
        }  
        List<String> list = new ArrayList<String>();  
        for(Object obj : array){  
            if(obj != null){  
                list.add(obj.toString());  
            }  
        }  
        return list.toArray(new String[list.size()]);  
    }
}
