import java.util.Stack;
public class Peek2 {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(10000);
        s1.push(1000);
        s1.push(100);
        s1.push(10);
        System.out.println("Top Element is :- "+s1.peek());
    }
}
