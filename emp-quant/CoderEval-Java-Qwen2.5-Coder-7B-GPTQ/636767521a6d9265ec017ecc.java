class Generated {
    public static Pair<Box2D,Box2D> splitAlongXAxis(Box2D box){
    double halfWidth = box.getWidth() / 2;
        Box2D leftBox = new Box2D(box.getX(), box.getY(), halfWidth, box.getHeight());
        Box2D rightBox = new Box2D(box.getX() + halfWidth, box.getY(), halfWidth, box.getHeight());
        return new Pair<>(leftBox, rightBox);
    }
}
