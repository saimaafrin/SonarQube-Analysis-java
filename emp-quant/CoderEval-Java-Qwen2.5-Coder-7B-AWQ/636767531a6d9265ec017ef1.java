public static boolean equals(Point2D p1,Point2D p2){
if(p1==null||p2==null){
        throw new NullPointerException("Input Point2D cannot be null");
    }
    return TOLERANCE_DOUBLE_COMPARATOR.compare(p1.getX(),p2.getX())==0&&TOLERANCE_DOUBLE_COMPARATOR.compare(p1.getY(),p2.getY())==0;
}