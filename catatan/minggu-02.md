# Catatan Minggu 02: Struktur OOP: Class, Object, Encapsulation

## Yang saya kerjakan

Pada minggu ini saya mengerjakan class Aset pada project Aset-Pinjam. Saya membuat validasi pada atribut kode dan nama agar tidak menerima nilai kosong atau hanya berisi spasi. Saya juga menjalankan pengujian menggunakan Maven untuk memastikan program berjalan sesuai ketentuan. Setelah melakukan perbaikan, seluruh 11 pengujian pada Minggu 01 dan Minggu 02 berhasil.

## Keputusan desain

Saya menggunakan method validateString() untuk memeriksa nilai kode dan nama agar validasi tidak perlu ditulis berulang kali. Saya menggunakan isBlank() karena method ini dapat mendeteksi teks kosong maupun teks yang hanya berisi spasi. Jika data tidak valid, program akan memberikan IllegalArgumentException.

## Kendala

Kendala yang saya temui adalah pengujian masih gagal ketika kode atau nama hanya berisi spasi. Awalnya saya menggunakan isEmpty(), tetapi ternyata method tersebut hanya mendeteksi teks kosong. Saya mengatasinya dengan mengganti isEmpty() menjadi isBlank(), kemudian menjalankan ulang pengujian sampai berhasil.

## Penggunaan AI

Alat yang dipakai: ChatGPT.

Bagian yang dibantu AI: Class Aset, terutama constructor dan method validateString().

Prompt utama:

"Bantu saya memperbaiki error pada pengujian Minggu 02."

"Jelaskan kenapa validasi menggunakan isEmpty() belum berhasil."

"Bagaimana cara menolak input yang berisi spasi saja menggunakan Java?"

Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya menyesuaikan perbaikan dengan kode yang sudah ada dan hanya mengubah bagian validasi yang diperlukan agar bagian lain tidak terganggu.

Satu hal yang saya pahami lebih baik sekarang: Saya memahami perbedaan isEmpty() dan isBlank(). isEmpty() memeriksa apakah teks benar-benar kosong, sedangkan isBlank() juga memeriksa teks yang hanya berisi spasi.