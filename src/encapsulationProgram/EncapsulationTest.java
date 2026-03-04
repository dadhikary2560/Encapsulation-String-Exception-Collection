package encapsulationProgram;

public class EncapsulationTest {
	public static void main(String[] args) {
		EncapsulationPrivate obj = new EncapsulationPrivate();
		obj.setMarks(89);
		System.out.println(obj.getMarks());
		
		
		System.out.println("---------------------------------------------------------");
		
		EncapsulationPrivateMethod obj2 = new EncapsulationPrivateMethod();
		obj2.setA(20);
		obj2.setB(30);
		System.out.println(obj2.get());
	}
}
