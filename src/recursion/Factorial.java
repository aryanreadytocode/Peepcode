package recursion;

public class Factorial {

    public Integer printFactorial(int n){
        if (n==0)
            return 1;
        System.out.println(n);
        return n * printFactorial(n-1);
    }
}
