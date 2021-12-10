package com.DSAssignment;

public class ReverseProgram{
    public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter A String Value : ");
String str = in.nextLine();
Stack<Character> stack = new Stack<>();
for(int i=0;i=str.length();i++){
    stack.push(str.charAt(i));

}
System.out.println("Reverse :");
while(!stack.empty()){
    System.out.println(stack.pop());
}
    }
}