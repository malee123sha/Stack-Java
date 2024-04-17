import java.util.Stack;
public class stackSize1 {
    public static void main(String[] args) {
        Stack <String> s = new Stack<>();
        System.out.println("Before Pushing Stack Size is:- "+s.size()); //Empty Stack Size = 0
        s.push("Mazda");
        s.push("BMW");
        s.push("Hybrid");
        System.out.println("Stack  :- "+s);
        System.out.println("After Pushing Stack Size is :- "+s.size());
    }
}
