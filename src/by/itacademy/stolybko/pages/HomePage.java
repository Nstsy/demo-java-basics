package by.itacademy.stolybko.pages;

public class HomePage extends BasePage {
    protected String HOME_URL = BASE_URL + "/home page";
    private String title = "Home page";

    public void open() {
        System.out.println("The user opened the page " + HOME_URL);
    }

    public String getTitle() {
        return title;
    }

    public void clickLogin() {
        System.out.println("The user clicked the Login button");
    }
}
