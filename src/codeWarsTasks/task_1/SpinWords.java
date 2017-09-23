package codeWarsTasks.task_1;

public class SpinWords {

    public String spinWords(String sentence) {
        String[] stringArrray = sentence.split(" +");

        if (sentence.contains(" ")) {
            for (int i = 0; i < stringArrray.length; i++) {
                if(stringArrray[i].length() >= 5) {
                    String buffer = new StringBuffer(stringArrray[i]).reverse().toString();
                    stringArrray[i] = buffer;
                }
            }
            String result = "";
            for (String s : stringArrray) {
                result += s + " ";
            }
            return result.trim();
        }
        else return new StringBuffer(sentence).reverse().toString();
    }


    public static void main(String[] args) {

        System.out.println(new SpinWords().spinWords("Hey fellow warriors"));
    }
}