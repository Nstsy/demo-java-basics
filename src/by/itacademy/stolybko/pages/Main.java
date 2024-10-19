package by.itacademy.stolybko.pages;

public class Main {
    public static void main(String[] args) {
        HomePage homePage = new HomePage();
        homePage.open();
        System.out.println("Site name: " + homePage.getTitle());
    }
}
