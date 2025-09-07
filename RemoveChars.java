public class RemoveChars {
    public static String remove(String str) {
        if(str.length()==2) return "";
        return new StringBuilder(str).deleteCharAt(str.length()-1).deleteCharAt(0).toString();
    }
}
