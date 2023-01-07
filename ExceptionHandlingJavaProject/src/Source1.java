
public class Source1 {

	public static void main(String[] args) {
		try {
			Calculator.doAverage(2,3,4);
			Calculator.doAverage(4,7,8,9);
			Calculator.doAverage();
			Calculator.doAverage(3,2,1,8,8,9,6,6,7);
		}
		catch(CountByZeroException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
