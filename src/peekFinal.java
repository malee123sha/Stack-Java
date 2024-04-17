import java.util.Stack;
public class peekFinal {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack <String> s2 = new Stack<>();
        s1.push(10000);
        s1.push(1000);
        s1.push(100);
        s1.push(10);
        s2.push("Mazda");
        s2.push("BMW");
        s2.push("Hybrid");
        System.out.println("Top Element Stack 1 :- "+s1.peek());
        System.out.println("Top Element Stack 2 :- "+s2.peek());
    }
}
