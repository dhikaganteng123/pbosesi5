
public class BujurSangkar extends BangunDatar {
    
    BujurSangkar (int s) {
        super(s);
    }
    
    int hitungluas(){
        int s = super.getS();
        
        return s * s;
    }
    
    int hitungKeliling(){
        int s = super.getS();
        return s + s + s;    
    }
    public String toString(){
        String hasil = "Luas Persegi Panjang : " + hitungluas()+ "\n" +
        "Keliling Persegi Panjang : " + hitungKeliling();
        
        return hasil;
    }
}
