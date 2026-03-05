class Generated {
    public boolean remove(int val){
    if(map.containsKey(val)){
            int count = map.get(val);
            if(count == 1){
                map.remove(val);
                values.remove(val);
                return true;
            }else{
                map.put(val, count - 1);
                return false;
            }
        }else{
            return false;
        }
    }
}
