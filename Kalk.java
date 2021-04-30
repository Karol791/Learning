import java.util.Scanner;

public class Kalk {
	
	public static int dodaj(int x,int y) {
		return x+y;
	}
	public static int odejmij(int x,int y) {
		return x-y;
	}
	public static int pomnoz(int x,int y) {
		return x*y;
	}
	public static int dziel(int x,int y) {
		return x/y;
	}
	
	

	public static void main(String[] args) {
		System.out.println("Jakie dzia³anie chcesz wykonaæ?\n"
				+ "1 - dodawanie\n"
				+ "2 - odejmowanie\n"
				+ "3 - mno¿enie\n"
				+ "4 - dzielenie");
		Scanner inp = new Scanner(System.in);
		int a = inp.nextInt();
		System.out.println("Podaj pierwsz¹ liczbê: ");
		int x = inp.nextInt();
		System.out.println("Podaj drug¹ liczbê: ");
		int y = inp.nextInt();
		switch(a) {
		case 1:
			System.out.println(x + " + " + y + " = " +dodaj(x,y));
			break;
		case 2:
			System.out.println(x + " - " + y + " = " +odejmij(x,y));
			break;
		case 3:
			System.out.println(x + " * " + y + " = " +pomnoz(x,y));
			break;
		case 4:
			System.out.println(x + " / " + y + " = " +dziel(x,y));
			break;
		}
	}
}

