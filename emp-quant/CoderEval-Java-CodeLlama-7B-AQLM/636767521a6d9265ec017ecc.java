public static Pair<Box2D,Box2D> splitAlongXAxis(Box2D box){
double x = box.getX();
	double y = box.getY();
	double width = box.getWidth();
	double height = box.getHeight();
	double halfWidth = width/2;
	double halfHeight = height/2;
	Box2D left = new Box2D(x,y,halfWidth,halfHeight);
	Box2D right = new Box2D(x+halfWidth,y,halfWidth,halfHeight);
	return new Pair<Box2D,Box2D>(left,right);
}