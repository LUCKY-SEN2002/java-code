import java.text.DecimalFormat;
import java.util.Date;

public class demo {

	/*public static void main(String[] args) {
		
		//Integer ��װ��
		System.out.println("int���� ����СֵΪ "+Integer.MAX_VALUE);
		System.out.println("int������СֵΪ"+Integer.MIN_VALUE);
		Integer  intel=new Integer(123);
		System.out.println(intel);
		Integer  intel1=new Integer("123456789");
		System.out.println(intel1);
		
		//���÷���Interger.parseInt(����������ֵ��Ҳ�������ַ�������)
		//���á�intValue()�������Խ��ַ�������ת��Ϊ����
		 //string str1=Integer.toString ��11,8���������Ǳ�ʾ��11ת��Ϊ�˽��Ƶ���(��Ҫת����ʮ���Ƶ�������Ҫ ת���Ľ���)
	//value of Ҳ���Դ�������
	
	//�������Ͱ�װ�� ����
	Boolean a1=new Boolean(true);
	System.out.println(a1.toString());//�÷����ɽ�����ֵת��Ϊ�ַ���
	//��Ҫע����ǲ������� ��������ture Ĭ�Ϸ���ֵΪfalse
	
	//byte �� 
	
	//double�� ������
	
	//number��
	Number num =new Double(1222222222222.3);
	System.out.println(num);
	
	//DecimalFormat df=new Decimal ("��ʽ��ģ��")
	
	
	}*/
	static void format(String pattern,double i ) {
		DecimalFormat df =new DecimalFormat(pattern);
		System.out.println(i);
		System.out.println(pattern);
		System.out.println(df.format(i));
		
	}
	public static void main(String[] args) {
		format("####",123);
		format("###,###.###",123456.789);
		System.out.println("Բ���ʦе�ֵΪ��"+Math.PI);
		System.out.println("90�ȵ�����ֵΪ��"+Math.sin(Math.PI/2));
		System.out.println("0������ֵΪ:"+Math.cos(0));
		System.out.println("��10Ϊ�׵�2�Ķ���ֵΪ��"+Math.log10(2));
		System.out.println("�ĵ�ƽ����"+Math.sqrt(4));
		System.out.println("8����������"+Math.cbrt(8));
		System.out.println("2��2�η�"+Math.pow(2, 5));//�����ʾΪ���ٴη�
		//�Ƚ�����
		System.out.println("4��8�н�С��һ��Ϊ��"	+Math.min(4, 8));
		System.out.println("-8�ľ���ֵΪ��"+Math.abs(-8));
		System.out.println("ʹ��floor������Ч��Ϊ��"+Math.floor(3.6));//����ȡ��
		System.out.println("��������"+Math.round(5.8));
		//������������㷽��
		
		Date date=new Date();
		System.out.println(date);
		
	}
}
