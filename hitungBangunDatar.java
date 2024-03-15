
import java.util.Scanner;



public class hitungBangunDatar {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.BujurSangkar");
        System.out.println("2.Persegi Panjang");
        System.out.println("--- isikan pilihan");
        
        int pilihan = sc.nextInt();
        if(pilihan==1){
            BujurSangkar bs = new BujurSangkar(10);
            int luas = bs.hitungluas();
            int keliling = bs.hitungKeliling();
            System.out.println(bs);   
        }
        
    }
    
}
