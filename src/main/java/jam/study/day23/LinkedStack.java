package jam.study.day23;

public class LinkedStack implements MyStack{
    private StackNode top;

    public boolean isEmpty() {
        return (top == null);
    }

    @Override
    public void push(char item) {
        StackNode newNode = new StackNode();
        newNode.data = item;
        newNode.link = top;
        top = newNode;

    }

    @Override
    public char pop() {
        if(isEmpty()) {
            System.out.println("노드가 없습니다.");
            return 0;
        } else {
            char item = top.data;
            top = top.link;
            return item;
        }

    }

    @Override
    public void delete() {
        if (isEmpty()) {
            System.out.println("노드가 없습니다.");

        } else {
            top = top.link;
        }
    }

    @Override
    public char peek() {
        if(isEmpty()){
            System.out.println("노드가 없습니다.");
            return 0;
        } else
            return top.data;
    }

    public void printStack(){
        if (isEmpty())
            System.out.printf("노드가 없습니다.");
        else {
            StackNode temp = top;
            System.out.println("Linked Stack : ");
            while (temp != null) {
                System.out.printf("\t %c \n", temp.data);
                temp = temp.link;
            }
            System.out.println();
        }
    }

}
