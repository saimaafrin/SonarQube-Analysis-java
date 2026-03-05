public static boolean equals(Point2D p1,Point2D p2){
return TOLERANCE_DOUBLE_COMPARATOR.compare(p1.x,p2.x)==0&&TOLERANCE_DOUBLE_COMPARATOR.compare(p1.y,p2.y)==0;
}