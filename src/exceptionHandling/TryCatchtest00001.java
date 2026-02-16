package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchtest00001 {

	public void m1() {
		// TODO Auto-generated method stub
		try {
			FileInputStream obj = new FileInputStream("D:\\AfterOOPS\\encapsulation.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
	TryCatchtest00001 obj=new TryCatchtest00001();
	obj.m1();
}
}
