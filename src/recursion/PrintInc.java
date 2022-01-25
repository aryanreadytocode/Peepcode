package recursion;

public class PrintInc {

    public void printInc(int n) {
       if (n==0)
           return;
        printInc(n-1);
       System.out.println(n);
    }
}
