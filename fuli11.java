package fuli11;

import java.util.Scanner;

public class fuli11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("** 请选择计算方式（1、复利2、单利 **");
		int j=scanner.nextInt();
		if(j==1){
		System.out.println("** 请输入多少年 **");
		int years= scanner.nextInt();
		System.out.println("** 请输入正确的金额 **");
		double money=scanner.nextDouble();
		double sum=0;
		System.out.println("** 请输入年利率 **");
		double r=scanner.nextDouble();
		for(int i = 1 ; i<=years; i++){
			   sum = (1+ r) * i *money; 
			   System.out.println("存入第"+i+"年后的存款总额为："+sum);
			  }
		System.out.println("是否要算本金？是为1，否为0");
		int h=scanner.nextInt();
		if(h==1){
			System.out.println("** 请输入多少年 **");
			int years0= scanner.nextInt();
			System.out.println("** 请输入年利率 **");
			double r0=scanner.nextDouble();
			System.out.println("** 请输入正确的想要的总额 **");
			double sum0=scanner.nextDouble();
			double money0=0;
			money0=sum0/((1+r0)*years0);//P=F/(1+i)^n
			System.out.println("存入第"+years0+"年后的所需存款总额为："+money0);
			
		}

	}
		else{
			System.out.println("** 请输入多少年 **");
			int years1= scanner.nextInt();
			System.out.println("** 请输入正确的金额 **");
			double money1=scanner.nextDouble();
			double sum=0;
			System.out.println("** 请输入年利率 **");
			double r1=scanner.nextDouble();
			for(int i = 1 ; i<=years1; i++){
				   sum = (1+ r1*i)*money1; 
				  System.out.println("存入第"+i+"年后的存款总额为："+sum);
			}
			System.out.println("是否要算本金？是为1，否为0");
			int h=scanner.nextInt();
			if(h==1){
				System.out.println("** 请输入多少年 **");
				int years0= scanner.nextInt();
				System.out.println("** 请输入年利率 **");
				double r0=scanner.nextDouble();
				System.out.println("** 请输入正确的想要的总额 **");
				double sum0=scanner.nextDouble();
				double money0=0;
				money0=sum0/(1-r0*years0);
				System.out.println("存入第"+years0+"年后的所需存款总额为："+money0);
				
			}
			
		}
	}

}
