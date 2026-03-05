class Generated {
    public static Pair<Box2D,Box2D> splitAlongXAxis(Box2D box){
    // Create a new box with the same dimensions as the original box
        Box2D box1 = new Box2D(box);
        Box2D box2 = new Box2D(box);
        
        // Calculate the new x position for the center of the second box
        float newX = box.getX() + box.getWidth() / 2;
        
        // Set the new x position for the center of the second box
        box2.setX(newX);
        
        // Calculate the new width for the first box
        float newWidth = box.getWidth() / 2;
        
        // Set the new width for the first box
        box1.setWidth(newWidth);
        
        // Calculate the new width for the second box
        float newWidth2 = box.getWidth() / 2;
        
        // Set the new width for the second box
        box2.setWidth(newWidth2);
        
        // Return the two boxes as a pair
        return new Pair<>(box1, box2);
    }
}
