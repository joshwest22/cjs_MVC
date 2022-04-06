package views;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;
import models.adder;

public class AdderController
{
	@FXML
    private Label firstNumLabel;
	
	@FXML
    private TextField firstNumberField;

    @FXML
    private Label resultValLabel;

    @FXML
    private Label secondNumLabel;
    
    @FXML
    private TextField secondNumberField;

    @FXML
    void onClickAdd(ActionEvent event) 
    {
    	System.out.println("Add Clicked");
    	StringConverter<Number> fmt = new NumberStringConverter();
    	Number first = fmt.fromString(firstNumberField.getText());
    	Number second = fmt.fromString(secondNumberField.getText());
    	model.sum(first.doubleValue(), second.doubleValue());
    }
    
    adder model;
	
	public void setModel(adder newModel)
	{
		model = newModel;
		
		//bind label
		StringConverter<Number> fmt = new NumberStringConverter();
		
		Bindings.bindBidirectional(resultValLabel.textProperty(), model.getSum(),fmt);
	}
}
