package com;

import java.util.Scanner;

public class Graduate implements StudentInterface,TeacherInterface{
	
	//��Ա����
	String name,sex;
	int age;
	static double fee,pay;
	
	
	
	
	public void setPay(double pay) {
		// ����нˮ
		this.pay = pay * 12;
		System.out.println("ʵ��нˮ��"+this.pay);
	}
	

	
	public void getPay(double pay) {
		// ��ѯнˮ
		this.pay = pay * 12;
		System.out.println("Ӧ��нˮ��"+this.pay);
	}
	

	
	public void setFee(double fee) {
		// ����ѧ��
		this.fee = fee;
		System.out.println("ʵ��ѧ�ѣ�"+this.fee);
	}
	

	
	public void getFee(double fee) {
		//��ѯѧ��
		this.fee = fee;
		System.out.println("Ӧ��ѧ�ѣ�"+this.fee);
	}
	
	public static void ratepaying() {
		try{
		if((pay-fee)<3000) {
			System.out.println("Ӧ��˰��"+(pay-fee)*0.03);
			System.out.println("ʵ������"+((pay-fee)-((pay-fee)*0.03)));
		}else if((pay-fee)>3000 && (pay-fee)<=12000){
			System.out.println("Ӧ��˰��"+(pay-fee)*0.1);
			System.out.println("ʵ������"+((pay-fee)-((pay-fee)*0.1)));
		}else if((pay-fee)>12000 && (pay-fee)<=25000) {
			System.out.println("Ӧ��˰��"+(pay-fee)*0.2);
			System.out.println("ʵ������"+((pay-fee)-((pay-fee)*0.2)));
		}else if((pay-fee)>25000 && (pay-fee)<=35000) {
			System.out.println("Ӧ��˰��"+(pay-fee)*0.25);
			System.out.println("ʵ������"+((pay-fee)-((pay-fee)*0.25)));
		}else if((pay-fee)>35000 && (pay-fee)<=55000) {
			System.out.println("Ӧ��˰��"+(pay-fee)*0.3);
			System.out.println("ʵ������"+((pay-fee)-((pay-fee)*0.3)));
		}else if((pay-fee)>55000 && (pay-fee)<=80000) {
			System.out.println("Ӧ��˰��"+(pay-fee)*0.35);
			System.out.println("ʵ������"+((pay-fee)-((pay-fee)*0.35)));
		}else if((pay-fee)>80000) {
			System.out.println("Ӧ��˰��"+(pay-fee)*0.45);
			System.out.println("ʵ������"+((pay-fee)-((pay-fee)*0.45)));
		}	
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
	public static void main(String[] args) {
		//�����о�������
		Graduate graduate = new Graduate();
		Scanner scanner = new Scanner(System.in);	
		System.out.println("������Ҫ��ѯ�˵ĸ���");
		
		int j = scanner.nextInt();
		for(int i=1;i<=j;i++){
		//��ʼ���о�������
		System.out.println("����������");
		graduate.name = scanner.next();		//����
		System.out.println("����������");
		graduate.age = scanner.nextInt();	//����
		System.out.println("�������Ա�");
		graduate.sex = scanner.next();		//�Ա�
		//���ù���
		System.out.println("�������¹���");
		double pay = scanner.nextDouble();	//�¹���
		graduate.setPay(pay);
		System.out.println("������ѧ��");
		double fee = scanner.nextDouble();	//ѧ��
		graduate.setFee(fee);
		ratepaying();
		}
	}

}
