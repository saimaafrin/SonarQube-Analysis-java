class Generated {
    @Override public int compare(Double o1,Double o2){
    final double epsilon = 1e-10; final double diff = Math.abs(o1-o2); if(diff < epsilon) return 0; return Double.compare(o1,o2); }
}
