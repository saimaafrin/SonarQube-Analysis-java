@Override public boolean hasNext(){
for(int i = 0; i < adj.length; i++){
        if(!visited[i]){
            return true;
        }
    }
    return false;
}