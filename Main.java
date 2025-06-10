import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Kenarı Giriniz : ");
        int a = scan.nextInt();

        System.out.println("2. Kenarı Giriniz : ");
        int b = scan.nextInt();


        double c = Math.sqrt ((a*a) + (b*b));
        System.out.println("Hipotenüs : " + (int)c);

        double area = (a*b) / 2.0;
        System.out.println("Üçgenin alanı : " + area);









    }
}