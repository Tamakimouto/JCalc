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
	private Label mori, ange;
    @FXML
	private Button sama;

    String numbers = "";
    String result = "";
    boolean binary = false;

    IterativeMath bob = new IterativeMath();
    RecursiveMath sadako = new RecursiveMath();

    public enum function {
	Add, Sub, Mul, Div, Fac, Pow, Rsh, Lsh
    }
    
    public enum mode {
	Recursive, Iterative
    }
    
    function fx = function.Add;
    mode md = mode.Iterative;

    int x = 0;

    @FXML public void updateL(){
	mori.setText(numbers);
    }

    @FXML public void resL(){
	mori.setText("0");
    }

    @FXML public void updateB(){
	ange.setText(Integer.toString(x, 2));
    }

    @FXML public void num2Pressed(ActionEvent event){
	numbers += "2";
	x = Integer.parseInt(numbers);
	updateL();
	updateB();
    }

    @FXML public void num1Pressed(ActionEvent event){
	numbers += "1";
	x = Integer.parseInt(numbers);
	updateL();
	updateB();
    }

    @FXML public void num3Pressed(ActionEvent event){
	numbers += "3";
	x = Integer.parseInt(numbers);
	updateL();
	updateB();
    }

    @FXML public void num4Pressed(ActionEvent event){
	numbers += "4";
	x = Integer.parseInt(numbers);
	updateL();
	updateB();
    }

    @FXML public void num5Pressed(ActionEvent event){
	numbers += "5";
	x = Integer.parseInt(numbers);
	updateL();
	updateB();
    }

    @FXML public void num6Pressed(ActionEvent event){
	numbers += "6";
	x = Integer.parseInt(numbers);
	updateL();
	updateB();
    }
    
    @FXML public void num7Pressed(ActionEvent event){
	numbers += "7";
	x = Integer.parseInt(numbers);
	updateL();
	updateB();
    }

    @FXML public void num8Pressed(ActionEvent event){
	numbers += "8";
	x = Integer.parseInt(numbers);
	updateL();
	updateB();
    }

    @FXML public void num9Pressed(ActionEvent event){
	numbers += "9";
	x = Integer.parseInt(numbers);
	updateL();
	updateB();
    }

    @FXML public void num0Pressed(ActionEvent event){
	numbers += "0";
	x = Integer.parseInt(numbers);
	updateL();
	updateB();
    }

    @FXML public void clrPress(ActionEvent event){
	numbers = "";
	x = 0;
	updateB();
	resL();
    }

    @FXML public void modePress(ActionEvent event){
	if (md == mode.Iterative){
	    md = mode.Recursive;
	    sama.setText("Use Iterative");
	}else if (md == mode.Recursive){
	    md = mode.Iterative;
	    sama.setText("Use Recursive");
	}//else
    }

    @FXML public void binPress(ActionEvent event){
	if (binary == false){
	    binary = true;
	    ange.setText(Integer.toString(x, 2));
	    ange.setVisible(true);
	}else if (binary == true){
	    binary = false;
	    ange.setVisible(false);
	}//else
    }

    @FXML public void addPress(ActionEvent event){
	x = Integer.parseInt(numbers);
	updateL();
	updateB();
	numbers = "";
	fx = function.Add;
    }

    @FXML public void subPress(ActionEvent event){
	x = Integer.parseInt(numbers);
	updateL();
	updateB();
	numbers = "";
	fx = function.Sub;
    }

    @FXML public void mulPress(ActionEvent event){
	x = Integer.parseInt(numbers);
	updateL();
	updateB();
	numbers = "";
	fx = function.Mul;
    }
    
    @FXML public void divPress(ActionEvent event){
	x = Integer.parseInt(numbers);
	updateL();
	updateB();
	numbers = "";
	fx = function.Div;
    }

    @FXML public void rshPress(ActionEvent event){
	x = Integer.parseInt(numbers);
	updateL();
	updateB();
	numbers = "";
	fx = function.Rsh;
    }

        @FXML public void lshPress(ActionEvent event){
	x = Integer.parseInt(numbers);
	updateL();
	updateB();
	numbers = "";
	fx = function.Lsh;
    }

        @FXML public void facPress(ActionEvent event){
	x = Integer.parseInt(numbers);
	updateL();
	updateB();
	numbers = "";
	fx = function.Fac;
    }

        @FXML public void powPress(ActionEvent event){
	x = Integer.parseInt(numbers);
	updateL();
	updateB();
	numbers = "";
	fx = function.Pow;
    }

    @FXML public void eqPress(ActionEvent event){
	if (fx == function.Add){
	    if (md == mode.Iterative){
		x = bob.add(x, Integer.parseInt(numbers));
	    }else if (md == mode.Recursive)
		x = sadako.add(x, Integer.parseInt(numbers));
	    numbers = Integer.toString(x);
	    updateL();
	    updateB();
	    numbers = "";
	}else if (fx == function.Sub){
	    if (md == mode.Iterative){
		x = bob.sub(x, Integer.parseInt(numbers));
	    }else if (md == mode.Recursive)
		x = sadako.sub(x, Integer.parseInt(numbers));
	    numbers = Integer.toString(x);
	    updateL();
	    updateB();
	    numbers = "";
	}else if (fx == function.Mul){
	    if (md == mode.Iterative){
		x = bob.mul(x, Integer.parseInt(numbers));
	    }else if (md == mode.Recursive)
		x = sadako.mul(x, Integer.parseInt(numbers));
	    numbers = Integer.toString(x);
	    updateL();
	    updateB();
	    numbers = "";
	}else if (fx == function.Div){
	    if (md == mode.Iterative){
		x = bob.div(x, Integer.parseInt(numbers));
	    }else if (md == mode.Recursive)
		x = sadako.div(x, Integer.parseInt(numbers));
	    numbers = Integer.toString(x);
	    updateL();
	    updateB();
	    numbers = "";
	}else if (fx == function.Rsh){
	    if (md == mode.Iterative){
		x = bob.rshift(x, Integer.parseInt(numbers));
	    }else if (md == mode.Recursive)
		x = sadako.rshift(x, Integer.parseInt(numbers));
	    numbers = Integer.toString(x);
	    updateL();
	    updateB();
	    numbers = "";
	}else if(fx == function.Lsh){
	    if (md == mode.Iterative){
		x = bob.lshift(x, Integer.parseInt(numbers));
	    }else if (md == mode.Recursive)
		x = sadako.lshift(x, Integer.parseInt(numbers));
	    numbers = Integer.toString(x);
	    updateL();
	    updateB();
	    numbers = "";
	}else if(fx == function.Fac){
	    if (md == mode.Iterative){
		x = bob.fac(x);
	    }else if (md == mode.Recursive)
		x = sadako.fac(x);
	    numbers = Integer.toString(x);
	    updateL();
	    updateB();
	    numbers = "";
	}else if (fx == function.Pow){
	    if (md == mode.Iterative){
		x = bob.pow(x, Integer.parseInt(numbers));
	    }else if (md == mode.Recursive)
		x = sadako.pow(x, Integer.parseInt(numbers));
	    numbers = Integer.toString(x);
	    updateL();
	    updateB();
	    numbers = "";
	}//else-if
    }//equals

    @FXML public void delPress(ActionEvent event){
	numbers = numbers.substring(0, numbers.length()-1);
	updateL();
	updateB();
    }

    
}//controls