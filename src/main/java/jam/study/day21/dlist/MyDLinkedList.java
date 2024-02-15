package jam.study.day21.dlist;

public class MyDLinkedList {
    private DLNode DL = null;
    public void insertNode(String data) {

        DLNode newNode = new DLNode(data);

        if (DL == null) {  // 처음 넣는 경우
            DL = newNode;
        } else {  // 기존에 있는데 넣는 경우
            DLNode temp = DL;
            while (temp.getRlink() != null) {
                temp = temp.getRlink();
            }
            DLNode pre = temp;
            pre.setRlink(newNode);
            newNode.setLlink(pre);
        }


    }

    public void printDList() {
        DLNode temp = DL;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getRlink();
        }
        System.out.println();
    }

    public DLNode searchNode(String data) {
        DLNode temp = DL;
        DLNode pre = null;

        while (temp != null) {
            if (temp.getData() == data) {
                pre = temp;
                break;
            }
            temp = temp.getRlink();
        }
        return pre;
    }

    public void insertMiddleNode(DLNode pre, String data) {
        DLNode newNode = new DLNode(data);

        if (DL == null){
            DL = newNode;
        } else {
            newNode.setRlink(pre.getRlink());
            pre.getRlink().setLlink(newNode);
            pre.setRlink(newNode);
            newNode.setLlink(pre);
        }

    }

    public void insertFirstNode(String data) {
        DLNode newNode = new DLNode(data);
        newNode.setRlink(DL);
        DL.setLlink(newNode);
        DL = newNode;
    }

    public void deleteNode(DLNode deleteNode) {
        if (deleteNode == DL) {
            DL = deleteNode.getRlink();
        } else {
            DLNode pre = deleteNode.getLlink();
            DLNode post = deleteNode.getRlink();
            post.setLlink(pre);
            pre.setRlink(deleteNode.getRlink());
        }
    }
}
