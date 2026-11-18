
# Penerapan Prinsip SOLID

## 1. Single Responsibility Principle (SRP)

Prinsip SRP diterapkan pada kelas AsetController dan AsetService. AsetController bertugas menangani permintaan HTTP, sedangkan AsetService bertugas mengelola logika aplikasi aset. Pemisahan ini membuat setiap kelas memiliki tanggung jawab yang berbeda sehingga kode lebih mudah dipahami dan dirawat.

## 2. Dependency Inversion Principle (DIP)

Prinsip DIP diterapkan pada kelas AsetService yang menggunakan interface AsetRepository sebagai ketergantungan. AsetService tidak bergantung langsung pada InMemoryAsetRepository. Dengan cara ini, implementasi penyimpanan dapat diganti tanpa harus mengubah logika utama pada AsetService.

## Kesimpulan

Penerapan SRP dan DIP membantu membuat struktur program lebih terorganisasi, mudah dikembangkan, dan lebih mudah dipelihara.

