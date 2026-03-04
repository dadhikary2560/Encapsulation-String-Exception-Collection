package encapsulationProgram;

public class EncapsulationPrivateMethod {
	private int a, b;
	
	private int m1(int a, int b) {
		System.out.println("Hello this is a private method "
				+ "accessible only to the class");
		return a+b;
	}
	
	public void setA(int A) {
		this.a = A;
	}
	
	public void setB(int B) {
		this.b = B;
	}
	
	public int get() {
		return m1(a, b);
	}
}
