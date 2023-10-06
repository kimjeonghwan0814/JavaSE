package section10;

public class Americano extends Espresso{
	
	public int water;
	
	public Americano(String bean, String brand, int water) {
		super(bean);
		super.brand = brand;
		this.water = water;
		
	}
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println("water: " + water);
	}
}
