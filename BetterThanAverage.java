public class BetterThanAverage {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int avarage = 0;
        for(int value: classPoints)
            avarage += value;
        return avarage/classPoints.length < yourPoints;
    }
}
