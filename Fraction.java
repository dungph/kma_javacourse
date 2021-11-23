import java.util.Scanner;
import java.util.Vector;

public class Fraction {
    int tuSo;
    int mauSo;


    Fraction() {}
    Fraction(int a, int b) {
        tuSo = a;
        mauSo = b;
    }

    public int getTuSo() {
		return tuSo;
	}


	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}


	public int getMauSo() {
		return mauSo;
	}


	public void setMauSo(int mauSo) {
		this.mauSo = mauSo;
	}


    public Fraction plus(Fraction other) {
        var ret = new Fraction();
        ret.setTuSo(this.tuSo * other.mauSo + this.mauSo * other.tuSo);
        ret.setMauSo(this.mauSo * other.mauSo);

        return ret;
    }
	
    public Fraction minus(Fraction other) {
        var ret = new Fraction();
        ret.setTuSo(this.tuSo * other.mauSo - this.mauSo * other.tuSo);
        ret.setMauSo(this.mauSo * other.mauSo);

        return ret;
    }

    public Fraction multiply(Fraction other) {
        var ret = new Fraction();
        ret.setTuSo(this.tuSo * other.tuSo);
        ret.setMauSo(this.mauSo * other.mauSo);

        return ret;
    }

    public Fraction divide(Fraction other) {
        var ret = new Fraction();
        ret.setTuSo(this.tuSo * other.mauSo);
        ret.setMauSo(this.mauSo * other.tuSo);

        return ret;
    }

    public static int gcd(int a, int b) {
       if (b==0) return a;
       return gcd(b,a%b);
    }
   
    public boolean isReduced() {
        if (mauSo == 1) {
            return true;
        } else {
            if (gcd(tuSo, mauSo) == 1) {
                return true;
            } else {
                return false;
            }
        }
    }
    
    public Fraction reduce() {
        var gcd = gcd(tuSo, mauSo);

        var ret = new Fraction();
        ret.setTuSo(tuSo/gcd);
        ret.setMauSo(mauSo/gcd);

        return ret;

    }

    public void showFraction() {
        if (this.getMauSo() == 1) {
            System.out.print(tuSo + " ");
        } else {
            System.out.print(tuSo + "/" + mauSo + " ");
        }
    }
    public static void main(String[] s) {
        var a = new Fraction();
        a.setTuSo(10);
        a.setMauSo(5);

        var b = new Fraction();
        b.setTuSo(5);
        b.setMauSo(4);
   

        System.out.print("\n 10/5 + 5/4 = ");
        a.plus(b).showFraction();
        
        System.out.print("\n 10/5 - 5/4 = ");
        a.minus(b).showFraction();
        
        System.out.print("\n 10/5 * 5/4 = ");
        a.multiply(b).showFraction();
        
        System.out.print("\n 10/5 / 5/4 = ");
        a.divide(b).showFraction();
 
        System.out.print("\n 10/5 reduce = ");
        a.reduce().showFraction();

        System.out.print("\n 10/5 reduce / 5/4 = ");
        a.reduce().divide(b).showFraction();               


        Scanner scanner = new Scanner(System.in);
        var fractions = new Vector<Fraction>();

        System.out.println("Number of Fractions: ");
        var num_of_fractions = scanner.nextInt();

        do {
            System.out.println("Nhap tu so: ");
            var ts = scanner.nextInt();
            System.out.println("Nhap mau so: ");
            var ms = scanner.nextInt();

            fractions.add(new Fraction(ts, ms));
            num_of_fractions -= 1;
        } while (num_of_fractions != 0);
           
        for (Fraction frac: fractions) {
            frac.reduce().showFraction();
            System.out.println();
        }

    }
}
