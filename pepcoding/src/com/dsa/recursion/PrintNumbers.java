package com.dsa.recursion;
/*
print-decreasing-numbers-using-recursion/video
https://www.pepcoding.com/resources/data-structures-and-algorithms/recursion/print-decreasing-numbers-using-recursion/video
Mathematical function like f(x)= f(x)+2 or x^2
PMI concept= principle of mathematical
1.whole number prove(lhs=rhs)
2.assume for k it is true (lhs=rhs)
3.proof that for k+1 it is true (lhs=rhs)
example f(x)= n(n+1)/2

recursion
concept: expectation=  do work +faith

*/

public class PrintNumbers {

    static void printDecreasing(int n)
    {
        if(n==0)// base case
            return;
        System.out.println(n);// work
        printDecreasing(n-1);//faith

    }
    static void printIncreasing(int n)
    {
        if(n==0)// base case
            return;
        printIncreasing(n-1);//faith
        System.out.println(n);// work
    }
    static void printDecreasingIncreasing(int n)
    {
        if(n==0)// base case
            return;
        System.out.println(n);// work
        printDecreasingIncreasing(n-1);//faith
        System.out.println(n);// work
    }

    public static void main(String str[])
    {
        printDecreasing(5);
        System.out.println("-----");
        printIncreasing(5);
        System.out.println("-----");
        printDecreasingIncreasing(5);
        }
}
