@Override public int compare(Double o1,Double o2){
return Math.abs(o1-o2)<epsilon?0:Double.compare(o1,o2);}