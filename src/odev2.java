import java.util.Scanner;

public class odev2 {
    public static void main(String[] args) {
    double tutar, kdvOran, kdvTutar, kdvliTutar, err;

    Scanner input = new Scanner(System.in);

    System.out.print("Ucret Tutarini Giriniz :  ");
    tutar = input.nextDouble();

    kdvOran = tutar < 1000 ? (0.18) : (0.08) ;
    kdvOran = tutar > 0 ? (0.18) : (0) ;
    System.out.println("KDV Oraniniz : " + kdvOran  + "%");
    System.out.println();

    kdvTutar = tutar * kdvOran;
    kdvliTutar = tutar + kdvTutar;

        System.out.println("Kdv'siz Tutar :" + tutar);
        System.out.println("Kdv orani :" + kdvOran + "%");
        System.out.println("Kdv Tutari :" + kdvTutar);
        System.out.println("Kdv'li Tutar :" + kdvliTutar);
    }
}
