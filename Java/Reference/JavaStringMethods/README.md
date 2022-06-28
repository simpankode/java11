# Java String Methods

| Kata Kunci | Deskripsi | Tipe Pengembalian |
| ------------- | ------------- | ------------- |
| `charAt(int index)` | Mengambil karakter dari index tertentu | `char` |
| `codePointAt(int index)` | Mengambil karakter dari index tertentu | `int` |
| `codePointBefore(int index)` | Mengambil karakter dari index sebelumnya | `int` |
| `codePointCount(int beginIndex, int endIndex)` | Mengambil jumlah karakter dari index | `int` |
| `compareTo(String anotherString)` | Mengembalikan nilai integer yang menunjukkan perbandingan antara string ini dengan string lain | `int` |
| `compareToIgnoreCase(String str)` | Mengembalikan nilai integer yang menunjukkan perbandingan antara string ini dengan string lain dengan mengabaikan kapitalisasi | `int` |
| `concat(String str)` | Mengembalikan string yang merupakan konkatenasi dari string ini dengan string lain | `String` |
| `contains(CharSequence s)` | Mengembalikan nilai boolean yang menunjukkan apakah string ini berisi string lain | `boolean` |
| `contentEquals(CharSequence cs)` | Mengembalikan nilai boolean yang menunjukkan apakah string ini sama dengan string lain | `boolean` |
| `copyValueOf(char[] data)` | Mengembalikan string yang merupakan konkatenasi dari array karakter | `String` |
| `endsWith(String suffix)` | Mengembalikan nilai boolean yang menunjukkan apakah string ini berakhir dengan string lain | `boolean` |
| `equals(Object anObject)` | Mengembalikan nilai boolean yang menunjukkan apakah string ini sama dengan objek lain | `boolean` |
| `equalsIgnoreCase(String anotherString)` | Mengembalikan nilai boolean yang menunjukkan apakah string ini sama dengan string lain dengan mengabaikan kapitalisasi | `boolean` |
| `format(String format, Object... args)` | Mengembalikan string yang merupakan hasil format dari string format dan objek lain | `String` |
| `getBytes()` | Mengembalikan array byte yang merupakan hasil konversi dari string | `byte[]` |
| `getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)` | Mengembalikan array karakter yang merupakan hasil konversi dari string | `char[]` |
| `hashCode()` | Mengembalikan nilai integer yang menunjukkan hash code dari string | `int` |
| `indexOf(int ch)` | Mengembalikan index dari karakter yang dicari | `int` |
| `intern()` | Mengembalikan string yang merupakan string intern dari string ini | `String` |
| `isEmpty()` | Mengembalikan nilai boolean yang menunjukkan apakah string ini kosong | `boolean` |
| `lastIndexOf(int ch)` | Mengembalikan index terakhir dari karakter yang dicari | `int` |
| `length()` | Mengembalikan jumlah karakter dari string | `int` |
| `matches(String regex)` | Mengembalikan nilai boolean yang menunjukkan apakah string ini cocok dengan regex | `boolean` |
| `offsetByCodePoints(int index, int codePointOffset)` | Mengembalikan index dari karakter yang dicari dengan offset | `int` |
| `regionMatches(int toffset, String other, int ooffset, int len)` | Mengembalikan nilai boolean yang menunjukkan apakah string ini sama dengan string lain dengan offset | `boolean` |
| `replace(char oldChar, char newChar)` | Mengembalikan string yang merupakan string ini dengan karakter yang dicari diganti dengan karakter lain | `String` |
| `replaceFirst(String regex, String replacement)` | Mengembalikan string yang merupakan string ini dengan regex diganti dengan string lain | `String` |
| `replaceAll(String regex, String replacement)` | Mengembalikan string yang merupakan string ini dengan regex diganti dengan string lain | `String` |
| `split(String regex)` | Mengembalikan array string yang merupakan hasil split dari string ini dengan regex | `String[]` | 
| `startsWith(String prefix)` | Mengembalikan nilai boolean yang menunjukkan apakah string ini berawal dengan string lain | `boolean` |
| `subSequence(int beginIndex, int endIndex)` | Mengembalikan string yang merupakan sub string dari string ini | `String` |
| `substring(int beginIndex)` | Mengembalikan string yang merupakan substring dari string ini dengan index awal | `String` |
| `toCharArray()` | Mengembalikan array karakter yang merupakan hasil konversi dari string | `char[]` |
| `toLowerCase()` | Mengembalikan string yang merupakan string ini dengan huruf kecil | `String` |
| `toUpperCase()` | Mengembalikan string yang merupakan string ini dengan huruf besar | `String` |
| `toString()` | Mengembalikan string yang merupakan string ini | `String` |
| `trim()` | Mengembalikan string yang merupakan string ini dengan spasi dihapus | `String` |
| `valueOf(boolean b)` | Mengembalikan string yang merupakan string dari boolean | `String` |