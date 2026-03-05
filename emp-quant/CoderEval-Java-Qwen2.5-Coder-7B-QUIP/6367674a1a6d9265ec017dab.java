class Generated {
    @Override public int compare(Double o1,Double o2){
    double diff = o1 - o2; if (diff < epsilon) return 0; return Double.compare(o1, o2); }
}
