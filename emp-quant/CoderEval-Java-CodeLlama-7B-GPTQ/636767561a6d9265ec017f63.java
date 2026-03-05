@Override public boolean hasNext(){
for(int i = 0; i < adjacencyList.size(); i++){
        if(!visited[i]){
            return true;
        }
    }
    return false;
}