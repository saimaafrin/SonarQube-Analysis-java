public static Pair<Box2D,Box2D> splitAlongXAxis(Box2D box){
// Create a new box with the same y and z dimensions as the original box
    Box2D box1 = new Box2D(box.y, box.z);
    // Set the x dimension of the new box to half of the original box's x dimension
    box1.x = box.x / 2;
    // Create another new box with the same y and z dimensions as the original box
    Box2D box2 = new Box2D(box.y, box.z);
    // Set the x dimension of the new box to the remaining half of the original box's x dimension
    box2.x = box.x - box1.x;
    // Return a pair of the two new boxes
    return new Pair<>(box1, box2);
}