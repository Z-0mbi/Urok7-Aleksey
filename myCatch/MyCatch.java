package myCatch;

public class MyCatch {
	

	public static void main(String[] args) {
		try {
			//int a = 1/0;
			int[] a = new int[2];
			a[7] = 7;
		}
		catch(Throwable e) {
			System.out.println("Что-то не так!");
		}

	}

}
