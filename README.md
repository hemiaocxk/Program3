# Program3
## 第四次实验
## 一、 实验目的
1. 掌握抽象类和抽象方法的定义；
2. 掌握接口的定义，并熟练掌握接口的定义形式以及接口的实现方法；
3. 掌握异常的使用方法。
## 二、 实验内容
某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。
1. 设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。
2. 设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥）
3. 编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。
- 要求：
1. 在博士研究生类中实现各个接口定义的抽象方法;
2. 对年学费和年收入进行统计，用收入减去学费，求得纳税额；
3. 国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。
4. 实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。
5.根据输入情况，要在程序中做异常处理。
## 三、 核心代码
```
代码一：
try{                 //try-catch处理异常
		if((pay-fee)<1500) {
			System.out.println("应缴纳税："+(pay-fee)*0.03);
			System.out.println("实发工资："+((pay-fee)-((pay-fee)*0.03)));
		}else if((pay-fee)>1500 && (pay-fee)<=4500){
			System.out.println("应缴纳税："+(pay-fee)*0.1);
			System.out.println("实发工资："+((pay-fee)-((pay-fee)*0.1)));
		}else if((pay-fee)>4500 && (pay-fee)<=9000) {
			System.out.println("应缴纳税："+(pay-fee)*0.2);
			System.out.println("实发工资："+((pay-fee)-((pay-fee)*0.2)));
		}
		}catch(Exception e){
			System.out.println(e.toString());
		}
```
```
代码二：：
    Doctor dr = new Doctor();
    Scanner scanner = new Scanner(System.in);	   //从键盘输入
		System.out.println("请输入要查询人的个数");
		
		int j = scanner.nextInt();
		for(int i=1;i<=j;i++){
		//初始化研究生对象
		System.out.println("请输入姓名");
		dr.name = scanner.next();		//从键盘输入获取姓名
		System.out.println("请输入年龄");
		dr.age = scanner.nextInt();	        //从键盘输入获取年龄
		System.out.println("请输入性别");
		dr.sex = scanner.next();		//从键盘输入获取性别
```
## 四、 实验结果
![RUNOOB 图标](https://p.qlogo.cn/qqmail_head/fTW3oLibWre2icgHmMng0BEl2Oia3O6E8xxmjAlNpvV2V62FtqKEJ18aFtRrtO2O5Ay46Y1iau2DIicM/0)
## 五、 实验感想
此次实验我掌握了掌握抽象类和抽象方法的定义以及对接口的定义，并能熟练掌握接口的定义形式以及接口的实现方法，同时也掌握了try-catch处理异常的使用方法。



