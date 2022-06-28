package Functions;

public class MethodsParameter {
    
    public static void main(String[] args) {
        
        name("Prayoga Eka Ardiansyah", 21, "Malang, Indonesia");
    }

    static void name(String nama, int umur, String alamat) {

        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Alamat: " + alamat);
    }
}
