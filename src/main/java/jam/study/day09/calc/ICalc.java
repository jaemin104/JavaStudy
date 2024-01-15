package jam.study.day09.calc;

public interface ICalc {

    public static final int MAX = 100;
    int MIN = 1;

    public abstract int add(int a, int b);
    abstract int sub(int a, int b);
    public int mul(int a, int b);
    double div(int a, int b);


}
