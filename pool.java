package DEMO;

public class pool {
	static public int water = 0;// ��̬������ʼֵˮ��Ϊ0����̬�����ɱ���θı䲢��ֵ
   // final static    ��̬�������ܱ��޸�
	public void outlet() {// ������Ա���� ��ˮ
		if (water >= 2) {
			water = water - 2;
		} else {
			water = 0;
		}
	}
	public void inlet() { // ���� ��ˮ ��Ա����
		water = water + 3;
	}
	public static void main(String[] args) {// mainΪ������
		pool out = new pool();
		pool in = new pool();
		System.out.println("ˮ���е�ˮ��" + pool.water);		
		System.out.println("��ˮ����עˮ�Ĵ�");
		in.inlet();
		in.inlet();
		in.inlet();
		in.inlet();
		System.out.println("ˮ���е�ˮ��" + pool.water);
		System.out.println("ˮ�ط�ˮ����");
		out.outlet();
		out.outlet();
		System.out.println("ˮ���е�ˮ��" + pool.water);
	}// �ɳ����֪��ִ�й����иı����Ϊͬһ������������̬����    
	public pool() {
		
 		// TODO Auto-generated constructor stub
	}

}
