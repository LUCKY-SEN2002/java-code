package Eggcake;

public class EGGCAKE {
 int eggcount;
 public EGGCAKE(int eggcount) {
	this.eggcount=eggcount;
	System.out.println("���������"+eggcount+"������");
}
  
	public EGGCAKE() {
		//eggcount=1;
		//System.out.println("���������"+eggcount+"������");
		this(2);
		
		// TODO Auto-generated constructor stub
	}
     public static void main(String[] args) {
		EGGCAKE A=new EGGCAKE();
		EGGCAKE A2=new EGGCAKE(5);
		
	}
}




//��̬��