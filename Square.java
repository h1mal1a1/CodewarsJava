public class Square {
    public static boolean isSquare(int n) {
        var sum =0;
        for(int i=1;sum<n;i+=2)
            sum+=i;
        return sum==n;
    }
}
