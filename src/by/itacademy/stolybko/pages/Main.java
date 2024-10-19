package by.itacademy.stolybko.pages;

public class Main {
    public static void main(String[] args) {
        HomePage homePage = new HomePage();
        homePage.open();
        System.out.println("Site name: " + homePage.getTitle());
        homePage.clickLogin();
        LoginPage loginPage = new LoginPage();
        loginPage.open();
        System.out.println("Tiltle login form: " + loginPage.getTitle());
    }
}
