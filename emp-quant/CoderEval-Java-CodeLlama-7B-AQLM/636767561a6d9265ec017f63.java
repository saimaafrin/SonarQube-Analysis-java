class Generated {
    @Override public boolean hasNext(){
    for(int i = 0; i < numVertices; i++){
            if(!visited[i]){
                return true;
            }
        }
        return false;
    }
}
