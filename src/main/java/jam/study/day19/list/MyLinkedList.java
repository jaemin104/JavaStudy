package jam.study.day19.list;

public class MyLinkedList {
    private ListNode head;  // 인스턴스 변수 (영역이 전체 클래스)

    public MyLinkedList(){
        head = null;
    }

    public void insertLastNode(String day) {
        ListNode newNode = new ListNode(day);  // 새로운 노드 생성

        // 리스트가 존재하지 않는 경우
        if (head == null) {
            this.head = newNode;
            return;
        } else {
            // 기존에 리스트가 존재하는 경우
            ListNode temp = head;
            while(temp.link != null) {  // 마지막 노드 찾기
                temp = temp.link;
            }

            temp.link = newNode;  // 마지막 노드에 새 노드 추가하기
        }
    }

    public void printList() {
        ListNode temp = head;
        System.out.print("List = (");
        while (temp != null) {
            System.out.print(temp.getDay());
            temp = temp.link;
            if (temp != null) {
                System.out.print(", ");
            }
        }
        System.out.println(")");
    }

    public ListNode searchNode(String day) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.day == day) {
                return temp;
            } else {
                temp = temp.link;
            }
        }
        return temp;
    }

    public void insertMiddleNode(ListNode pre, String day) {
    }
}
