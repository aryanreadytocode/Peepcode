package recursion;

public class FirstIndexOfOccurence {

    /*public int firstIndex(int[] array, int no, int idx) {
        if (idx == array.length) {
            return -1;
        }

        int index1 = firstIndex(array, no , idx+1);
        int index2 = array[idx];
        if (index2 == no) return idx; else return index1;
    }*/

    public int firstIndex(int[] array, int no, int idx) {
        if (idx == array.length) {
            return -1;
        }
        if (array[idx] == no)
            return idx;
        return firstIndex(array,no, idx+1);
    }
}
