package cat;

public class Cat
{
    private Double originWeight;
    private Double weight;

    private Double minWeight;
    private Double maxWeight;
    
    private static int count = 0; //Счетчик кошек

    public Cat()
    {
    	count++;//Создали кошку
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }
    
    //Возвращаем количество кошек
    public static int getCount() {
    	System.out.print("Кол-во кошек: ");
		return count;
	}

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
        	Cat.count--; //Минус кошка
            return "Dead";
        }
        else if(weight > maxWeight) {
        	Cat.count--; //Минус кошка
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}