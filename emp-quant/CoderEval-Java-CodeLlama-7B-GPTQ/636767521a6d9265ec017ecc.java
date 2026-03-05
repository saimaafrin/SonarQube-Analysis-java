public static Pair<Box2D,Box2D> splitAlongXAxis(Box2D box){
double x = box.getX();
	double y = box.getY();
	double width = box.getWidth();
	double height = box.getHeight();
	double x2 = x + width/2;
	double y2 = y + height/2;
	Box2D box1 = new Box2D(x,y,x2,y2);
	Box2D box2 = new Box2D(x2,y,width/2,height);
	return new Pair<Box2D,Box2D>(box1,box2);
}