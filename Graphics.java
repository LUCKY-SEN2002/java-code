package DEMO;

public class Graphics {
	
	  final static double PI=3.1415926;
	  public static void main(String[] args) {
		  circle c=new circle(3.0);
		  spherical a=new spherical(3.0);
			
			
			
		}
}
     class circle{
    	 double radius;
    	 double area;
    	 public circle(double radius) {
    		 this.radius=radius;
    		 area=Graphics.PI*radius*radius;
    		 System.out.println("Բ�İ뾶="+radius);
    		 System.out.println("Բ�����="+area);
    	 }
    	 
    	 
     }
     
     class spherical{
    	 double radius;
    	 double volume;
    	 public spherical(double radius) {
    		 this.radius=radius;
    		 volume =Graphics.PI*radius*radius*radius;
    	    System.out.println("������="+volume);
    	 	 System.out.println("��İ뾶="+radius);
         }
    	  
     
	
	}
