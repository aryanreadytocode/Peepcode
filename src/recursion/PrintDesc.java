package recursion;

import java.util.Scanner;

public class PrintDesc {

    public void printDesc(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        printDesc(n-1);
    }
}
