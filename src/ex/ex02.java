package ex;
import java.util.Scanner;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 105021062 鄭雅韵
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		float n=scn.nextInt();
		float a=0;
		float b=0;
		if(n<=120){
			a=(float) (n*2.10);
			b=(float)(n*2.10);
			System.out.println(a);
			System.out.println(b);
		}else if(n>120 && n<=330){
			a=(float)((120*2.10)+((n-120)*3.02));
			b=(float)((120*2.10)+((n-120)*2.68));
			System.out.println(a);
			System.out.println(b);
		}else if(n>330 && n<=500){
			a=(float)((120*2.10)+((330-120)*3.02)+((n-330)*4.39));
			b=(float)((120*2.10)+((330-120)*2.68)+((n-330)*3.61));
			System.out.println(a);
			System.out.println(b);
		}else if(n>500 && n<=700){
			a=(float)((120*2.10)+((330-120)*3.02)+((500-330)*4.39)+((n-500)*4.97));
			b=(float)((120*2.10)+((330-120)*2.68)+((500-330)*3.61)+((n-500)*4.01));
			System.out.println(a);
			System.out.println(b);
		}else if(n>=701){
			a=(float)((120*2.10)+((330-120)*3.02)+((500-330)*4.39)+((700-500)*4.97)+((n-700)*5.63));
			b=(float)((120*2.10)+((330-120)*2.68)+((500-330)*3.61)+((700-500)*4.01)+((n-700)*4.50));
			System.out.println(a);
			System.out.println(b);
		}

	}

}
