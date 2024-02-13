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
        cl.insertFirstNode("일");
        cl.printList();
        cl.insertFirstNode("홍길동");
        cl.printList();

        System.out.println("(2) 수 노드 뒤에 금 노드 삽입하기");
        MyNode pre = cl.searchNode("수");
        System.out.println(pre.data);
        cl.insertMiddleNode(pre, "금");
        cl.printList();
        pre = cl.searchNode("수");
        cl.insertMiddleNode(pre, "김재민");
        cl.printList();

        System.out.println("(3) 수 노드를 삭제하세요.");
        MyNode deletePreNode = cl.searchPreNode("수");
        System.out.println(deletePreNode.data);
        MyNode deleteNode = cl.searchNode("수");
        cl.deleteNode(deletePreNode, deleteNode);
        cl.printList();
    }
}
