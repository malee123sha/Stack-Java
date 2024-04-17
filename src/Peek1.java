import java.util.Stack;
public class Peek1 {
    public static void main(String[] args) {
        Stack <String> s2 = new Stack<>();
        s2.push("BMW");
        s2.push("Hybrid");
        s2.push("Mazda");
        System.out.println("Top Element is :- "+s2.peek());
    }
}
