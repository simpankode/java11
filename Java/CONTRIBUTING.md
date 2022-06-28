## Panduan Berkontribusi

### Kontributor

Saya sangat senang dan berterima kasih bila anda ikut berkontribusi di dalam repositori ini. Semua boleh ikut berkontribusi walaupun hal kecil dengan catatan sebagai berikut:

- Hasil pekerjaan anda adalah buatan anda sendiri dan tidak ada hak cipta dari orang lain. Jika ditemukan kesamaan, maka tidak akan saya `merge`.
- Hasil kerja anda akan berlisensi [MIT](LICENSE) ketika permintaan pull request anda sudah di merged.

### Perubahan dan Penambahan

persyaratan perubahan atau penambahan kode sebagai berikut:
- gunakan **snake_case**, **camelCase**, atau **PascalCase** dalam menamakan Variabel p.s : Var. di Java bersifat **case sensitive**
- gunakan **PascalCase** dalam pebuatan file dan package **(jangan menggunakan dash "-" atau underscore "_")**

- contoh penggunaan variabel yang baik pada java,
saya menyarankan agar menggunakan struktur kode variable pada java seperti di bawah ini:
```java
public class NamaFile {
    public static void main(String[] args) {
        int angka_satu_dua = 21; //snake_case
        int angkaSatuDua = 21;   //camelCase
        int AngkaSatuDua = 21;   //PascalCase
    }
}
```
- contoh penggunaan nama class yang baik pada java,
saya menyarankan agar menggunakan untuk kapitalisasi seperti di bawah ini:
```java
class NamaFile{
    //code
}
```

### Pull Request

- Lakukan fork pada repositori ini
- Usahakan anda membuat branch baru sebelum melakukan Pull Request
```sh
git checkout -b <nama branch>
git add .
git commit -m "add: pesan commit"
git push origin <nama branch anda>
```
- Lakukan push ke branch anda dan kemudian `open` `pull request`
- Saran pesan commit:
    - `add:` untuk menambahkan source code atau dokumentasi
    - `docs:` untuk mengubah source code atau dokumentasi
    - `fix:` untuk memperbaiki masalah pada source code atau dokumentasi
    - `feat:` untuk menambahkan fitur baru pada source code atau dokumentasi
- Jika ada kendala atau masalah dalam pull request, anda bisa laporkan masalah pada [issue](https://github.com/prayogaekaardiansyah/Java/issues)

Untuk pull request saya sarankan anda untuk menjelaskan secara detail yang anda ubah atau tambahkan, dan bersikap sopan, terhadap sesama contributor dan programmer lainnya. Terima kasih banyak sudah berkontribusi di **Java**.