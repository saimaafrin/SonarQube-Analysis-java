class Generated {
    public static <V,E>IsomorphicGraphMapping<V,E> identity(Graph<V,E> graph){
    return new IsomorphicGraphMapping<V,E>(graph,graph,new IdentityMapping<V>(),new IdentityMapping<E>());}
}
