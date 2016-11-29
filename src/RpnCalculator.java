import java.util.Stack;

public class RpnCalculator {

	private Stack<Integer> stack1 = new Stack<Integer>();
	private int accumulator = 0;

	void setAccumulator(int number) {
		enter();
		accumulator = number;
	}

	public int getAccumulator() {
		return accumulator;
	}

	void enter() {
		stack1.push(accumulator);
	}

	void plus() {
		accumulator += stack1.pop();
	}

	void multyply() {
		accumulator *= stack1.pop();
	}

	public int calculate(String expression) {
		int result = 0;
		String splitStr = new String(expression);
		for (String str: splitStr.split(" ")) {
			if (str.equals("+")) {
				plus();
				result = accumulator;
			} else if (str.equals("*")) {
				multyply();
				result = accumulator;
			} else {
				setAccumulator(Integer.parseInt(str));
			}
		}
		return result;
	}
}
