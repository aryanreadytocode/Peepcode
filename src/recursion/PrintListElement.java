package recursion;

import java.util.List;

public class PrintListElement {
    public int printElements(List<Integer> list, int idx) {
        if (idx  == list.size()-1) return list.get(idx) ;
        int max1 = printElements(list, idx+1);
        int max2 = list.get(idx);
        if (max1>max2) return max1; else return max2;
    }
}
