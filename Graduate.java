package com;

import java.util.Scanner;

public class Graduate implements StudentInterface,TeacherInterface{
	
	//成员变量
	String name,sex;
	int age;
	static double fee,pay;
	
	
	
	
	public void setPay(double pay) {
		// 发放薪水
		this.pay = pay * 12;
		System.out.println("实发薪水："+this.pay);
	}
	

	
	public void getPay(double pay) {
		// 查询薪水
		this.pay = pay * 12;
		System.out.println("应发薪水："+this.pay);
	}
	

	
	public void setFee(double fee) {
		// 缴纳学费
		this.fee = fee;
		System.out.println("实缴学费："+this.fee);
	}
	

	
	public void getFee(double fee) {
		//查询学费
		this.fee = fee;
		System.out.println("应缴学费："+this.fee);
	}
	
	public static void ratepaying() {
		try{
		if((pay-fee)<3000) {
			System.out.println("应纳税款"+(pay-fee)*0.03);
			System.out.println("实发工资"+((pay-fee)-((pay-fee)*0.03)));
		}else if((pay-fee)>3000 && (pay-fee)<=12000){
			System.out.println("应纳税款"+(pay-fee)*0.1);
			System.out.println("实发工资"+((pay-fee)-((pay-fee)*0.1)));
		}else if((pay-fee)>12000 && (pay-fee)<=25000) {
			System.out.println("应纳税款"+(pay-fee)*0.2);
			System.out.println("实发工资"+((pay-fee)-((pay-fee)*0.2)));
		}else if((pay-fee)>25000 && (pay-fee)<=35000) {
			System.out.println("应纳税款"+(pay-fee)*0.25);
			System.out.println("实发工资"+((pay-fee)-((pay-fee)*0.25)));
		}else if((pay-fee)>35000 && (pay-fee)<=55000) {
			System.out.println("应纳税款"+(pay-fee)*0.3);
			System.out.println("实发工资"+((pay-fee)-((pay-fee)*0.3)));
		}else if((pay-fee)>55000 && (pay-fee)<=80000) {
			System.out.println("应纳税款"+(pay-fee)*0.35);
			System.out.println("实发工资"+((pay-fee)-((pay-fee)*0.35)));
		}else if((pay-fee)>80000) {
			System.out.println("应纳税款"+(pay-fee)*0.45);
			System.out.println("实发工资"+((pay-fee)-((pay-fee)*0.45)));
		}	
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
	public static void main(String[] args) {
		//创建研究生对象
		Graduate graduate = new Graduate();
		Scanner scanner = new Scanner(System.in);	
		System.out.println("请输入要查询人的个数");
		
		int j = scanner.nextInt();
		for(int i=1;i<=j;i++){
		//初始化研究生对象
		System.out.println("请输入姓名");
		graduate.name = scanner.next();		//姓名
		System.out.println("请输入年龄");
		graduate.age = scanner.nextInt();	//年龄
		System.out.println("请输入性别");
		graduate.sex = scanner.next();		//性别
		//设置工资
		System.out.println("请输入月工资");
		double pay = scanner.nextDouble();	//月工资
		graduate.setPay(pay);
		System.out.println("请输入学费");
		double fee = scanner.nextDouble();	//学费
		graduate.setFee(fee);
		ratepaying();
		}
	}

}
