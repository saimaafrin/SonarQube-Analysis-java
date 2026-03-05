public static Pair<Box2D,Box2D> splitAlongXAxis(Box2D box){
double x = box.getX();
		double y = box.getY();
		double width = box.getWidth();
		double height = box.getHeight();
		double x1 = x;
		double x2 = x + width/2;
		double y1 = y;
		double y2 = y + height;
		Box2D box1 = new Box2D(x1,y1,x2,y2);
		Box2D box2 = new Box2D(x2,y1,x+width,y2);
		return new Pair<Box2D,Box2D>(box1,box2);
	}
	
	/**Divide a box into two equal boxes on the y axis.**/
	public static Pair<Box2D,Box2D> splitAlongYAxis(Box2D box){
		double x = box.getX();
		double y = box.getY();
		double width = box.getWidth();
		double height = box.getHeight();
		double x1 = x;
		double x2 = x + width;
		double y1 = y;
		double y2 = y + height/2;
		Box2D box1 = new Box2D(x1,y1,x2,y2);
		Box2D box2 = new Box2D(x1,y2,x2,y+height);
		return new Pair<Box2D,Box2D>(box1,box2);
	}
	
	/**Divide a box into two equal boxes on the x and y axis.**/
	public static Pair<Pair<Box2D,Box2D>,Pair<Box2D,Box2D>> splitAlongXYAxis(Box2D box){
		double x = box.getX();
		double y = box.getY();
		double width = box.getWidth();
		double height = box.getHeight();
		double x1 = x;
		double x2 = x + width/2;
		double y1 = y;
}