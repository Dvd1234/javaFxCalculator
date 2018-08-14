package application;

public class Model {

	
	public float calculate(long number1,long number2,String operator) {
		
		switch(operator) {
		case "+":
			return number1+number2;
			break;
		case "-":
			return number1-number2;
			break;
		case "*":
			return number1*number2;
			break;
		case "/":
			if(number2==0)
				return 0;
			return number1/(double)number2;
			break;
		default:
			return 0;
				
		}
	}
	
}
