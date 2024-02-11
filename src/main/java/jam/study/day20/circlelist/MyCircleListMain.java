package jam.study.day20.circlelist;

import jam.study.day19.list.ListNode;
import jam.study.day19.list.MyLinkedList;

public class MyCircleListMain {
    public static void main(String[] args) {
        MyCircleList cl = new MyCircleList();
        System.out.println("(1) 공백 리스트에 노드 3개 삽입하기");
        cl.insertLastNode("월");
        cl.printList();
        cl.insertLastNode("수");
        cl.printList();
        cl.insertLastNode("일");
        cl.printList();
    }
}
