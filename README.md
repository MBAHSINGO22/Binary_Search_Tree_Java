# 📝 BinarySearch_Tree_Java

Implementasi Binary Search Tree di Java.  
Proyek pembelajaran Java yang menunjukkan struktur data Binary Search Tree dengan operasi penambahan dan pencarian node.

## 📖 Deskripsi Proyek

**Binary_Search_Tree_Java** adalah proyek pembelajaran Java yang mengimplementasikan Binary Search Tree (BST) sederhana. Proyek ini berfokus pada:

- **📊 TreeNode.java**: Kelas dasar untuk node pohon dengan data integer, left node, dan right node.
- **🔍 Tree.java**: Kelas utama untuk mengelola BST dengan metode `add` untuk penambahan node dan `getNode` untuk pencarian berdasarkan key.
- **🛠️ MainTree.java**: Kelas utama untuk menguji BST dengan menambahkan beberapa elemen dan melakukan pencarian pada key tertentu.

Proyek ini terdiri dari tiga file Java (`MainTree.java`, `Tree.java`, `TreeNode.java`) dalam paket **PERTEMUAN3**. Cocok untuk pemula yang ingin mempelajari struktur data BST. 🟢

## 🧠 Teknologi
- Java

## 📂 Struktur File
```
Binary_Search_Tree_Java/
├── src/PERTEMUAN3/
│   ├── MainTree.java            # 🛠️ Kelas utama untuk pengujian
│   ├── Tree.java                # 🔍 Kelas untuk BST
│   ├── TreeNode.java            # 📊 Kelas node pohon
├── README.md                    # 📖 Dokumentasi proyek
```

## ▶️ Menjalankan Program

1. **Kloning Repositori**:
```bash
git clone https://github.com/MBAHSINGO22/Binary_Search_Tree_Java.git
cd Binary_Search_Tree_Java
```

2. **Pastikan Java Terinstal**:
```bash
java -version
```
Jika belum terinstal, unduh dari [java.com](https://www.java.com).

3. **Kompilasi dan Jalankan Kode**:
Pastikan struktur paket dipertahankan.

Kompilasi:
```bash
javac -d bin src/PERTEMUAN3/*.java
```

Jalankan:
```bash
java -cp bin PERTEMUAN3.MainTree
```

## 🟢 Catatan
- Pastikan Anda memiliki Java Development Kit (JDK) yang terinstal.
- BST diinisialisasi kosong dan elemen ditambahkan secara berurutan:
  `42, 21, 38, 27, 71, 82, 55, 63, 6, 2, 40, 12`
- Pencarian dilakukan dengan metode `getNode` yang mengembalikan node jika key ditemukan, atau `null` jika tidak ada.
- Tidak ada dependensi eksternal; gunakan pustaka standar Java.

## 📈 Contoh Output
```
Elemen-elemen yang ditambahkan ke Tree:
42, 21, 38, 27, 71, 82, 55, 63, 6, 2, 40, 12

Node dengan key = 27 ditemukan.
Node dengan key = 100 tidak ditemukan.
```

## 👨‍💻 Pengembang
MBAHSINGO22  
🔗 GitHub
