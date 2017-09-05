package fruits;

public class Fruits {
	private int kg; // вес фрукта
	
	public Fruits(int kg) {
		this.kg = kg;
	}
	
	public void setKg(int kg) {
		this.kg = kg;
	}
	
	public int getKg() {
		return this.kg;
	}
	
	//Выводим свойства фрукта
	public void character() {
		System.out.println("Фрукт весит " + this.kg + "кг");
	}

}
