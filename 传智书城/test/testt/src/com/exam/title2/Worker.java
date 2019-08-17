package com.exam.title2;

public class Worker {
	String name = null;
	int age = 0;
	double salary = 0.0;
	public Worker() {
		System.out.print("调用了不带参数的构造函数\n");;
	}
	public Worker(String name,int age,double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		System.out.print("调用了带初始参数的构造函数\n");
	}
	public void work() {
		System.out.print("工人在工作了（指调用了该函数）\n");;
	}
	public void work(int time) {
		this.salary = this.salary+200*time;
		System.out.print("工人的薪水增加了"+200*time+"，现在是"+this.salary+"\n");
	}
}
