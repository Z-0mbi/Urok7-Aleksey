package fruits;

public class Apple extends Fruits{
	private String color;//цвет яблока

	public Apple(int kg, String color) {
		super(kg);
		this.color = color;
	}
	//Выводим свойства яблока
	public void character() {
		System.out.println("Яблоко весит " + this.getKg() + "кг" + "\t" + "Цвет яблока " + this.color);
	}

}
