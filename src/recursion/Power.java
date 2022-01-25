package recursion;

public class Power {

    /*public int printPower(int x, int n) {
        if (n ==1)
            return x;
        return x*printPower(x, n-1);
    }*/

    public int printPower(int x, int n){ //0 1 2
        if (n==0) return 1;
        int xnb2 = printPower(x, n/2);
        int xn = xnb2 * xnb2;
        if (n%2!=0)
            xn = x* xn;
        return xn;
    }
}
