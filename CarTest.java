package ffinal;

public class CarTest {

	public static void main(String[] args) {
		Car araba1 = new Car("BMW", 20.0);
		
		araba1.showInfo();
		System.out.println("---------------");
		
		araba1.drive(100);
		araba1.showInfo();
		System.out.println("---------------");
		
		araba1.drive(150);
		araba1.showInfo();
		

	}

}
