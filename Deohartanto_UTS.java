package deohartanto;

import java.util.Scanner;


public class Deohartanto_UTS {

	public static void main(String[] args) 
	{
		String nama, npm;
		
		 final double nilai , bobot , ipsmaster , sks , n_akhir;

	
		 @SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
	        
	        System.out.println("===== Menghitung Nilai Mahasiswa=====\n");

	        System.out.print("Masukan nama : ");

	        nama = input.nextLine();

	        System.out.print("Masukan npm : ");

	        npm = input.nextLine();

	        System.out.print("Nilai : ");

	        nilai  = input.nextInt();

	        System.out.print("bobot : ");

	        bobot = input.nextInt();

	        System.out.print("ipsmaster : ");

	        ipsmaster = input.nextInt();

	        System.out.print("sks : ");

	        sks = input.nextInt();

	        n_akhir = (0.15 * nilai + 0.20 * bobot + 0.30 * ipsmaster + 0.35 * sks );

	        System.out.println(nama+" dengan npm "+npm+" memiliki nilai akhir "+n_akhir);

	        


	}

}
