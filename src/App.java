
public class App {

	public static void main(String[] args) {
		
		RpnCalculator rpnc = new RpnCalculator();
		System.out.println(rpnc.calculate("45 6 9 + +"));
		System.out.println(rpnc.calculate("1 2 + 4 *"));
		System.out.println(rpnc.calculate("4 3 + 2 1 + *"));
	}

}
