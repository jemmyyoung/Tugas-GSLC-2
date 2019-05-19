package TugasGSLC2;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Utama{
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
        
        int pilihan;
        System.out.println();
        System.out.println("*************************************************"); 
        System.out.println("******* PILIH BANGUN YANG INGIN DIHITUNG ********"); 
        System.out.println("*************************************************"); 
        System.out.println("1.Hitung Lingkaran dan Tabung; ");
        System.out.println("2.Hitung Persegi Panjang dan Balok");
        System.out.println("3.Hitung Persegi dan Kubus");
        System.out.println("Choose: ");
        pilihan=scan.nextInt(); scan.nextLine();
       
        
        
        
        switch (pilihan){
                case 1:
                    double jaric1;
                    double tinggic1;
                    double volumec1;
                    double luaslingc1;
                    System.out.println("Input jari-jari :");
                    jaric1 = scan.nextDouble();scan.nextLine();
                    System.out.println("Input tinggi : ");
                    tinggic1 = scan.nextDouble();scan.nextLine();
        
                    Tabung Tabung1 = new Tabung();
                    Lingkaran L = new Lingkaran();
        
                    
                    System.out.println("Luas Lingkaran adalah : "+L.VolTabung(jaric1, tinggic1));
        
                    volumec1 = Tabung1.VolTabung(jaric1,tinggic1);
                    System.out.println("Volume Tabung adalah : "+volumec1);
                    break;
                    
                case 2:
                    double panjangc2;
                    double luasc2;
                    double t2;
                    double luaspp;
                    double  volumeb;
                     
                    	System.out.println("Input Panjang: ");
                    	panjangc2 = scan.nextDouble();scan.nextLine();
                    	System.out.println("Input Lebar: ");
                    	luasc2 = scan.nextDouble();scan.nextLine();
                    	System.out.println("Input Tinggi: ");
                    	tinggic1 = scan.nextDouble();scan.nextLine();
                    
                    PersegiPanjang PP = new PersegiPanjang();
                    Balok B = new Balok();
                    
                    luaspp = PP.luasPersegiPanjang(panjangc2, luasc2);
                    System.out.println("Luas Persegi Panjang adalah: "+luaspp);
                    
                    volumeb = B.VolBalok(panjangc2, luasc2, tinggic1);
                    System.out.println("Volume Balok adalah: "+volumeb);
                    break;
                    
                case 3: 
                    double sisic3;
                    double luasPersegi;
                    double volKubus;
                    
                    System.out.println("Input Sisi: ");
                    sisic3 = scan.nextDouble();scan.nextLine();
                    
                    Persegi P = new Persegi();
                    Kubus K = new Kubus();
                    
                    luasPersegi = P.luasPersegi(sisic3);
                    System.out.println("Luas Persegi adalah: "+luasPersegi);
                    
                    volKubus = K.volKubus(sisic3);
                    System.out.println("Volume Kubus adalah: "+volKubus);
        }
    
    }
}