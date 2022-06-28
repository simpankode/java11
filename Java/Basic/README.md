## Basic Java

- Setiap baris kode yang berjalan di Java harus berada di dalam file class. 
- Dalam contoh saya, saya menamai kelas `HelloWorld`. 
- Kelas harus selalu dimulai dengan huruf besar pertama.

> _Catatan: Java peka huruf besar/kecil: `"Kelas Saya"`, `"kelassaya"`, dan `"KelasSaya"` memiliki arti yang berbeda.

### Contoh Program
```java
package Basic;

public class HelloWorld {

    public static void main(String[] args) {
        
        System.out.println("Hello, World!");
    }
}
```
- Metode `main()` ini diperlukan dan Anda akan melihatnya di setiap program Java:
```java
public static void main(String[] args) {
    // code
}
```
- Kode apa pun di dalam `main()` metode akan dieksekusi.
- Di dalam `main()` metode, kita dapat menggunakan     `println()` metode untuk mencetak sebaris teks ke layar.
```java
System.out.println();
```
> _Catatan: Tanda kurung kurawal `{}` menandai awal dan akhir sebuah blok kode._