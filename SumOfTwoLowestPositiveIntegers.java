public class SumOfTwoLowestPositiveIntegers {
    public static long sumTwoSmallestNumbers(long[] numbers) {
        long a = numbers[0], b = numbers[1];
        if (a > b) {
            var c = a;
            a = b;
            b = c;
        }


        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] < a) {
                b = a;
                a = numbers[i];
                continue;
            }
            if (numbers[i] < b)
                b = numbers[i];
        }
        return a + b;
    }
}
