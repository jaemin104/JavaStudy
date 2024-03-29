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
        ListNode newNode = new ListNode(day);

        if(head == null) {
            head = newNode;
        } else {
            newNode.link = pre.link;
            pre.link = newNode;
        }
    }

    public void insertFirstNode(String day) {
        ListNode newNode = new ListNode(day);
        newNode.link = head;
        head = newNode;
    }

    public void deleteNode(ListNode deleteNode) {
        ListNode pre;
        ListNode temp = head;

        if (head == null) {
            System.out.println("리스트에 노드가 없습니다.");
        } else if (head == deleteNode) {
            head = deleteNode.link;
        } else {
            while (temp.link != null) {
                if (temp.link == deleteNode) {
                    pre = temp;
                    pre.link = deleteNode.link;
                } else {
                    temp = temp.link;
                }
            }

        }

//        if (head == null) {
//            System.out.println("리스트에 노드가 없습니다.");
//        } else {
//            if (temp.link == null) {
//                pre = null;
//                pre.link = deleteNode.link;
//            } else {
//                L1 : while (temp.link != null) {
//                    temp = temp.link;
//                    if (temp.link == deleteNode) {
//                        pre = temp;
//                        pre.link = deleteNode.link;
//                        break L1;
//                    }
//                }
//
//            }
//
//
//        }

//        if (head == null) {
//            System.out.println("리스트에 노드가 없습니다.");
//        } else {
//            while (temp != null) {
//                if (temp == deleteNode) {
//                    temp = head.link;
//                } else if (temp.link == deleteNode) {
//                    pre = temp;
//                    pre.link = temp.link;
//                }
//            }
//        }


    }

    public void reverse() {
        ListNode next = head;
        ListNode current = null;
        ListNode pre = null;

        while (next != null) {
            pre = current;
            current = next;
            next = next.link;
            current.link = pre;
        }
        head = current;
    }
}
