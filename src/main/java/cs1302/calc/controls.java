package cs1302.calc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.lang.Integer;
import java.lang.Enum;
import java.util.Arrays;

public class controls {

    @FXML 
	private Label mori;

    String numbers = "";
    String result = "";

    IterativeMath bob = new IterativeMath();

    public enum function {
	Add, Sub, Mul, Div, Fac, Pow, Rsh, Lsh
    }
    
    function fx = function.Add;
    
    int x = 0;

    @FXML public void updateL(){
	mori.setText(numbers);
    }

    @FXML public void resL(){
	mori.setText("0");
    }

    @FXML public void num2Pressed(ActionEvent event){
	numbers += "2";
	updateL();
    }

    @FXML public void num1Pressed(ActionEvent event){
	numbers += "1";
	updateL();
    }

    @FXML public void num3Pressed(ActionEvent event){
	numbers += "3";
	updateL();
    }

    @FXML public void num4Pressed(ActionEvent event){
	numbers += "4";
	updateL();
    }

    @FXML public void num5Pressed(ActionEvent event){
	numbers += "5";
	updateL();
    }

    @FXML public void num6Pressed(ActionEvent event){
	numbers += "6";
	updateL();
    }
    
    @FXML public void num7Pressed(ActionEvent event){
	numbers += "7";
	updateL();
    }

    @FXML public void num8Pressed(ActionEvent event){
	numbers += "8";
	updateL();
    }

    @FXML public void num9Pressed(ActionEvent event){
	numbers += "9";
	updateL();
    }

    @FXML public void num0Pressed(ActionEvent event){
	numbers += "0";
	updateL();
    }

    @FXML public void clrPress(ActionEvent event){
	numbers = "";
	x = 0;
	resL();
    }

    @FXML public void addPress(ActionEvent event){
	x = Integer.parseInt(numbers);
	updateL();
	numbers = "";
	fx = function.Add;
    }

    @FXML public void subPress(ActionEvent event){
	x = Integer.parseInt(numbers);
	updateL();
	numbers = "";
	fx = function.Sub;
    }

    @FXML public void mulPress(ActionEvent event){
	x = Integer.parseInt(numbers);
	updateL();
	numbers = "";
	fx = function.Mul;
    }
    
    @FXML public void divPress(ActionEvent event){
	x = Integer.parseInt(numbers);
	updateL();
	numbers = "";
	fx = function.Div;
    }

    @FXML public void rshPress(ActionEvent event){
	x = Integer.parseInt(numbers);
	updateL();
	numbers = "";
	fx = function.Rsh;
    }

        @FXML public void lshPress(ActionEvent event){
	x = Integer.parseInt(numbers);
	updateL();
	numbers = "";
	fx = function.Lsh;
    }

        @FXML public void facPress(ActionEvent event){
	x = Integer.parseInt(numbers);
	updateL();
	numbers = "";
	fx = function.Fac;
    }

        @FXML public void powPress(ActionEvent event){
	x = Integer.parseInt(numbers);
	updateL();
	numbers = "";
	fx = function.Pow;
    }

    @FXML public void eqPress(ActionEvent event){
	if (fx == function.Add){
	    x = bob.add(x, Integer.parseInt(numbers));
	    numbers = Integer.toString(x);
	    updateL();
	    numbers = "";
	}else if (fx == function.Sub){
	    x = bob.sub(x, Integer.parseInt(numbers));
	    numbers = Integer.toString(x);
	    updateL();
	    numbers = "";
	}else if (fx == function.Mul){
	    x = bob.mul(x, Integer.parseInt(numbers));
	    numbers = Integer.toString(x);
	    updateL();
	    numbers = "";
	}else if (fx == function.Div){
	    x = bob.div(x, Integer.parseInt(numbers));
	    numbers = Integer.toString(x);
	    updateL();
	    numbers = "";
	}else if (fx == function.Rsh){
	    x = bob.rshift(x, Integer.parseInt(numbers));
	    numbers = Integer.toString(x);
	    updateL();
	    numbers = "";
	}else if(fx == function.Lsh){
	    x = bob.lshift(x, Integer.parseInt(numbers)):
	    numbers = Integer.toString(x);
	    updateL();
	    numbers = "";
	}else if(fx == function.Fac){
	    x = bob.fac(x);
	    numbers = Integer.toString(x);
	    updateL();
	    numbers = "";
	}else if (fx == function.Pow){
	    x = bob.pow(x, Integer.parseInt(numbers));
	    numbers = Integer.toString(x);
	    updateL();
	    numbers = "";
	}//else-if
    }//equals

    @FXML public void delPress(ActionEvent event){
	numbers = numbers.subString(0, numbers.length-1);
	updateL();
    }

    
}//controls