package Week1.day1;

public class Bike {
	private void applybreak() {
		// TODO Auto-generated method stub
		System.out.println("Applied Break1");
	}
	private void soundhorn() {
	System.out.println("SoundHorn1");
	}
	
public static void main(String[]args) {
	Car c=new Car();
	c.applyBreak();
	c.soundHorn();
	
	Bike b=new Bike();
	b.applybreak();
	b.soundhorn();

}
}

