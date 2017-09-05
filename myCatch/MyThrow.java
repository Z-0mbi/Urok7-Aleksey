package myCatch;

public class MyThrow {

	public static void main(String[] args) throws Exception {
		for (int i = args.length - 1; i >=0 ; i--) {
			if (i == 0) {
				throw new Exception("Последний элемент");
			}
			System.out.print(args[i] + " ");
		}
		

	}

}
