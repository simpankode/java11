package Basic;

/**
 * ManipulasiString
 */
public class StringJava {

    public static void main(String[] args) {
        
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(alfabet.length());

        String name = "Prayoga Eka Ardiansyah";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name.indexOf("Eka"));
    }
}