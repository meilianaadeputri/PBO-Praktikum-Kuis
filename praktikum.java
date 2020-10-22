import java.util.Scanner;
public class praktikum {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nama anda: ");
		String nama = input.nextLine();
		System.out.print("Masukkan merk (G/O): ");
		char merk = input.next().charAt(0);
		System.out.print("Masukkan tipe (M/K/L): ");
		char tipe = input.next().charAt(0);
		System.out.print("Masukkan jumlah unit: ");
		int jumlah = input.nextInt();
		
		int harga=0;
		if (merk=='G') {
			switch(tipe) {
			case 'M': harga=95000; break;
			case 'K': harga=125000; break;
			case 'L': harga=450000; break;
			default: System.out.println("Tipe salah"); System.exit(0);
		}
		} else if (merk=='O') {
			switch(tipe) {
			case 'M': harga=115000; break;
			case 'K': harga=135000; break;
			case 'L': harga=550000; break;
			default: System.out.println("Tipe salah"); System.exit(0);
		} 
		} else
			{System.out.println("Merk salah"); System.exit(0);}

		float total = jumlah*harga;
		System.out.println("Total: Rp" + (int)total);
		
		System.out.print("Jumlah bayar: Rp");
		int bayar = input.nextInt();
		float kembalian = bayar-total;
		
		System.out.println("======================================");
		System.out.println("Nama       	: " + nama);
		System.out.println("Total harga	: Rp" + (int)total);
		System.out.println("Bayar		: Rp" + bayar);
		System.out.println("Kembalian	: Rp" + (int)kembalian);
	}
}