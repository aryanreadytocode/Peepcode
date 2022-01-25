package recursion;

import java.util.ArrayList;
import java.util.List;

public class GetKeypadCombination {

    String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vxw", "yz"};

    public List<String> getKPC(String str) { //573
        if (str.length() == 0) {
            List<String> myres1 = new ArrayList<>();
            myres1.add("");
            return myres1;
        }
        char ch = str.charAt(0); //753>7 //53>5
        String ros = str.substring(1);//753>53//53>3

        List<String> rres = getKPC(ros); //753//53//3
        List<String> mres = new ArrayList<>();

        String codeForEach = codes[ch-'0'];

        for (int i = 0; i < codeForEach.length(); i++) {
            char chcode =  codeForEach.charAt(i);
            for (String rstr : rres){
                mres.add(chcode+rstr);
            }
        }
        return mres;
    }
}
