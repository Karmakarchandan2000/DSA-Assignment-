
package com.DSAssignment;

public class  FindPairsArray {
public static void main(String args[])
{
int[] arr = { 2,6,8,-5,-2,13};
int sum = 8;
getPairsCount(arr, sum);
}

public static void getPairsCount(int[] arr, int sum)
{

int count = 0;
for (int i = 0; i < arr.length; i++)
for (int j = i + 1; j < arr.length; j++)
if ((arr[i] + arr[j]) == sum)
{
System.out.println("Pairs "+ arr[i] +" "+ arr[j]);
count++;
}
System.out.println("Count of pairs is : "+ count);
}
}
