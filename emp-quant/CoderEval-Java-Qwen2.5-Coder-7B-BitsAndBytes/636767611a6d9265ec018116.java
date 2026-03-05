private Set<V> intersection(Set<V> set1,Set<V> set2){
Set<V> result = new HashSet<>();
    for(V item : set1){
        if(set2.contains(item)){
            result.add(item);
        }
    }
    return result;
}