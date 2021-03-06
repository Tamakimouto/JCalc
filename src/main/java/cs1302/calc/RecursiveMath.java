package cs1302.calc;

/**
 * RecursiveMath implements the Math interface and implements the
 * operations recursively.
 */
public class RecursiveMath
{
    public int inc(int n){
        return n+1;
    }//increment by 1

    public int dec(int n){
        return n-1;
    }//decrement by 1

    public int add(int lhs, int rhs){
        if (rhs == 0)
            return lhs;
        return add(inc(lhs), dec(rhs));
    } // takes in 2 integers and add them

    public RecursiveMath() {

    }

    public int sub(int lhs, int rhs){
        if(rhs == 0)
            return lhs;
        return sub(dec(lhs), dec(rhs));
    }//subtraction

    public int mul(int lhs, int rhs){
        return mul_acc(lhs, lhs, rhs);
    }//multiplication

    public int mul_acc(int sum, int lhs, int rhs){
        if (rhs ==0 || lhs == 0)
            return 0;
        if(rhs ==1)
            return sum;
        return mul_acc(add(sum, lhs), lhs, dec(rhs));
    }//multiplication accumulator

    public int div(int lhs, int rhs){
        return div_acc(0, lhs, rhs);
    }//division

    public int div_acc(int counter, int lhs, int rhs){
        if(lhs < rhs)
            return counter;
        if(lhs == rhs)
            return inc(counter);
        return div_acc(inc(counter), sub(lhs,rhs), rhs);
    }//division accumulator

    public int fac(int rika){
        if(rika == 0)
            return 1;
        return mul(rika, fac(dec(rika)));
    }//factorial

    public int pow(int base, int exp){
        if(exp == 0)
            return 1;
        return mul(base, pow(base, dec(exp)));
    }//factorial

    public int lshift(int lhs, int rhs){
        return mul(lhs, pow(2, rhs));
    }// left shift

    public int rshift(int lhs, int rhs){
        return div(lhs, pow(2, rhs));
    }


}