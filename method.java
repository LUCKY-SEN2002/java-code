package demo11;
import java.util.Scanner;

public class method {
	//ŷ������㷨��շת�������

    public static int gcd(int m,int n) {
        if(m<n) {
            int k=m;
            m=n;
            n=k;
        }
        //if(m%n!=0) {
        //    m=m%n;
        //    return gcd(m,n);
        //}
        //return n;
        return m%n == 0?n:gcd(n,m%n);
    } 

 
public static int gcd1(int m,int n) {
        int t;
        if(m<n) {
            t=m;
        }else {
            t=n;
        }
        while(m%t!=0||n%t!=0){
            t--;
        }
        return t;
    }


 

    //����������(�������

    public static int gcd2(int m,int n) {
        int i=0,t,x;
        while(m%2==0&n%2==0) {
            m/=2;
            n/=2;
            i++;
        }
        if(m<n){
            t=m;
            m=n;
            n=t;
        }
        while(n!=(m-n)) {
            x=m-n;
            m=(n>x)?n:x;
            n=(n<x)?n:x;
        }
        if(i==0)
            return n;
        else
            return (int)Math.pow(2, i)*n;
    }

    public static void main(String[] args) {
        System.out.println("����������������:");
        Scanner scan = new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        int m=scan.nextInt();
        int n=scan2.nextInt();
        System.out.println("ŷ������㷨�����Լ����:"+gcd(m,n));
        System.out.println("������������㷨�����Լ����:"+gcd1(m,n));
        System.out.println("�������������Լ����:"+gcd2(m,n));
    }


	public method() {
		// TODO Auto-generated constructor stub
	}

}
