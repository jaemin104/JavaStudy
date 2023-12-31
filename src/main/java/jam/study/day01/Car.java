package jam.study.day01;
/*한줄복사 커맨드d
생성자 게터세터 커맨드n
실행 컨트롤r
퀵픽스 옵션엔터
한줄삭제, 맥 롬복 설치 방법 인식이 안됨
 */

public class Car {
    private String name;
    private int price;
    private String brand;

    public Car() {}

    public Car(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo() {
        System.out.println("차 이름: "+name);
        System.out.println("차 가격: "+price);
        System.out.println("차 브랜드: "+brand);
    }

    public String printInfo2() {
        return "차 이름: "+name+", 차 가격: "+price;
    }
}

