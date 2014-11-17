package cs1302.calc;

// In this file, create an IterativeMath class that implements the Math interface
// according to the rules presented in the project description

public class IterativeMath implements Math {

    public IterativeMath(){
    
    }

    public int inc(int rika){
	return rika + 1;
    }//inc

    public int dec(int deko){
	return deko - 1;
    }//dec 

    public int add(int nibu, int mori) {
	int sum = nibu;    
	while (mori > 0) {
	    sum = inc(sum);
	    mori = dec(mori);
	} // while
	return sum;
    } // add

    public int sub(int nibu, int mori) {
	int sum = nibu;    
	while (mori > 0) {
	    sum = dec(sum);
	    mori = dec(mori);
	} // while
	return sum;
    } // sub

    public int mul(int hai, int bana) {
	int prod = hai;
	while (bana > 0) {
	    prod = add(prod, hai);
	    bana = dec(bana);
	}//while
	return prod;
    }//mul

    public int div(int gero, int kero) {
	int res = 0;
	int nGero = gero;
	while (sub(nGero, kero) >= 0){
	    res ++;
	    nGero = sub(nGero, kero);    
	}//while
	return res;
    }//div

    public int fac(int bara) {
	int hana = bara;
	int sum = bara;
	while (hana > 0) {
	    hana = dec(hana);
	    sum = mul(sum, hana);
	}//while
	return sum;
    }//fac

    public int pow(int rika, int toga) {
	int sum = rika;
	while (toga > 0) {
	    sum = mul(sum, rika);
	    toga = dec(toga);
	}//while
	return sum;
    }//pow

    public int lshift(int meguka, int sayak) {
	return mul(meguka, pow(2, sayak));
    }//lshift
    
    public int rshift(int homu, int kyouko) {
	return div(homu, pow(2, kyouko));
    }//rshift

}//iterative math
