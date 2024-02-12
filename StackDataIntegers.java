package myTaskJavaPackage;

import java.util.Stack;
import java.util.Scanner;

public class StackDataIntegers {

    Integer stack;
    Stack<Integer> integers = new Stack<>();
    public void pushElementStack(int[] arr){
        integers.push(stack);
    }
    public void popElementStack(){
        integers.pop();
    }
    public void checkStack(){
        if (integers.empty()){
            System.out.println("Stack is empty.");
        } else {
            System.out.println(integers);
        }
    }
    public static void main(String[] args) {

        StackDataIntegers stackData = new StackDataIntegers();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the operation to form between (add/delete/check) the stack");
        String choice = sc.nextLine();
        if(choice.equalsIgnoreCase("add")){
            System.out.println("Enter the number for add to stack: ");
            String n = sc.nextLine();
            String[] container = n.split(" ");
            int[] arr = new int[container.length];
            for (int i = 0; i <container.length ; i++) {
                arr[i] = Integer.parseInt(container[i]);
                stackData.pushElementStack(arr);
            }
        } else if(choice.equalsIgnoreCase("delete")) {
            stackData.popElementStack();
        } else if (choice.equalsIgnoreCase("check")) {
            stackData.checkStack();
        } else {
            System.out.println("Invalid operation");
        }


    }
}
