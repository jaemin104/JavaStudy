package jam.study.day19.list;

public class MyLinkedListMain {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        System.out.println("(1) 공백 리스트에 노드 3개 삽입하기");
        list.insertLastNode("월");
        list.insertLastNode("수");
        list.insertLastNode("일");
        list.printList();

        System.out.println("(2) 수 노드 뒤에 금 노드 삽입하기");
        ListNode pre = list.searchNode("수");
        System.out.println(pre.day);

        if (pre == null) {
            System.out.println("검색 실패");
        } else {
            list.insertMiddleNode(pre, "금");
            list.printList();
        }
    }
}
