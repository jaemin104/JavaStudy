package jam.study.day03;

public class ColorPoint extends Point {
    private String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        this.printInfo();
        return "ColorPoint{" +
                "color='" + color + '\'' +
                '}';
    }
    public void printColorInfo() {
        this.printInfo();
        System.out.println("--"+color);
    }
}
