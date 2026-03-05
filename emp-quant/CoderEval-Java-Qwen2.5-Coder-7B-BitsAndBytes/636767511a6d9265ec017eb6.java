private OuterFaceCirculator selectOnOuterFace(Predicate<Node> predicate,Node start,Node stop,int dir){
if (dir == 1) { // Clockwise
        for (OuterFaceCirculator c = new OuterFaceCirculator(start); !c.isDone(); c.advance()) {
            if (predicate.test(c.node())) {
                return c;
            }
        }
        return null; // No node satisfying the predicate was found
    } else if (dir == -1) { // Counter-clockwise
        for (OuterFaceCirculator c = new OuterFaceCirculator(stop); !c.isDone(); c.advance()) {
            if (predicate.test(c.node())) {
                return c;
            }
        }
        return null; // No node satisfying the predicate was found
    } else {
        throw new IllegalArgumentException("Direction must be either 1 (clockwise) or -1 (counter-clockwise).");
    }
}