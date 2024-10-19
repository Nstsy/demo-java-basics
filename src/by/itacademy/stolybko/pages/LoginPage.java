package by.itacademy.stolybko.pages;

public class LoginPage extends BasePage {
    protected String LOGIN_PAGE = BASE_URL + "/форма логина";
    private String title = "Форма логина";

    public String getTitle() {
        return title;
    }

    public void open() {
        System.out.println("Пользователь открыл страницу " + LOGIN_PAGE);
    }
}
