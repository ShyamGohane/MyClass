package com.MyClass;

public class MyClass {
static int x;
public void getMyClass(int a, int b) {
	x=a+b;
	System.out.println(x);
}
public static void main(String[] args) {
	MyClass mc=new MyClass();
	mc.getMyClass(25, 35);
}
}
