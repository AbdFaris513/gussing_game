package application;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class con1 {
	int randomNum ;
	int chancesnum = 5;
	int count = 0;
	public con1()
	{
		Random random = new Random();

        // Generate a random integer
        int randomNumber = random.nextInt(); // Generates a random integer within the full range of int

        // Generate a random integer within a specified range
        int min = 1;
        int max = 100;
        randomNum = random.nextInt(max - min + 1) + min;

        // Generate a random double between 0 (inclusive) and 1 (exclusive)
        int randomDouble = (int) random.nextDouble();

        System.out.println((int)randomNumber);
        System.out.println("Random Integer in Range: " + randomNum);
        System.out.println("Random Double: " + randomDouble);
	}
    @FXML
    private Label chances;

    @FXML
    private Label display;

    @FXML
    private TextField textfield;

    @FXML
    void submit(ActionEvent event)
    {
    	if(chancesnum <=0)
		{
    		display.setText("Lose!!!");
    		System.out.println("Chance");
		}
    	else
    	{
    		try {
        		int num = Integer.parseInt(textfield.getText());
        		System.out.println(num);
        		if(num==randomNum)
        		{
        			display.setText("Win !!!");
        			chances.setText("Count "+ (++count));
        		}
        		else if(num>randomNum)
        		{
        			
        			display.setText("Large Number");
//        			chances.setText("Chances "+ (--chancesnum));
        			chances.setText("Count "+ (++count));
        		}
        		else
        		{
        			display.setText("Small Number");
//        			chances.setText("Chances "+ (--chancesnum));
        			chances.setText("Count "+ (++count));
        		}
    		} catch (Exception e) {
    			display.setText("Please Enter Valid Number");
    		}
    	}
    		
    }

}
