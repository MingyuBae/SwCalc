package simcalc;

public class SimpleCalculator {
	private int result = 0;
	
	public void add(int x, int y){
		result = x + y;
	}
	
	public void sub(int x, int y){
		result = x - y;
	}
	
	public void multi(int x, int y){
		result = x * y;
	}
	
	public void div(int x, int y){
		if(y != 0)
			result = x / y;
		else
			System.out.println("분모가 0입니다.");
	}

	public int getResult() {
		return result;
	}
}
