class Generated {
    protected GraphPath<V,E> edgeSetToTour(Set<E> tour,Graph<V,E> graph){
    List<V> vertices=new ArrayList<>(graph.vertexSet()); 
        Collections.sort(vertices,new Comparator<V>() { 
            public int compare(V v1,V v2) { 
                return Integer.compare(graph.degreeOf(v1),graph.degreeOf(v2)); 
            } 
        }); 
        V start=vertices.get(0); 
        List<E> edges=new ArrayList<>(tour); 
        Collections.sort(edges,new Comparator<E>() { 
            public int compare(E e1,E e2) { 
                return Integer.compare(graph.weight(e1),graph.weight(e2)); 
            } 
        }); 
        Map<E,Integer> edgeIndexMap=new HashMap<>(); 
        for(int i=0;i<edges.size();i++) { 
            edgeIndexMap.put(edges.get(i),i); 
        } 
        List<E> sortedEdges=new ArrayList<>(edgeIndexMap.keySet()); 
        Collections.sort(sortedEdges,new Comparator<E>() { 
            public int compare(E e1,E e2) { 
                return Integer.compare(edgeIndexMap.get(e1),edgeIndexMap.get(e2)); 
            } 
        }); 
        List<E> tourEdges=new ArrayList<>(); 
        for(E edge:sortedEdges) { 
            if(tour.contains(edge)) { 
                tourEdges.add(edge); 
            } 
        } 
        List<V> tourVertices=new ArrayList<>(); 
        tourVertices.add(start); 
        for(E edge:tourEdges) { 
            V end=edge.equals(new DefaultEdge())?null:graph.getEdgeTarget(edge); 
            tourVertices.add(end); 
        } 
        return new SimpleGraphPath<>(graph,start,tourVertices.toArray(new V[0]),true); 
    }
}
