public static Pair<Box2D,Box2D> splitAlongXAxis(Box2D box){
//Create a new box with the same dimensions as the original box
    Box2D box1 = new Box2D(box);
    //Create a new box with the same dimensions as the original box
    Box2D box2 = new Box2D(box);
    //Set the position of the first box to be at the origin
    box1.setPosition(0,0);
    //Set the position of the second box to be at the origin
    box2.setPosition(0,0);
    //Set the width of the first box to be half of the original box
    box1.setWidth(box.getWidth()/2);
    //Set the width of the second box to be half of the original box
    box2.setWidth(box.getWidth()/2);
    //Set the height of the first box to be the same as the original box
    box1.setHeight(box.getHeight());
    //Set the height of the second box to be the same as the original box
    box2.setHeight(box.getHeight());
    //Set the position of the second box to be at the origin
    box2.setPosition(box1.getWidth(),0);
    //Return a pair of the two boxes
    return new Pair<>(box1,box2);
}