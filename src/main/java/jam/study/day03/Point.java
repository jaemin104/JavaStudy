package jam.study.day03;

public class Point extends Object {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x) {
        this.x = this.y = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void printInfo() {
        System.out.print("Point("+x+","+y+")");
    }



    @Override
    public String toString() {

        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
