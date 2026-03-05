class Generated {
    public static boolean equals(Point2D p1,Point2D p2){
    return TOLERANCE_DOUBLE_COMPARATOR.equals(p1.x,p2.x)&&TOLERANCE_DOUBLE_COMPARATOR.equals(p1.y,p2.y);
    }
}
