package Array;

import Array.Stack;

public class stackArray {
    public static void main(String[] args){
        Stack stack = new Stack(10);
        for (Integer i=0; i<15; i++){
            stack.push(i.toString());
        }
        for (Integer i=0; i<15; i++){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
