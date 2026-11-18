# Catatan Minggu 06: UML dan SOLID

## Yang saya kerjakan
Dengan menggunakan PlantUML, saya membuat class diagram untuk menunjukkan struktur dan hubungan antar kelas dalam sistem Asset-Pinjam. Selain itu, saya membuat diagram urutan dengan dua skenario—berhasil dan bentrok, untuk proses pengajuan pinjaman. Saya juga menyusun penjelasan mengenai konsep-konsep SOLID yang diterapkan dalam kode program.

## Keputusan desain
Saya memilih PlantUML karena mudah dimodifikasi dan memungkinkan saya membuat diagram menggunakan kode. Saya memanfaatkan fragmen `alt` dalam diagram urutan untuk membedakan antara skenario yang bentrok dan skenario dengan pengajuan pinjaman yang berhasil. Berdasarkan penggunaan antarmuka repositori dan pemisahan tanggung jawab kelas, saya memilih prinsip SRP dan DIP dari SOLID.

## Kendala
Catatan skenario konflik pada diagram urutan agak sulit bagi saya untuk disajikan. Untuk memastikan kedua kondisi tidak bentrok dan bentrok, terlihat jelas pada gambar, saya mengubah atribut `alt`.

## Penggunaan AI
Saya mempelajari UML, PlantUML, dan konsep-konsep SOLID melalui ChatGPT.

- **Prompt:** Meminta bantuan membuat class diagram, sequence diagram yang berisi skenario berhasil dan bentrok, serta pemahaman tentang prinsip-prinsip SOLID.
- **Perubahan:** Untuk menyesuaikan diagram-diagram tersebut dengan struktur pengkodean proyek, saya melakukan perubahan berdasarkan rekomendasi AI.
- **Hal baru:** Saya memahami perbedaan class diagram dan sequence diagram serta penerapan prinsip SRP dan DIP.