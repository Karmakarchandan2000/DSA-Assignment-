package com.DSAssignment;

import java.util.Scanner;

public class RevereseArray{
public static void main(String[] args){
int n;
Scanner s = new Scanner(System.in);
System.out.print("Enter no. of elements you want in array :");
n = s.nextInt();
int a[] = new int[n+1];
System.out.println(" Enter all the elements: ");

for(int i = 0; i < n; i++){
a[i] = s.nextInt();
}

System.out.print("Reversed array is :");

for(int i = n-1; i >= 0; i--){
System.out.print(a[i] +  " ");
}

}
}
