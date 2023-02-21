import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//Билет 5
        String[] book = new String[]{"Защита Лужина", "Прощай оружие", "Процесс"};
        String[] author = new String[]{"Владимир Набоков", "Эрнест Хемингуэй", "Франц Кафка"};
        String[] bookAuthor = new String[book.length];
        for (int i = 0; i < bookAuthor.length; i++) {
            bookAuthor[i] = "\"" + book[i] + "\" " + author[i];
        }
        System.out.println(Arrays.toString(bookAuthor));

    }
}


