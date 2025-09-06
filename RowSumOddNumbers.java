import java.util.ArrayList;
import java.util.List;

public class RowSumOddNumbers {

    private static int GetSumOfArrayList(ArrayList<Integer> primeNumbs)
    {
        int sum =0;
        for(int elem:primeNumbs)
            sum+=elem;
        return sum;
    }

    public static int rowSumOddNumbers(int n) {
        if (n == 1) return 1;
        ArrayList<Integer> primeNumbs = new ArrayList<>(List.of(1, 3));
        int cntElements = (n * (n + 1)) / 2;

        for (int j = 5; primeNumbs.size() < cntElements; j += 2)
            primeNumbs.add(j);
        int cntElemsBefore = ((n - 1) * n) / 2;
        var newArray = new ArrayList<>(primeNumbs.subList(cntElemsBefore, cntElements));
        return GetSumOfArrayList(newArray);
    }
}
