package jam.study.day22;

public class LinkedStackMain {
    public static void main(String[] args) {
        String deletedItem;
        LinkedStack stack = new LinkedStack();
        stack.push("AAA");
        stack.printStack();

        stack.push("BBB");
        stack.push("CCC");
        stack.printStack();

        deletedItem = stack.pop();
        deletedItem = stack.pop();
        deletedItem = stack.pop();
        deletedItem = stack.pop();
        if (deletedItem != null) {
            System.out.println(deletedItem);
        }
        stack.printStack();

    }
}
