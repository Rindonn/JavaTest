package com.exam.title1;

import java.util.Arrays;

public class desc {
	public static void sort(int[]  score){
		for(int j=0;j<9;j++) {
		     for(int i=0;i<9;i++) {
		    	 if(score[i]>score[i+1]) {
		    		 score[i]=score[i]+score[i+1];
		    		 score[i+1]=score[i]-score[i+1];
		    		 score[i]=score[i]-score[i+1];
		    	 }
		     }
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]  score =  {78,45,67,65,90,76,89,58,80,39};   //��ʼ�ɼ��б�
        sort(score);  //�Գɼ����н�������
        System.out.println(Arrays.toString(score));//��ӡ����������
	}

}
