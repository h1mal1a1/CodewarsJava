public class FakeBinary {
    public static String fakeBin(String numberString) {
        StringBuilder resultString = new StringBuilder();
        for(char s: numberString.toCharArray()){
            if(Integer.parseInt(Character.toString(s)) < 5)
                resultString.append("0");
            else
                resultString.append("1");
        }
        return resultString.toString();
    }
}
