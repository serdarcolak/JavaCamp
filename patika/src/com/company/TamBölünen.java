import java.util.Scanner;

public class TamBölünen {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi Giriniz : ");
        sayi = input.nextInt();

        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}
