import java.util.Stack;
public class Search {
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
        System.out.println("Position of 10000  :- "+s1.search(10000));
        System.out.println("Position of 100    :- "+s1.search(100));
        System.out.println("Position of Mazda  :- "+s2.search("Mazda"));
        System.out.println("Position of Hybrid :- "+s2.search("Hybrid"));
    }
}

