package jam.study.day22;

public interface MyStack<T> { // 인터페이스는 상수나 추상메소드 쓰는거
    boolean isEmpty();
    void push(T item);
    T pop();
    void delete();
    T peek();

}
