package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {

	@FXML
	private Label result;
	private long number1=0;
	private String operator="";
	private boolean start=true; //To Check whether number 2 is entered or not?
	Model model=new Model();
	
	
	@FXML
	public void processNumbers(ActionEvent event) {
	
		if(start) {
			result.setText("");
			start=false;
		}
		String value=((Button)event.getSource()).getText();
		result.setText(result.getText()+value);
	}
	@FXML
	public void processOperator(ActionEvent event) {
		
		String value=((Button)event.getSource()).getText();
		if(!value.equals("=")) {
			if(!operator.isEmpty()) {
				return;
				
			}
			operator=value;
			number1=Long.parseLong(result.getText());
			result.setText("");
		}
		else {
			if(operator.isEmpty())
				return;
			long number2=Long.parseLong(result.getText());
			result.setText(Float.toString(model.calculate(number1, number2, operator)));
			operator="";
			start=true;
		}
		
	}
	
}
