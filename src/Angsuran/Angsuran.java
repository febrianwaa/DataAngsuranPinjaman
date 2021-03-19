package Angsuran;

//import java.util.Scanner;

public class Angsuran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner x=new Scanner(System.in);
	     int lama;
	     double hutang,bunga1,bunga,angsur,sisa;
	     double total=0,bayar;
	     
	     System.out.println("       ANGSURAN PEMINJAMAN");
	     System.out.println("===================================================");
	     System.out.print("Besar Pinjaman        = 20000000");hutang= 20000000;
	     System.out.println();
	     System.out.print("Lama Angsuran (bulan) = 15");lama= 15;
	     System.out.println();
	     
	     for(int a=1;a<=lama;a++){
	    	 angsur=hutang/lama;
	    	 sisa=hutang-angsur*a;
	    	 bunga=0.012;
	    	 bunga1=bunga*hutang; 
	    	 bayar=bunga1+angsur;
	    	 total+=bayar;
	    
	    System.out.println("Angsuran Bulan ke - "+a);
	    System.out.println("----------------------------");
	    System.out.printf("Suku bunga     = %.2f",bunga);
	    System.out.println(" persen");
	    System.out.printf("Besar bunga    = %.2f",bunga1);
	    System.out.println(" Rupiah");
	    System.out.printf("Bayar          = %.2f",bayar);
	    System.out.println(" Rupiah");
	    System.out.printf("Sisa Pinjaman  = %.2f",sisa);
	    System.out.println(" Rupiah");
	    System.out.println("----------------------------");
	     }
	   
	}
}