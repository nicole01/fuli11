package fuli11;

import java.util.Scanner;

public class fuli11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("** ��ѡ����㷽ʽ��1������2������ **");
		int j=scanner.nextInt();
		if(j==1){
		System.out.println("** ����������� **");
		int years= scanner.nextInt();
		System.out.println("** ��������ȷ�Ľ�� **");
		double money=scanner.nextDouble();
		double sum=0;
		System.out.println("** ������������ **");
		double r=scanner.nextDouble();
		for(int i = 1 ; i<=years; i++){
			   sum = (1+ r) * i *money; 
			   System.out.println("�����"+i+"���Ĵ���ܶ�Ϊ��"+sum);
			  }
		System.out.println("�Ƿ�Ҫ�㱾����Ϊ1����Ϊ0");
		int h=scanner.nextInt();
		if(h==1){
			System.out.println("** ����������� **");
			int years0= scanner.nextInt();
			System.out.println("** ������������ **");
			double r0=scanner.nextDouble();
			System.out.println("** ��������ȷ����Ҫ���ܶ� **");
			double sum0=scanner.nextDouble();
			double money0=0;
			money0=sum0/((1+r0)*years0);//P=F/(1+i)^n
			System.out.println("�����"+years0+"�����������ܶ�Ϊ��"+money0);
			
		}

	}
		else{
			System.out.println("** ����������� **");
			int years1= scanner.nextInt();
			System.out.println("** ��������ȷ�Ľ�� **");
			double money1=scanner.nextDouble();
			double sum=0;
			System.out.println("** ������������ **");
			double r1=scanner.nextDouble();
			for(int i = 1 ; i<=years1; i++){
				   sum = (1+ r1*i)*money1; 
				  System.out.println("�����"+i+"���Ĵ���ܶ�Ϊ��"+sum);
			}
			System.out.println("�Ƿ�Ҫ�㱾����Ϊ1����Ϊ0");
			int h=scanner.nextInt();
			if(h==1){
				System.out.println("** ����������� **");
				int years0= scanner.nextInt();
				System.out.println("** ������������ **");
				double r0=scanner.nextDouble();
				System.out.println("** ��������ȷ����Ҫ���ܶ� **");
				double sum0=scanner.nextDouble();
				double money0=0;
				money0=sum0/(1-r0*years0);
				System.out.println("�����"+years0+"�����������ܶ�Ϊ��"+money0);
				
			}
			
		}
	}

}
