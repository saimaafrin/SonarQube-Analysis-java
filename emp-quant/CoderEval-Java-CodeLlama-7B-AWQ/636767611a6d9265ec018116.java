private Set<V> intersection(Set<V> set1,Set<V> set2){
Set<V> intersection = new HashSet<V>();
    for(V v : set1){
        if(set2.contains(v)){
            intersection.add(v);
        }
    }
    return intersection;
}