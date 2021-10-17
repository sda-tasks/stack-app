package pl.sda.stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack stack = new Stack();

        System.out.println(stack.length());

        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.length());

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack.length());


//        System.out.println(stack.top());
//        System.out.println(stack.isEmpty());
//
//        System.out.println(stack.pop());
//        System.out.println(stack.top());
//        System.out.println(stack.size());
    }
}
