package jam.study.day01;

import jam.study.day01.Car;

public class MainCar {
    public static void main(String[] args) {
        Car car1 = new Car("sonata", 100, "hyundai");
        System.out.println(car1.getName()+", "+car1.getPrice()+", "+car1.getBrand());
        car1.printInfo();
        String info2 = car1.printInfo2();
        System.out.println(info2);

        Car car2 = new Car("520d", 200, "BMW");
        car2.setPrice(300);
        car2.printInfo();
        String s = car2.printInfo2();
        System.out.println(s);

        Car car3 = new Car();

    }

}
