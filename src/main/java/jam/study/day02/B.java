package jam.study.day02;

public class B extends A {
    private int num2;

    public B(int num1, int num2) {
        super(num1);
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
