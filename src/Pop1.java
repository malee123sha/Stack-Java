import java.util.Stack;
public class Pop1 {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(10000);
        s1.push(1000);
        s1.push(100);
        s1.push(10);
        System.out.println("Before Popping :- "+s1);
        System.out.println("Popped Element is :-"+s1.pop());
        System.out.println("After Popping  :- "+s1);
        System.out.println("Pop Again!");
        System.out.println("Popped Element is :-"+s1.pop());
        System.out.println(s1);
        System.out.println("Pop Again!!");
        System.out.println("Popped Element is :-"+s1.pop());
        System.out.println(s1);
        System.out.println("Pop Again!!!");
        System.out.println("Popped Element is :-"+s1.pop());
        System.out.println(s1);
    }
}
