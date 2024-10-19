package by.itacademy.stolybko.pages;

public class BasePage {
    protected String BASE_URL = "BASE URL";

    public void open(String BASE_URL){
        System.out.println("Пользователь открыл страницу" + BASE_URL);
    }
}
