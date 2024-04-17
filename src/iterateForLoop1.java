import java.util.Stack;
public class iterateForLoop1 {
        static void push(Stack <Integer> s1) {
                for (int i = 0; i < 5; i++) {
                        System.out.println("Pushing :- "+i);
                }
        }
        public static void main(String[] args) {
            Stack<Integer> s1 = new Stack<>();
            push(s1);
    }
}
