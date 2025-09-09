public class DisemvowelTrolls {
    public static String disemvowel(String str) {
        for(var c : new String[] {"(?i)a","(?i)e","(?i)i","(?i)o","(?i)u"})
            str=str.replaceAll(c,"");
        return str;
    }
}
