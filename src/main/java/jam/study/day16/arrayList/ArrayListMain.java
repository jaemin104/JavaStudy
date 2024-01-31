package jam.study.day16.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMain {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("몇명을 입력받을까요? : ");
        int num = scanner.nextInt();

        System.out.println();
        for (int i = 0; i < num; i++) {
            System.out.print("이름을 입력하세요 : ");
            String name = scanner.next();
            arrayList.add(name);
        }


        int maxLength = 0;
        int index = 0;
        for (int i = 0; i < num; i++) {
            System.out.println(arrayList.get(i));
            if (arrayList.get(i).length() > maxLength) {
                maxLength = arrayList.get(i).length();
                index = i;
            }
        }
        System.out.println(index);
        System.out.println("제일 긴 이름은 " + arrayList.get(index));



    }
}
