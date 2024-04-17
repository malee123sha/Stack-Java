import java.util.Stack;
public class stackSize2 {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        System.out.println("Before Pushing Stack 1 Size is:-"+s1.size());
        Stack <String> s2 = new Stack<>();
        System.out.println("Before Pushing Stack 2 Size is:-"+s1.size());
        s1.push(10000);
        s1.push(1000);
        s1.push(100);
        s1.push(10);
        s2.push("Mazda");
        s2.push("BMW");
        s2.push("Hybrid");
        System.out.println("Stack 1 :-"+s1);
        System.out.println("After Pushing Stack 1 Size is:-"+s1.size());
        System.out.println("Stack 2 :-"+s2);
        System.out.println("After Pushing Stack 2 Size is:-"+s2.size());
    }
}
