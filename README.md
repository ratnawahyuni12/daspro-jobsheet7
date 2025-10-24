# daspro-jobsheet7

Pertanyaan Percobaan 1
1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program Percobaan 1!
jawab : perulangan FOR pada kode program percobaan 1 terletak pada "for (int i = 1; i <= 10; i++)" yang memiliki komponen-komponen berupa inisiasi = "int i = 1" artinya perulangan dimulai dari mahasiswa ke-1, kondisi = "i <= 10>" artinya kondisi ini akan dicek setiap kali perulangan dilakukan hingga i = 10, dan update = "i++" yang terkumpul di blok pernyataan = "{...}" dan dapat diartikan bahwa akan dieksekusi sebanyak 10 kali.
2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?
jawab : variabel tertinggi diinisialisasi 0 karena nilai pertama yang dimasukkan pasti lebih besar dari 0 dan menggantikan nilai awal (0), sedangkan nilai terendah diinisialisasi 100 karena nilai pertama yang dimasukkan pasti lebih kecil dari 100 dan menggantikan nilai awal (0). Yang terjadi apabila variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0 yaitu hasil perbandingan tidak akan berubah dan program memberikan hasil yang salah (selalu 100(di bagian nilai tertinggi) dan 0(di bagian nilai terendah)).
3. Jelaskan fungsi dan alur kerja dari potongan kode berikut!
if (nilai > tertinggi) {
    tertinggi = nilai;
}
if (nilai < terendah) {
    terendah = nilai;
}
jawab : fungsi dari "if (nilai > tertinggi) { tertinggi = nilai; }" adalah untuk mengecek dan memperbarui nilai tertinggi, sedangkan "if (nilai < terendah) { terendah = nilai; }" berfungsi untuk mengecek dan memperbarui nilai terendah. Kedua potongan kode tersebut bekerja sama di dalam perulangan untuk mencari nilai maksimum dan minimum dari sekumpulan data. Alur kerja potongan kode tersebut berada di dalam perulangan for, jadi prosesnya berulang untuk setiap mahasiswa. Langkah-langkah: (1) Program meminta input nilai kuis mahasiswa. (2) Nilai kuis dimasukkan dan disimpan ke variabel nilai. (3) program membandingkan: a. apakah nilai > tertinggi, jika ya maka perbarui "tertinggi". b. apakah nilai < terendah, jika ya maka perbarui "terendah". (4) Lanjut ke mahasiswa berikutnya. (5) setelah perulangan selesai, variabel "tertinggi" berisi nilai terbesar, dan "terendah" berisi nilai terkecil.
4. Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60). Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi dan terendah!
5. Commit dan push kode program ke Github

Pertanyaan Percobaan 2
1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut:
if (nilai < 0 || nilai > 100) {
    System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
    continue;
}
a. nilai < 0 || nilai > 100, berfungsi untuk: 
- memeriksa apakah nilai yang dimasukkan tidak valid. 
- tanda || menandakan jika memenuhi hanya salah satu syaratnya yaitu nilai kurang dari 0 atau nilai lebih dari 100 maka akan tetap dieksekusi, berbeda dengan && yang harus memenuhi semua syaratnya. jadi, kondisinya akan benar (true) jika salah satu dari dua perbandingan benar.
b. continue, berfungsi untuk:
- melewati (skip) iterasi saat ini (1 iterasi saja) dan melanjutkan ke iterasi berikutnya. setelah continue, program tidak akan menjalankan perintah di bawahnya dalam loop, tetapi akan langsung melanjutkan ke iterasi berikutnya.
- pada saat kondisi "if" benar maka program akan menampilkan pesan "Nilai tidak valid. Masukkan lagi nilai yang valid!". lalu perintah continue dijalankan dengan artian:
  -> program tidak akan menjalankan perintah-perintah lain di dalam perulangan setelah continue.
  -> langsung lompat ke awal perulangan berikutnya.
2. Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya dituliskan di awal perulangan WHILE?
jawab : sintaks i++ dituliskan di akhir perulangan WHILE karena perulangan WHILE akan mengecek kondisi di awal sebelum menjalankan isi perulangan. jadi, nilai i ditingkatkan setelah pernyataan di dalam perulangan dijalankan. posisi i++ di akhir dapat memastikan bahwa nilai pertama (i = 1) juga ikut diproses terlebih dahulu sebelum dinaikkan.
yang terjadi apabila nilai i++ dituliskan di awal perulangan WHILE yaitu akan melewati nilai awal dan bergeser satu langkah (nilai 1 tidak pernah ditampilkan). posisi ini dapat dilakukan untuk kita yang memang ingin melewati nilai awal tertentu. 
3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE akan berjalan?
jawab : apabila jumlah mahasiswa yang dimasukkan adalah 19, maka perulangan WHILE akan berjalan sebanyak 19 kali jika kondisinya i <= 19.
4. Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A, program menampilkan pesan tambahan "Bagus, pertahankan nilainya"!
5. Commit dan push kode program ke Github