import java.util.Stack;

public class zFinal {
    public static boolean isEmpty(Stack<Integer>s) {
        return s.empty();
    }
    public static int topElement(Stack<Integer>s) {
        return s.peek();
    }
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        //checking size
        System.out.println("Stack Size is:-"+s.size());
        // checking "empty or not"
        if(isEmpty(s)) {
            System.out.println("Stack is Empty!!!");
        }else{
            System.out.println("Stack is not Empty!!1");
        }
        //adding elements
        s.push(100);
        s.push(200);
        s.push(300);
        s.push(3500);
        s.push(5000);
        System.out.println("Before Popping:-"+s);
        //removing elements
        System.out.println("Popped Element is :-"+s.pop());
        System.out.println("After Popping :-"+s);
        //top of the element (peek)
        System.out.println("Top Element is:- "+s.peek());
        //adding elements
        s.push(100);
        s.push(400);
        s.push(700);
        System.out.println("After Pushing :-"+s);
        //removing elements
        System.out.println("Popped Element is :-"+s.pop());
        System.out.println("After Popping :-"+s);
        //top of the element (peek)
        System.out.println("Top Element is:- "+topElement(s));
        //checking size
        System.out.println("Stack Size is :-"+s.size());
        // checking "empty or not"
        if(isEmpty(s)) {
            System.out.println("Stack is Empty!!1");
        }else{
            System.out.println("Stack is not Empty!!!");
        }
        //searching
        System.out.println("Position of 4000:-"+s.search(4000));
        System.out.println("Position of 100 :-"+s.search(100));
        System.out.println("Position of 5666:-"+s.search(5666));
        System.out.println("Position of 400 :_"+s.search(400));
        System.out.println(s);
    }
}
