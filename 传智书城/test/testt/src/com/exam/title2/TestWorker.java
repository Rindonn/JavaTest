package com.exam.title2;

import java.util.ArrayList;

import com.exam.title2.*;

public class TestWorker {
	static ArrayList<Worker> list = new ArrayList<Worker>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker worker1 = new Worker();
		Worker worker2 = new Worker("уехЩ",22,2222);
		list.add(worker1);
		list.add(worker2);
		worker1.work();
		worker2.work(22);
		for(Worker i : list)
	    {
			System.out.println(i);
	    }

	}

}
