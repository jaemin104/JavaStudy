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


    public MyNode searchNode(String data) {
        MyNode temp = cl;

        while (true) {
            if (temp.data == data) {
                return temp;
            }
            temp = temp.link;
            if (temp.link == cl) {
                break;
            }
        }
        return temp;
    }


    public void insertMiddleNode(MyNode pre, String data) {
        MyNode newNode = new MyNode(data);

        if(cl == null) {
            cl = newNode;
        } else {
            newNode.link = pre.link;
            pre.link = newNode;
        }
    }

    public MyNode searchPreNode(String data) {
        MyNode temp = cl;
        MyNode pre = null;

        while (true) {
            if (temp.link.data == data) {
                pre = temp;
                break;
            } else {
                temp = temp.link;
            }
        }
        return pre;
    }


    public void deleteNode(MyNode deletePreNode) {
        MyNode deleteNode = deletePreNode.link;

        deletePreNode.link = deleteNode.link;
        if (deleteNode == cl) {
            cl = deleteNode.link;
        }

    }
}
