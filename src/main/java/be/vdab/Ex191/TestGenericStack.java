package be.vdab.Ex191;

public class TestGenericStack {

    public static void main(String[] args) {

        GenericStack<String> stack = new GenericStack<>();

        System.out.println("\nEMPTY STACK");
        System.out.println("getSize: " + stack.getSize());
        System.out.println("peek: " +stack.peek());
        System.out.println("isEmpty: " + stack.isEmpty());

        System.out.println("\nOVERSIZED STACK");
        stack.push("london");
        stack.push("paris");
        stack.push("brussels");
        stack.push("madrid");
        stack.push("lissabon");
        stack.push("berlin");
        stack.push("moskou");
        System.out.println("getSize: " + stack.getSize());
        System.out.println("peek: " +stack.peek());
        System.out.println("isEmpty: " + stack.isEmpty());

        System.out.println("\nSTACK AFTER POP");
        stack.pop();
        System.out.println("peek: " +stack.peek());

    }
}
