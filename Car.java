package ffinal;

public class Car {
	private String model;
	private double fuel;
	
	public Car(String gelenModel, double baslangicBenzini) {
		model = gelenModel;
		fuel = baslangicBenzini;
			
		}
	public void drive(int km) {
		double neededFuel = km*0.1;
		
		if(fuel >= neededFuel ) {
			fuel = fuel -neededFuel;
			System.out.println(km + " km gidildi.");
		}else {
			System.out.println("HATA: " + km + " km gitmek için benzin yetersiz.");
			
			
		}
	}
	public int getRange() {
	return (int) (fuel / 0.1);
		
	}
		public void showInfo() {
			System.out.println("Model: " + model + ", Kalan Benzin: " + fuel + " Lt" + ", Tahmini Menzil: " + getRange() + " km");
		
		
	}
	

}
