package ex_23_Collection_DSA;

import java.util.Stack;

public class Lab127_Stack {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push("Red");
        s.push("Blue");
        s.push("Green");
        s.push("Black");
        s.push("Pink");
        s.push("Blue");

        System.out.println(s);
        s.remove("Black");
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.pop());

        System.out.println(s);

    }
}
