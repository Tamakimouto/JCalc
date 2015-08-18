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



    /**
     * These are all the declarations
     *
     * I used string, and made instances of the maths.
     * Also includes enums,and some FXML pointers
     * and some ints.
     *
     */
    String numbers = "";
    String result = "";
    boolean binary = false;

    @FXML
        private Label mori, ange;

    @FXML
        private Button sama;

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

    int x, y, b, sum;

    /**
     * This method exists to update the "screen"
     * of the calculator. This is done by referencing a string
     * called numbers, which is built when various buttons are pressed.
     */
    @FXML public void updateL(){
        mori.setText(numbers);
    }

    /**
     * This method exists to reset the "screen"
     * of the calculator. This is done by setting text to 0
     * on the label.
     */
    @FXML public void resL(){
        mori.setText("0");
    }

    /**
     * This method exists to update the binary on the "screen"
     * of the calculator. This is done by referencing the int x
     * which we update frequently.
     */
    @FXML public void updateB(){
        ange.setText(Integer.toString(b, 2));
    }

    /**
     * This method is a number action key
     * when the corresponding number is pressed
     * the main string is updated and the Integer class will reference
     * the string and parse and int.
     *
     * The "screen" is then updated.
     *
     * @param ActionEvent The button press action
     */
    @FXML public void num2Pressed(ActionEvent event){
        numbers += "2";
        b = Integer.parseInt(numbers);
        updateL();
        updateB();
    }

    /**
     * This method is a number action key
     * when the corresponding number is pressed
     * the main string is updated and the Integer class will reference
     * the string and parse and int.
     *
     * The "screen" is then updated.
     *
     * @param ActionEvent The button press action
     */
    @FXML public void num1Pressed(ActionEvent event){
        numbers += "1";
        b = Integer.parseInt(numbers);
        updateL();
        updateB();
    }

    /**
     * This method is a number action key
     * when the corresponding number is pressed
     * the main string is updated and the Integer class will reference
     * the string and parse and int.
     *
     * The "screen" is then updated.
     *
     * @param ActionEvent The button press action
     */
    @FXML public void num3Pressed(ActionEvent event){
        numbers += "3";
        b = Integer.parseInt(numbers);
        updateL();
        updateB();
    }

    /**
     * This method is a number action key
     * when the corresponding number is pressed
     * the main string is updated and the Integer class will reference
     * the string and parse and int.
     *
     * The "screen" is then updated.
     *
     * @param ActionEvent The button press action
     */
    @FXML public void num4Pressed(ActionEvent event){
        numbers += "4";
        b = Integer.parseInt(numbers);
        updateL();
        updateB();
    }

    /**
     * This method is a number action key
     * when the corresponding number is pressed
     * the main string is updated and the Integer class will reference
     * the string and parse and int.
     *
     * The "screen" is then updated.
     *
     * @param ActionEvent The button press action
     */
    @FXML public void num5Pressed(ActionEvent event){
        numbers += "5";
        b = Integer.parseInt(numbers);
        updateL();
        updateB();
    }

    /**
     * This method is a number action key
     * when the corresponding number is pressed
     * the main string is updated and the Integer class will reference
     * the string and parse and int.
     *
     * The "screen" is then updated.
     *
     * @param ActionEvent The button press action
     */
    @FXML public void num6Pressed(ActionEvent event){
        numbers += "6";
        b = Integer.parseInt(numbers);
        updateL();
        updateB();
    }

    /**
     * This method is a number action key
     * when the corresponding number is pressed
     * the main string is updated and the Integer class will reference
     * the string and parse and int.
     *
     * The "screen" is then updated.
     *
     * @param ActionEvent The button press action
     */
    @FXML public void num7Pressed(ActionEvent event){
        numbers += "7";
        b = Integer.parseInt(numbers);
        updateL();
        updateB();
    }

    /**
     * This method is a number action key
     * when the corresponding number is pressed
     * the main string is updated and the Integer class will reference
     * the string and parse and int.
     *
     * The "screen" is then updated.
     *
     * @param ActionEvent The button press action
     */
    @FXML public void num8Pressed(ActionEvent event){
        numbers += "8";
        b = Integer.parseInt(numbers);
        updateL();
        updateB();
    }

    /**
     * This method is a number action key
     * when the corresponding number is pressed
     * the main string is updated and the Integer class will reference
     * the string and parse and int.
     *
     * The "screen" is then updated.
     *
     * @param ActionEvent The button press action
     */
    @FXML public void num9Pressed(ActionEvent event){
        numbers += "9";
        b = Integer.parseInt(numbers);
        updateL();
        updateB();
    }

    /**
     * This method is a number action key
     * when the corresponding number is pressed
     * the main string is updated and the Integer class will reference
     * the string and parse and int.
     *
     * The "screen" is then updated.
     *
     * @param ActionEvent The button press action
     */
    @FXML public void num0Pressed(ActionEvent event){
        numbers += "0";
        b = Integer.parseInt(numbers);
        updateL();
        updateB();
    }

    /**
     * This method is a screen control action key
     * when the method is called the screen will reset
     * by setting numbers, the main string to an empty string
     * and stting int x to 0.
     *
     * The "screen" is then updated.
     *
     * @param ActionEvent The button press action
     */
    @FXML public void clrPress(ActionEvent event){
        numbers = "";
        b = 0;
        updateB();
        resL();
    }

    /**
     * This method is a function control action key
     * when the button is pressed
     * the it will toggle between iterative and recursive.
     * though I'm sure that if I were to not include this one
     * You guys would prbably never notice.
     *
     * The "screen" is then updated.
     *
     * @param ActionEvent The button press action
     */
    @FXML public void modePress(ActionEvent event){
        if (md == mode.Iterative){
            md = mode.Recursive;
            sama.setText("Use Iterative");
        }else if (md == mode.Recursive){
            md = mode.Iterative;
            sama.setText("Use Recursive");
        }//else
    }

    /**
     * This method is a visual control action key
     * when the button is pressed
     * the it will toggle between hiding and showing the binary
     *
     * The "screen" is then updated.
     *
     * @param ActionEvent The button press action
     */
    @FXML public void binPress(ActionEvent event){
        if (binary == false){
            binary = true;
            ange.setText(Integer.toString(b, 2));
            ange.setVisible(true);
        }else if (binary == true){
            binary = false;
            ange.setVisible(false);
        }//else
    }

    /**
     * This method is a function action key
     * when the button is pressed
     * the it will set the enum function to
     * the corresponding function type.
     * This will also reset the main string numbers
     * allowing for a new int to be later parsed.
     *
     * The "screen" is not updated here, but after the
     * user presses another number key, the numbers on the
     * "screen" will reset.
     *
     * @param ActionEvent The button press action
     */
    @FXML public void addPress(ActionEvent event){
        x = Integer.parseInt(numbers);
        System.out.println("hi im x" + x);
        updateL();
        updateB();
        numbers = "";
        fx = function.Add;
    }

    /**
     * This method is a function action key
     * when the button is pressed
     * the it will set the enum function to
     * the corresponding function type.
     * This will also reset the main string numbers
     * allowing for a new int to be later parsed.
     *
     * The "screen" is not updated here, but after the
     * user presses another number key, the numbers on the
     * "screen" will reset.
     *
     * @param ActionEvent The button press action
     */
    @FXML public void subPress(ActionEvent event){
        x = Integer.parseInt(numbers);
        updateL();
        updateB();
        numbers = "";
        fx = function.Sub;
    }

    /**
     * This method is a function action key
     * when the button is pressed
     * the it will set the enum function to
     * the corresponding function type.
     * This will also reset the main string numbers
     * allowing for a new int to be later parsed.
     *
     * The "screen" is not updated here, but after the
     * user presses another number key, the numbers on the
     * "screen" will reset.
     *
     * @param ActionEvent The button press action
     */
    @FXML public void mulPress(ActionEvent event){
        x = Integer.parseInt(numbers);
        updateL();
        updateB();
        numbers = "";
        fx = function.Mul;
    }

    /**
     * This method is a function action key
     * when the button is pressed
     * the it will set the enum function to
     * the corresponding function type.
     * This will also reset the main string numbers
     * allowing for a new int to be later parsed.
     *
     * The "screen" is not updated here, but after the
     * user presses another number key, the numbers on the
     * "screen" will reset.
     *
     * @param ActionEvent The button press action
     */
    @FXML public void divPress(ActionEvent event){
        x = Integer.parseInt(numbers);
        updateL();
        updateB();
        numbers = "";
        fx = function.Div;
    }

    /**
     * This method is a function action key
     * when the button is pressed
     * the it will set the enum function to
     * the corresponding function type.
     * This will also reset the main string numbers
     * allowing for a new int to be later parsed.
     *
     * The "screen" is not updated here, but after the
     * user presses another number key, the numbers on the
     * "screen" will reset.
     *
     * @param ActionEvent The button press action
     */
    @FXML public void rshPress(ActionEvent event){
        x = Integer.parseInt(numbers);
        updateL();
        updateB();
        numbers = "";
        fx = function.Rsh;
    }

    /**
     * This method is a function action key
     * when the button is pressed
     * the it will set the enum function to
     * the corresponding function type.
     * This will also reset the main string numbers
     * allowing for a new int to be later parsed.
     *
     * The "screen" is not updated here, but after the
     * user presses another number key, the numbers on the
     * "screen" will reset.
     *
     * @param ActionEvent The button press action
     */
    @FXML public void lshPress(ActionEvent event){
        x = Integer.parseInt(numbers);
        updateL();
        updateB();
        numbers = "";
        fx = function.Lsh;
    }

    /**
     * This method is a function action key
     * when the button is pressed
     * the it will set the enum function to
     * the corresponding function type.
     * This will also reset the main string numbers
     * allowing for a new int to be later parsed.
     *
     * The "screen" is not updated here, but after the
     * user presses another number key, the numbers on the
     * "screen" will reset.
     *
     * @param ActionEvent The button press action
     */
    @FXML public void facPress(ActionEvent event){
        x = Integer.parseInt(numbers);
        updateL();
        updateB();
        numbers = "";
        fx = function.Fac;
    }

    /**
     * This method is a function action key
     * when the button is pressed
     * the it will set the enum function to
     * the corresponding function type.
     * This will also reset the main string numbers
     * allowing for a new int to be later parsed.
     *
     * The "screen" is not updated here, but after the
     * user presses another number key, the numbers on the
     * "screen" will reset.
     *
     * @param ActionEvent The button press action
     */
    @FXML public void powPress(ActionEvent event){
        x = Integer.parseInt(numbers);
        updateL();
        updateB();
        numbers = "";
        fx = function.Pow;
    }

    /**
     * This method is a function action key
     * when the button is pressed
     * based on the enum, the corresponding functions will be executed.
     *
     * The "screen" will update to display the function answer.
     *
     * @param ActionEvent The button press action
     */
    @FXML public void eqPress(ActionEvent event){
        if (fx == function.Add){
            if (md == mode.Iterative){
                y = Integer.parseInt(numbers);
                System.out.println("x = " + x);
                System.out.println("y = " + y);
                sum = bob.add(x, y);
                b = sum;
            }else if (md == mode.Recursive){
                y = Integer.parseInt(numbers);
                sum = sadako.add(x, y);
                b = sum;
            }
            numbers = Integer.toString(sum);
            updateL();
            updateB();
            numbers = "";
        }else if (fx == function.Sub){
            if (md == mode.Iterative){
                x = bob.sub(x, Integer.parseInt(numbers));
                b = x;
            }else if (md == mode.Recursive){
                x = sadako.sub(x, Integer.parseInt(numbers));
                b=x;
            }
            numbers = Integer.toString(x);
            updateL();
            updateB();
            numbers = "";
        }else if (fx == function.Mul){
            if (md == mode.Iterative){
                x = bob.mul(x, Integer.parseInt(numbers));
                b = x;
            }else if (md == mode.Recursive){
                x = sadako.mul(x, Integer.parseInt(numbers));
                b = x;
            }
            numbers = Integer.toString(x);
            updateL();
            updateB();
            numbers = "";
        }else if (fx == function.Div){
            if (md == mode.Iterative){
                x = (int)bob.div(x, Integer.parseInt(numbers));
                b = x;
            }else if (md == mode.Recursive){
                x = sadako.div(x, Integer.parseInt(numbers));
                b = x;
            }
            numbers = Integer.toString(x);
            updateL();
            updateB();
            numbers = "";
        }else if (fx == function.Rsh){
            if (md == mode.Iterative){
                x = bob.rshift(x, Integer.parseInt(numbers));
                b = x;
            }else if (md == mode.Recursive){
                x = sadako.rshift(x, Integer.parseInt(numbers));
                b = x;
            }
            numbers = Integer.toString(x);
            updateL();
            updateB();
            numbers = "";
        }else if(fx == function.Lsh){
            if (md == mode.Iterative){
                x = bob.lshift(x, Integer.parseInt(numbers));
                b = x;
            }else if (md == mode.Recursive){
                x = sadako.lshift(x, Integer.parseInt(numbers));
                b = x;
            }
            numbers = Integer.toString(x);
            updateL();
            updateB();
            numbers = "";
        }else if(fx == function.Fac){
            if (md == mode.Iterative){
                x = bob.fac(x);
                b = x;
            }else if (md == mode.Recursive){
                x = sadako.fac(x);
                b = x;
            }
            numbers = Integer.toString(x);
            updateL();
            updateB();
            numbers = "";
        }else if (fx == function.Pow){
            if (md == mode.Iterative){
                x = bob.pow(x, Integer.parseInt(numbers));
                b = x;
            }else if (md == mode.Recursive){
                x = sadako.pow(x, Integer.parseInt(numbers));
                b = x;
            }
            numbers = Integer.toString(x);
            updateL();
            updateB();
            numbers = "";
        }//else-if
    }//equals

    /**
     * This method functions similarly to a backspace key
     * The screen will be updated.
     *
     * @param ActionEvent The button press action
     */
    @FXML public void delPress(ActionEvent event){
        numbers = numbers.substring(0, numbers.length()-1);
        b = Integer.parseInt(numbers);
        updateL();
        updateB();
    }


}//controls