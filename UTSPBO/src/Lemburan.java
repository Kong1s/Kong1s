import java.util.Scanner;

public class Lemburan extends Karyawan{
    public static String nip,nidn,nama,jabatan;
    public static int jam_kerja,sks_lebih,lemburan,gaji;
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("\nMasukkan Nip: ");
        nip = input.nextLine();
        System.out.println("\nMasukkan Nidn: ");
        nidn=input.nextLine();
        System.out.println("\nMasukkan Nama :");
        nama=input.nextLine();
        System.out.println("\n Jabatan :");
        jabatan=input.nextLine();
        System.out.println("\nJam kerja :");
        jam_kerja=input.nextLine();
        System.out.println("\n SKS lebih  :");
        sks_lebih=input.nextLine();

    }
    if(jam_kerja>120){
        lemburan=jam_kerja-120;
    }else{
        lemburan=0;
    }
    swicth(jabatan){
        staff :
        gaji=2000000;
        lemburan=50000;
        break
        dosen :
        gaji =2500000;
        sks_lebih=6;
        break
        default :
            gaji=0;
            sks_lebih=0;
            lemburan=0;

    }
    lemburan =lemburan*50000;
    gaji=((lemburan+gaji+jam_kerja));
    sks_lebih =sks_lebih*100000;
    sks_lebih=((sks_lebih+gaji));


}
