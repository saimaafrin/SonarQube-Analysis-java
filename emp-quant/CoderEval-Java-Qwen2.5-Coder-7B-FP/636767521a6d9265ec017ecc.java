public static Pair<Box2D,Box2D> splitAlongXAxis(Box2D box){
// Create a new Box2D object for the first half
    Box2D firstHalf = new Box2D(box.getX(), box.getY(), box.getWidth() / 2, box.getHeight());
    
    // Create a new Box2D object for the second half
    Box2D secondHalf = new Box2D(box.getX() + box.getWidth() / 2, box.getY(), box.getWidth() / 2, box.getHeight());
    
    // Return a pair of the two halves
    return new Pair<>(firstHalf, secondHalf);
}