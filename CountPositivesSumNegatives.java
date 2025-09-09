import java.util.Arrays;
public class CountPositivesSumNegatives {
    public static int[] countPositivesSumNegatives(int[] input) {
        return (input == null || input.length == 0) ? new int[]{} :
                new int[]{Arrays.stream(input).filter(n -> n > 0).toArray().length,
                        Arrays.stream(input).filter(n -> n < 0).sum()};
    }
}
