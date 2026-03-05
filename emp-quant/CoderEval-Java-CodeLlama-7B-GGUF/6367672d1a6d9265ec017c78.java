public boolean insert(int val){
if(map.containsKey(val)){
        return false;
    }
    map.put(val, val);
    return true;
}