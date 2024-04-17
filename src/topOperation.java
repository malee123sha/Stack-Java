import java.util.Stack;
public class topOperation {
    public static int topElement(Stack<Integer>s) {
        return s.peek();
    }
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(10000);
        //System.out.println(topElement(s));
        s.push(5500);
        System.out.println(topElement(s));
        s.push(200);
        System.out.println(topElement(s));
        s.push(10);
        s.push(5);
        System.out.println(topElement(s));
    }
}
