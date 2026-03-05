public boolean insert(int val){
if(!map.containsKey(val)){
        map.put(val,val);
        return true;
    }
    else{
        return false;
    }
}