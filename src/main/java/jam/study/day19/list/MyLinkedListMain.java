package jam.study.day19.list;

public class MyLinkedListMain {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        System.out.println("(1) 공백 리스트에 노드 3개 삽입하기");
        list.insertLastNode("월");
        list.printList();
        ListNode deleteNode = list.searchNode("월");
        list.deleteNode(deleteNode);
        list.printList();
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

        System.out.println("(3) 첫번째 위치에 '시작'이라는 단어를 삽입하세요.");
        list.insertFirstNode("시작");
        list.printList();

        System.out.println("(4) 시작 노드를 삭제하세요.");
        deleteNode = list.searchNode("시작");
        list.deleteNode(deleteNode);
        list.printList();

        System.out.println("(5) 거꾸로 출력하세요.");
        list.reverse();
        list.printList();
    }
}
