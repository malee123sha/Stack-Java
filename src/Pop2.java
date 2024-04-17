import java.util.Stack;
public class Pop2 {
     public static void main(String[] args) {
         Stack <String> s2 = new Stack<>();
         s2.push("Mazda");
         s2.push("BMW");
         s2.push("Hybrid");
         System.out.println("Before Popping :- "+s2);
         System.out.println("Popped Element is :-"+s2.pop());
         System.out.println("After Popping  :- "+s2);
         System.out.println("Pop Again!!");
         System.out.println("Popped Element is :-"+s2.pop());
         System.out.println(s2);
         System.out.println("Pop Again!!!");
         System.out.println("Popped Element is :-"+s2.pop());
         System.out.println(s2);
    }
}
