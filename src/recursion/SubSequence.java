package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {

    public List<String> gss(String str) {

        if (str.isEmpty()){
            List<String> res = new ArrayList<>();
            res.add("");
            return res;
        }

        char zc = str.charAt(0);
        String ss = str.substring(1);
        List<String> res = gss(ss);
        List<String> myRes = new ArrayList<>();
        for (String s: res){
            myRes.add(""+s);
            myRes.add(zc+s);
        }
        return myRes;
    }
}
