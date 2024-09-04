import java.util.Scanner;

public class Stack{
    int top = -1;
    int n= 10;
    int a[]=new int[n];
    void push(){
        if (top ==(n-1)){
            System.out.println("Overflow");
        }
        else{
            System.out.println("enter data");
            int i =sc.nextInt();
            top = top+1;
            a[top]=1;
            System.out.println("Item inserted");
        }
    }
    void pop(){
        if (top == -1){
            System.out.println("underflow");
        }
        else{
            System.out.println("item deleted");
        }
    }
    void display(){
        System.out.println("Items are:");
        for(int j=top; j>=0; j--){
            System.out.println(a[j]);
        }

    }
}
public class Stack_Data_Structure {
    public static void main(String[] args) {
        Scanner sc =new 
        Stack s = new Stack();
    }
    
}