public class Cube {
    private int side;
    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        checkSide(side);
        this.side = side;
    }
    public int calculateSurfaceArea() {
        return 6 * side * side;
    }
    public int calculateVolume() {
        return side * side * side;
    }
    public String toString() {
        return "Cube{side=" + side + "}";
    }
    public void constantSide() {
        this.side = 1;
    }
    public void newSide(int newSide) {
        checkSide(newSide);
        this.side = newSide;
    }
    public void checkSide(int newSide) {
        if (newSide < 1) {
            throw new IllegalStateException("A cube's side length must be equal to or greater than 1!");
        }
    }
}
