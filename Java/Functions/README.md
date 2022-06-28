## Methods Java

- Metode adalah blok kode yang hanya berjalan ketika dipanggil.
- Anda dapat meneruskan data, yang dikenal sebagai  - parameter, ke dalam metode.
- Metode digunakan untuk melakukan tindakan tertentu, dan juga dikenal sebagai fungsi .
- Mengapa menggunakan metode? Untuk menggunakan kembali kode: tentukan kode sekali, dan gunakan berkali-kali.

### Contoh Methods
```java
package Functions;

public class Methods {
    
    // Panggil Methods
    public static void main(String[] args) {
        
        sayHello();
    }

    // Buat Methods
    static void sayHello() {

        System.out.println("Hello, Methods!");
    }
}

```
- `sayHello()` adalah nama metode.
-  `static` berarti metode tersebut milik kelas Utama dan bukan objek dari kelas Utama.
- `void` berarti metode ini tidak memiliki nilai balik.