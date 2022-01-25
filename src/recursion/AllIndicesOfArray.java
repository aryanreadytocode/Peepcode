package recursion;

public class AllIndicesOfArray {

    public int[] findIndices(int[] array, int index, int fsf, int target) {
        if(index == array.length)
            return new int[fsf];

        int[] iarr;
        if (array[index] == target){
            iarr = findIndices(array, index + 1, fsf + 1, target);
            iarr[fsf] = index;
        }else {
            iarr = findIndices(array, index + 1, fsf, target);
        }
        return iarr;
    }
}
