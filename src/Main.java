import recursion.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        new PrintDesc().printDesc(6);
//        new PrintDescPrintInc().printDescPrintInc(5);
//        System.out.println("Factorial : "+3+" :  "+new Factorial().printFactorial(3));
//        System.out.println("Print : "+ new Power().printPower(3,3));
//        new TowerOfHanoi().printSteps(4,10, 11, 12);
        /*List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(9);
        list.add(0);
        list.add(78);
        list.add(5);
        list.add(-1);
        list.add(-1);
        list.add(8);
        System.out.println("Max no :"+ new PrintListElement().printElements(list,0));*/

//        int[] array = {1,2,3,2,9, 0,5,3,6,50,-1, 0, 9, 7};
//        System.out.println("FirstIndex :"+ new FirstIndexOfOccurence().firstIndex(array,10, 0));
//        System.out.println("LastIndex :"+ new LastIndexOfOccurence().lastIndex(array,array.length-1, 91));

//        int[] array = {1, 2, 3, 2, 9, 0, 5, 3, 6, 50, -1, 0,3, 9, 7};

//        System.out.println("LastIndex :"+ Arrays.toString(new AllIndicesOfArray().findIndices(array, 0, 0, 36)));

        String abc = "abc";
        System.out.println("Sub sequence "+new SubSequence().gss(abc));
    }
}
