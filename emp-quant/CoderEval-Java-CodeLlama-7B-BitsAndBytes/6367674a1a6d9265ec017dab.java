class Generated {
    @Override public int compare(Double o1,Double o2){
    if(Math.abs(o1-o2)<epsilon)return 0;
    return Double.compare(o1,o2);
    }
    }
}
