import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Gerekli degiskenler tanimlandi.
        int birthYear, n1;
        String zodiacSign = "";
        boolean isError = false;

        // Scanner sinifina ait bir degiskeni projeye dahil ettik.
        Scanner input = new Scanner(System.in);

        // Kullanicidan dogum yilini alip ilgili degiskene atadik.
        System.out.print("Doğum Yılınızı Giriniz : ");
        birthYear = input.nextInt();

        // Dogum yilinin 12 ile modunu alip n1 adli degiskene atadik.
        n1 = birthYear % 12;

        // n1 degiskeni ile beraber switch-case yapisi kullandik.
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
        // Herhangi bir hata yok ise kullaniciya burcu ile alakali geribildirim verildi.
        if (isError == false) {
            System.out.println("Çin Zodyağı Burcunuz : " + zodiacSign);
        }
    }
}