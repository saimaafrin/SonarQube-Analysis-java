public static Pair<Box2D,Box2D> splitAlongXAxis(Box2D box){
// Calculate the new width for each half
    float newWidth = box.getWidth() / 2;
    
    // Create the first half of the box
    Box2D firstHalf = new Box2D(box.getX(), box.getY(), newWidth, box.getHeight());
    
    // Create the second half of the box
    Box2D secondHalf = new Box2D(box.getX() + newWidth, box.getY(), newWidth, box.getHeight());
    
    // Return both halves as a pair
    return new Pair<>(firstHalf, secondHalf);
}