import java.util.Stack;
public class popFinal {
    public static void main(String[] args) {
        Stack <Integer> s1 = new Stack<>();
        Stack <String> s2 = new Stack<>();
        s1.push(10000);
        s1.push(1000);
        s1.push(100);
        s1.push(10);
        s2.push("Mazda");
        s2.push("BMW");
        s2.push("Hybrid");
        System.out.println("Before  :- "+s1);
        System.out.println("Before  :- " +s2);
        s1.pop();
        s2.pop();
        System.out.println("After   :- "+s1);
        System.out.println("After   :- "+s2);
        System.out.println("Pop Again!!!");
        s1.pop();
        s2.pop();
        System.out.println(s1);
        System.out.println(s2);
    }
}

