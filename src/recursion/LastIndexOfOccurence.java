package recursion;

public class LastIndexOfOccurence {

    public int lastIndex(int[] array, int idx, int no) {

        if (idx<0)
            return -1;

        if (array[idx] == no)
            return idx;
        return lastIndex(array, idx-1, no);

    }
}
