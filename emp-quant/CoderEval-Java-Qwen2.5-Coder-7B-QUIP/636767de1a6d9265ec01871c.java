class Generated {
    public void valueAccumulation(String key,Long value){
    if (map.containsKey(key)){
            map.put(key,map.get(key)+value);
        }else{
            map.put(key,value);
        }
    }
}
