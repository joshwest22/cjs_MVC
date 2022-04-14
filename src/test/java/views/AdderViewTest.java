package views;

import org.testfx.assertions.api.Assertions;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import models.adder;

@ExtendWith(ApplicationExtension.class)
public class AdderViewTest
{
	
	
	@Start
	private void start(Stage stage)
	{
		adder model = new adder();
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(adder.class.getResource("../views/AdderView.fxml"));
		try
		{
			BorderPane view;
			view = loader.load();
			AdderController controller = loader.getController();
			controller.setModel(model);
			Scene s = new Scene(view);
			stage.setScene(s);
			stage.show();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@Test
	public void testAdd(FxRobot robot)
	{
		robot.clickOn("#firstNumberTextField");
		robot.write("10");
		robot.clickOn("#secondNumberTextField");
		robot.write("10");
		robot.clickOn("#addingButton");
		Assertions.assertThat(robot.lookup("#resultLabel").queryAs(Label.class)).hasText("20");
	}
	
	

}
