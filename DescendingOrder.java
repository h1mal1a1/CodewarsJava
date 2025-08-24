import java.util.ArrayList;
import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        var ca = Integer.toString(num).toCharArray();
        ArrayList<Integer> l = new ArrayList<>();
        for(char c:ca)
            l.add(Character.getNumericValue(c));
        Collections.sort(l);
        Collections.reverse(l);
        var numb = 0;
        for(int i=0,j=l.size()-1;i<l.size();i++,j--)
            numb += (int) (l.get(i) * Math.pow(10, j));

        return numb;
    }
}
