package Basic;

/**
 * Variable
 */
public class Variable {

    public static void main(String[] args) {
        
        /*
         * Declare Print Variable
         */
        String nama, alamat;
        int umur;

        nama = "Prayoga Eka Ardiansyah";
        umur = 21;
        alamat = "Malang, Indonesia";

        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Alamat: " + alamat);
        
        /*
         * Declare Single Variable
         */
        int a = 5;
        int b = 6;
        int c = 50;
        System.out.println(a + b + c);

        int i = 5, j = 6, n = 50;
        System.out.println(i + j + n);

        /*
         * Declare Multiple Variable
         */
        int x, y, z;
        x = y = z = 21;

        System.out.println(x + y + z);
    }
}