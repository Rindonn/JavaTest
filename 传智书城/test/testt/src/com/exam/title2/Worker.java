package com.exam.title2;

public class Worker {
	String name = null;
	int age = 0;
	double salary = 0.0;
	public Worker() {
		System.out.print("�����˲��������Ĺ��캯��\n");;
	}
	public Worker(String name,int age,double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		System.out.print("�����˴���ʼ�����Ĺ��캯��\n");
	}
	public void work() {
		System.out.print("�����ڹ����ˣ�ָ�����˸ú�����\n");;
	}
	public void work(int time) {
		this.salary = this.salary+200*time;
		System.out.print("���˵�нˮ������"+200*time+"��������"+this.salary+"\n");
	}
}
