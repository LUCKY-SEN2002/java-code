package DEMO;

import java.util.Random;
import java.util.Scanner;

public class luckymoney {
	static public double total1, count1 = 1;

	public static void main(String[] args) {
		System.out.println("--------΢�����t��--------");

		Scanner sc = new Scanner(System.in);
		System.out.println("   ���������ܽ��(Ԫ)��");

		double total = sc.nextDouble();
		while (total <= 0.01) {

			System.out.println("������Ľ��С��0.01�����������룡");
			double total1 = sc.nextDouble();

			total = total1;

		}

		System.out.println("   ��������������");

		int count = sc.nextInt();
		while (count <= 0) {

			System.out.println("������ĺ������Ӧ����1�������������룡");

			int count1 = sc.nextInt();
			count = (int) count1;
		}
		while ((total / count )< 0.01) {

			System.out.println("��������������Ϊ0.01��������������������");
			System.out.println("   ��������������");
			int count1 = sc.nextInt();
			count = count1;

		}
        
		double min = 0.01;
		Random c = new Random();
		for (int i = 1; i < count; i++) {
			double max = total - (count - i) * 0.01;
			double bound = max - min;
			double safe = (double) c.nextInt((int) (bound * 100)) / 100;
			double money = safe + min;
			total = total - money;
			System.out.println("��" + i + "�����" + String.format("%.2f", money) + "Ԫ");

		}
		System.out.println("��" + count + "�����" + String.format("%.2f", total) + "Ԫ");

		sc.close();
		
	}
	}

