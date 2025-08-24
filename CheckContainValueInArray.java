public class CheckContainValueInArray
{
    public static boolean check(Object[] a, Object x) {
        for(var v:a)
            if(v==x) return true;
        return false;
    }
}
