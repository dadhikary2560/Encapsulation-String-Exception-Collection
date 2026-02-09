package encapsulationProgram;
public class EncapsulationPrivate {
	private int marks=0;
	
	
	public void setMarks(int receivedInput) {
		if(receivedInput>0 && receivedInput<=100)
			this.marks = receivedInput;
		else
			System.out.println("wrong input");
	}
	
	public int getMarks() {
		return marks;
	}
}
