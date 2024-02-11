package jam.study.day20.circlelist;

import jam.study.day19.list.ListNode;

public class MyCircleList {
    private MyNode cl = null;

    public void insertFirstNode(String data) {

        MyNode newNode = new MyNode(data);

        // 1. 공백 리스트인 경우
        if (cl == null) {
            cl = newNode;
            newNode.link = newNode;
        }
        // 2. 공백이 아닌 경우
            else {
                MyNode temp = cl;
                while (temp.link != cl) {
                    temp = temp.link;
                }
                temp.link = newNode;
                newNode.link = cl;
                cl = newNode;

        }
    }

    public void printList() {
        MyNode temp = cl;
        while (true) {
            System.out.print(temp.getData() + " ");
            if (temp.link == cl) {
                break;
            }
            temp = temp.link;
        }
        System.out.println();
    }

//    public void printList() {
//        MyNode temp = cl;
//        System.out.print("List = (");
//        while (temp.link != cl) {
//            System.out.print(temp.getData());
//            temp = temp.link;
//            if (temp != null) {
//                System.out.print(", ");
//            }
//        }
//        System.out.println(")");
//    }


}
