package jam.study.day20.circlelist;

import jam.study.day19.list.ListNode;
import jam.study.day19.list.MyLinkedList;

public class MyCircleListMain {
    public static void main(String[] args) {
        MyCircleList cl = new MyCircleList();
        System.out.println("(1) 공백 리스트에 노드 3개 삽입하기");
        cl.insertFirstNode("월");
        cl.printList();
        cl.insertFirstNode("수");
        cl.printList();
        cl.insertFirstNode("금");
        cl.printList();
        cl.insertFirstNode("홍길동");
        cl.printList();
    }
}
