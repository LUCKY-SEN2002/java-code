package demo11;

public class wrong {

	public static void main(String[] args) {
		/*try {
			int a = 1;
			Object d = null;
			d.notify();
			System.out.println(d);

		} catch (ArithmeticException w) {
			System.out.println("�����쳣�������Ա��ʱ����");
		}

		catch (NullPointerException g) {
			System.out.println("��ָ���쳣�������Ա��ʱ����");
		} finally {
			System.out.println("ʵʱ�����ļ���");
		}

	*/
		try {
			String playertype="monkey";
		if(!playertype.equals("humans")) {
			throw new NonHumansException("�з�����ѡ��"+playertype);
			
			
			
		}
	System.out.println("��ʼ����");
	
		} catch ( NonHumansException e) {
			e.printStackTrace();
		}
	
	
	
	}
}
