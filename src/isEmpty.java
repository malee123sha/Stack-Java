import java.util.Stack;
public class isEmpty {
    public static boolean isEmpty(Stack<Integer>s) {
        return s.empty();
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        System.out.print("Before Pushing Elements:- ");
        if(isEmpty(s)) {
            System.out.println("Stack is Empty");
        }else{
            System.out.println("Stack is not Empty");
        }
        s.push(10000);
        s.push(1000);
        s.push(100);
        s.push(10);
        System.out.print("After Pushing Elements :- ");
        if(isEmpty(s)) {
            System.out.println("Stack is Empty");
        }else{
            System.out.println("Stack is not Empty");
        }
    }
}
