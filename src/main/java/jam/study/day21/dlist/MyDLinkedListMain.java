package jam.study.day21.dlist;

import java.util.LinkedList;

public class MyDLinkedListMain {
    public static void main(String[] args) {

        System.out.println("(1) 공백 리스트에 노드 3개 삽입하기");
        MyDLinkedList week = new MyDLinkedList();

        week.insertNode("월");
        week.insertNode("화");
        week.insertNode("수");
        week.printDList();

        System.out.println("(2) 화 노드 뒤에 화.5 노드 삽입하기");
        DLNode pre = week.searchNode("화");
        System.out.println("pre : " + pre.getData());
        week.insertMiddleNode(pre, "화.5");
        week.printDList();

        System.out.println("(3) 첫번째 위치에 '시작'이라는 단어를 삽입하세요.");
        week.insertFirstNode("시작");
        week.printDList();

        System.out.println("(4) 시작 노드를 삭제하세요.");
        DLNode deleteNode = week.searchNode("시작");
        week.deleteNode(deleteNode);
        week.printDList();


    }

}
