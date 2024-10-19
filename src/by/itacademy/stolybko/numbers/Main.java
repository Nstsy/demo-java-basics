package by.itacademy.stolybko.numbers;

public class Main {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(getNameNumber(number));
    }

    public static String getNameNumber(int number) {
        String numberAsAString = "";
        switch (number) {
            case 1:
                numberAsAString = "one";
                break;
            case 2:
                numberAsAString = "two";
                break;
            case 3:
                numberAsAString = "three";
                break;
            case 4:
                numberAsAString = "four";
                break;
            case 5:
                numberAsAString = "five";
                break;
            case 6:
                numberAsAString = "six";
                break;
            case 7:
                numberAsAString = "seven";
                break;
            case 8:
                numberAsAString = "eight";
                break;
            case 9:
                numberAsAString = "nine";
                break;
            case 0:
                numberAsAString = "zero";
                break;
            default:
                numberAsAString = "";
                break;
        }
        return numberAsAString;
    }
}
