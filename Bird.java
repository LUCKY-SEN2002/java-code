package DEMO3;

public abstract class Bird extends Animals  {
	String feather;
	
	

	public Bird(String feather) {
		System.out.println("������һ������");
		
		this.feather=feather;
		
	}
public void   growfeather() {
	System.out.println("����"+feather+"��ë");
	
	
	
}
abstract public void move();
public void reproduce() {
	
	System.out.println("�µ�");
}

}
