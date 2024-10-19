package by.itacademy.stolybko.pages;

public class LoginPage extends BasePage {
    protected String LOGIN_PAGE = BASE_URL + "/login form";
    private String title = "Login form";

    public String getTitle() {
        return title;
    }

    public void open() {
        System.out.println("The user opened the page  " + LOGIN_PAGE);
    }
}
