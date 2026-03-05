public static Pair<Box2D,Box2D> splitAlongXAxis(Box2D box){
Pair<Box2D,Box2D> result = new Pair<Box2D,Box2D>();
	result.set(0,box.clone());
	result.set(1,box.clone());
	result.get(0).set(0,box.get(0).get(0));
	result.get(0).set(1,box.get(0).get(1));
	result.get(1).set(0,box.get(0).get(0));
	result.get(1).set(1,box.get(0).get(1));
	return result;
}