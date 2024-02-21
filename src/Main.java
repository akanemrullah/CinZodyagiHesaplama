import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int birthYear, n1;
        String zodiacSign = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz : ");
        birthYear = input.nextInt();

        n1 = birthYear % 12;

        switch (n1) {
            case 0:
                zodiacSign = "Maymun";
                break;
            case 1:
                zodiacSign = "Horoz";
                break;
            case 2:
                zodiacSign = "Kopek";
                break;
            case 3:
                zodiacSign = "Domuz";
                break;
            case 4:
                zodiacSign = "Fare";
                break;
            case 5:
                zodiacSign = "Okuz";
                break;
            case 6:
                zodiacSign = "Kaplan";
                break;
            case 7:
                zodiacSign = "Tavsan";
                break;
            case 8:
                zodiacSign = "Ejderha";
                break;
            case 9:
                zodiacSign = "Yilan";
                break;
            case 10:
                zodiacSign = "At";
                break;
            case 11:
                zodiacSign = "Koyun";
                break;
            default:
                isError = true;
                break;
        }
        if (isError == false) {
            System.out.println("Çin Zodyağı Burcunuz : " + zodiacSign);
        }
    }
}