package demo11;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class pratise {

	static public int score;
	double input, core, q, w = 0;// ����������֣���̬����

	public static void main(String[] args) {

		DecimalFormat a1 = new DecimalFormat("#.00");

		/*
		 * System.out.println(number1); System.out.println(number2);
		 */
		int return1 = 1;

		while (return1 == 1) {
			Random q = new Random();// ��Ϸ��ʼ�����ɵ�һ�� �����
			Random w = new Random();// ���ɵڶ��������
			double number1 = q.nextDouble();
			double number2 = w.nextDouble();

			int a = q.nextInt(100);
			int b = q.nextInt(100);

			System.out.println("��������Ҫ��ս�ĵȼ���һ�������������������������֣�");// ������Ϸ�ȼ�ѡ��
			Scanner sc = new Scanner(System.in);// ����Scanner����
			int grade = sc.nextInt();// ��ȡ�ȼ�

			if (grade == 1) {// �ȼ�1
				// double number3 = (int) (number1 * 10);// �����������ת��Ϊ����
				// double number4 = (int) (number2 * 10);// �����������ת��Ϊ����
				System.out.println(a);// �������������
				System.out.println(b);// �������������
				System.out.println("������ ���������ĺ�");// ���мӷ�����
				int input = sc.nextInt();// �û����������

				if (input == a + b) {// �жϽ���Ƿ���ȷ

					System.out.println("��ϲ������");
					score = score + 1;
					System.out.println("Ŀǰ��ĵ÷�Ϊ" + score + "��");
				} else {
					System.out.println("������Ĵ𰸴���");

				}

				System.out.println("�Ƿ�ѡ��������⣬��������1���˳�����2");
				int core = sc.nextInt();
				if (core == 2) {
					break;
				}

			}

			if (grade == 2) {// �ȼ�2
				double number3 = (double) Math.round(number1 * 10) / 10;
				double number4 = (double) Math.round(number2 * 10) / 10;

				System.out.println(number3);// �������������
				System.out.println(number4);// �������������
				System.out.println("������ ���������Ļ�");// ���мӷ�����
				double input = sc.nextDouble();
				// �û����������

				if (input == number3 * number4) {// �жϽ���Ƿ���ȷ

					System.out.println("��ϲ������");
					score = score + 2;
					System.out.println("Ŀǰ��ĵ÷�Ϊ" + score + "��");
				} else {
					System.out.println("������Ĵ𰸴���");

				}

				System.out.println("�Ƿ�ѡ��������⣬��������1���˳�����2");
				int core = sc.nextInt();
				if (core == 2) {

					break;
				}

			}

			if (grade == 3) {// �ȼ�3
				double number3 = (double) Math.round(number1 * 100) / 100;
				double number4 = (double) Math.round(number2 * 100) / 100;
				System.out.println(number3);// �������������
				System.out.println(number4);// �������������
				System.out.println("������ ���������Ļ�");// ���мӷ�����
				double input = sc.nextDouble();// �û����������

				if (input == number3 * number4) {// �жϽ���Ƿ���ȷ

					System.out.println("��ϲ������");
					score = score + 3;
					System.out.println("Ŀǰ��ĵ÷�Ϊ" + score + "��");
				} else {
					System.out.println("������Ĵ𰸴���");

				}

				System.out.println("�Ƿ�ѡ��������⣬��������1���˳�����2");
				int core = sc.nextInt();
				if (core == 2) {
					break;
				}

			}
		}

		System.out.println("��Ϸ������������Ϸ�÷�Ϊ:" + score);

	}

}
