public boolean remove(int val){
if (map.containsKey(val)){
        map.remove(val);
        return true;
    }
    else{
        return false;
    }
}