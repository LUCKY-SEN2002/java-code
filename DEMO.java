package demo11;
 class Animals{//��̬��Ч��
	 
	 
	 void move () {
		 
		 
	 }
 }
 class Fish extends Animals{
      void move () {
		 
		System.out.println("��Ӿ"); 
	 }
 }
 class Hawk extends Animals {
	 
void move () {
		 
		System.out.println("����"); 
	 }
 }
public class DEMO {
	public static void main(String[] args) {
		person p1=new person();
		Animals jack=new Fish();
		jack.move();
		
		jack =new Hawk();
		jack.move();
		
		
	}

	public DEMO() {
		// TODO Auto-generated constructor stub
	}

}
