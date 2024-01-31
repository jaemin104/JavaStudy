package jam.study.day16.vector;

import java.util.Scanner;
import java.util.Vector;

public class FamilyMain {
    public static void main(String[] args) {

        // 벡터는 배열이랑 비슷한데 벡터는 크기 자동 조절이 되고 배열은 못 바꾼다.

        Family father = new Family("김기태", 53, "아빠");
        Family mother = new Family("박승희", 48, "엄마");
        Family daughter1 = new Family("김지민", 23, "큰딸");
        Family daughter2 = new Family("김재민", 21, "막내");

        Vector<Family> familyVector = new Vector<>();
        familyVector.add(father);
        familyVector.add(mother);
        familyVector.add(daughter1);
        familyVector.add(daughter2);

        int ageSum = 0;
        for (Family family : familyVector) {
            ageSum += family.getAge();
        }

        System.out.println("나이의 합 : " + ageSum);

        System.out.print("나이를 알고 싶은 role을 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();


        for (Family family : familyVector) {
            if (input.equals(family.getRole())) {
                System.out.println(family.getAge());
            }
        }
    }
}
