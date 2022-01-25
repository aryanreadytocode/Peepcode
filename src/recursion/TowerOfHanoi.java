package recursion;

public class TowerOfHanoi {
    public void printSteps(int noOfDisc, int tower1, int tower2, int tower3) {
        if (noOfDisc==0) return;
        printSteps(noOfDisc-1, tower1, tower3, tower2);
        System.out.println(noOfDisc+"["+tower1+"->"+tower2+"]");
        printSteps(noOfDisc-1, tower3, tower2, tower1);
    }
}
