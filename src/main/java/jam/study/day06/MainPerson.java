package jam.study.day06;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);

        Person p = Person.builder()
                .name("김재민")
                .age(21)
                .phone("1234-1234")
                .role("막내딸")
                .weight(44)
                .build();
    }
}
