package lesson_4_tasks;

/*
Дано слово из четного числа букв. Поменять местами его половины.
Вывести полученную строку в верхнем регистре.
 */


public class Task_3 {

    public static void main(String[] args) {

        String entryWord = "Половина";

        String upperEntryWord = entryWord.toUpperCase();

        char[] arrayS = upperEntryWord.toCharArray();

        String resultFirstHalf = "";
        String resultSecondHalf = "";

        for (int i = 0; i < arrayS.length/2; i++) {
            resultFirstHalf += arrayS[i];
        }
        for (int i =  arrayS.length/2; i < arrayS.length; i++) {
            resultSecondHalf += arrayS[i];
        }

        System.out.println(resultSecondHalf + resultFirstHalf);
    }
}
