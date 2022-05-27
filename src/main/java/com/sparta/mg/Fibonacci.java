package com.sparta.mg;

public class Fibonacci {

//    public static void main(String[] args) {
//        System.out.println(getFibonacci(50));
//    }
    public static Integer getFibonacci(Integer reqFibonNumber) {
    Integer nthFibon = 0;

    if (reqFibonNumber == null)
        nthFibon = 0;
    if (reqFibonNumber <= 0)
        nthFibon = 0;
    else if (reqFibonNumber <=2)
        nthFibon = 1;
    else
        return getFibonacci(reqFibonNumber-1) + getFibonacci(reqFibonNumber - 2);

    return nthFibon;
    }
}