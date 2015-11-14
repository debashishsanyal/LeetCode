import java.util.*;

public class Solution {
    public boolean isAnagram(String s, String t) {


        int slen,tlen;
        slen=s.length();
        tlen=t.length();


        if(slen ==0 && tlen ==0)
        return true;

        else if(slen == 0 || tlen ==0)
        return false;

        else if(slen != tlen)
        return false;


        int[] alpha = new int[26];
        int i,j,c;


        for(i=0;i<slen;i++)
        {
            j=s.charAt(i);
            j=j-97;


            alpha[j]++;
        }


        for(i=0;i<tlen;i++)
        {
                j=t.charAt(i);
                j=j-97;
                if(alpha[j]>0)
                {
                    alpha[j]--;

                }
                else
                return false;
        }










        return true;

    }
}
