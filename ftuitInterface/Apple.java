package ftuitInterface;

public class Apple implements Fruits{
	private String name;// название фрукта
	private String color;// цвет фрукта
	private int kg; //вес фрукта
	
	public Apple(String color, int kg) {
		this.name = "Apple";
		this.color = color;
		this.kg = kg;
		this.info();
	}

	@Override
	public void info() {
		String name = this.getName();
		String color = this.getColor();
		int kg = this.getKg();
		System.out.println(color + " " + name + " весом " + kg + " кг");
		
	}

	@Override
	public void setColor(String color) {
		this.color = color;
		
	}

	@Override
	public void setKg(int kg) {
		this.kg = kg;
		
	}

	@Override
	public String getColor() {
		return this.color;
		
	}

	@Override
	public int getKg() {
		return this.kg;
		
	}

	@Override
	public String getName() {
		return this.name;
	}

}
