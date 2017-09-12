package lesson_5_tasks;

/*
Реализовать класс Статьи с двумя методами – создать статью и отобразить статью
 */

public class Article {

    //Блок переменных - полей статьи
    private int numOfSheets;
    private String nameOfArticle;
    private String nameOfAuthor;

    //Метод создания статьи и инициализации полей
    private void createArticle(int numOfSheets, String nameOfAuthor, String nameOfArticle) {
        this.numOfSheets = numOfSheets;
        this.nameOfAuthor = nameOfAuthor;
        this.nameOfArticle = nameOfArticle;
    }

    private void showArticle () {
        System.out.println("Статья под заголовком: " + this.nameOfArticle + "\n"
                + "Под авторством: " + this.nameOfAuthor + "\n"
                + "Содержит в себе: " + this.numOfSheets + " страниц(ы).");
    }

    public static void main(String[] args) {
        Article article = new Article();

        article.createArticle(123, "Виктор Пелевин", "Кому на Руси жить хорошо?");

        article.showArticle();
    }
}
