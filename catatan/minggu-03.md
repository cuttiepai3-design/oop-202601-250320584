# Catatan Minggu 03: Inheritance

## 1. Tujuan

- Membuat hierarki class menggunakan inheritance.
- Menggunakan kembali kode dari class induk.
- Memahami keterbatasan inheritance dibandingkan komposisi.

## 2. Yang Saya Kerjakan

Saya membuat tiga class turunan dari class `Aset`, yaitu `Ruang`, `Laptop`, dan `AlatLab`. Setiap class memiliki atribut dan validasi sesuai ketentuan tugas. Saya juga menerapkan method `getJenis()` untuk mengembalikan jenis aset masing-masing. Setelah selesai, saya menjalankan pengujian untuk memastikan semua class berjalan dengan benar.

## 3. Keputusan Desain

Saya menggunakan inheritance dengan `extends Aset` agar class turunan dapat menggunakan atribut dan validasi dari class induk. Setiap class memiliki atribut tambahan sesuai jenis asetnya. Saya menggunakan `super(kode, nama)` untuk memanggil konstruktor class induk dan menggunakan enum `JenisAset` pada method `getJenis()`.

**Pembagian field:**

- Class `Aset`: `kode` dan `nama`.
- Class `Ruang`: `kapasitas`.
- Class `Laptop`: `spesifikasi` dan `nomorInventaris`.
- Class `AlatLab`: `laboratorium` dan `tingkatRisiko`.

## 4. Validasi

Validasi yang diterapkan:

- Kapasitas ruang harus lebih dari 0.
- Spesifikasi dan nomor inventaris laptop tidak boleh kosong.
- Laboratorium tidak boleh kosong.
- Tingkat risiko tidak boleh null.
- Validasi dari class `Aset` tetap berlaku pada semua subclass.

## 5. Method getJenis()

Setiap class memiliki method `getJenis()` dengan hasil:

- `Ruang` mengembalikan `RUANG`.
- `Laptop` mengembalikan `LAPTOP`.
- `AlatLab` mengembalikan `ALAT_LAB`.

## 6. Kendala

Saya sempat mengalami kesalahan pada tipe pengembalian method `getJenis()`. Awalnya menggunakan `String`, tetapi ternyata class induk menggunakan enum `JenisAset`. Saya memperbaikinya sesuai tipe data dari class induk. Setelah itu, seluruh pengujian berhasil dijalankan dengan hasil 19 tes berhasil dan 0 gagal.

## 7. Keterbatasan Inheritance

Inheritance kurang tepat untuk hubungan yang bukan merupakan turunan dari suatu class.

Contohnya, baterai pada laptop lebih tepat menggunakan komposisi karena baterai merupakan bagian dari laptop, bukan turunan dari laptop.


## 9. Penggunaan AI

- Alat yang dipakai: ChatGPT.
- Bagian yang dibantu AI: Pembuatan dan perbaikan kode class turunan.
- Prompt utama: "Bantu buatkan kode inheritance sesuai ketentuan tugas."
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Menyesuaikan tipe data getJenis() menjadi JenisAset agar sesuai dengan class induk.
- Satu hal yang saya pahami lebih baik sekarang: Cara kerja inheritance dan penggunaan extends dalam Java.