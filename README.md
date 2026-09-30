# My Profile App

Aplikasi "My Profile App" yang dibangun menggunakan **Kotlin Multiplatform** dan **Compose Multiplatform**. Aplikasi ini menampilkan halaman profil yang berisi:
- Header dengan foto profil (circular) dan nama
- Bio/deskripsi singkat
- List informasi: Email, Phone, Location

Terdapat 3 Composable Functions yang reusable:
1. `ProfileCard`: Membungkus konten profil dengan Card UI.
2. `ProfileHeader`: Menampilkan foto profil melingkar, nama, dan deskripsi/bio.
3. `InfoItem`: Menampilkan baris informasi beserta icon.

Komponen yang digunakan dalam aplikasi ini meliputi: `Column`, `Row`, `Box`, `Card`, `Text`, `Button`, `Image`, dan `Icon`.

## Screenshot

### Android
![Screenshot Android](screenshot_android.png) <!-- Tambahkan screenshot Android di root project dengan nama file screenshot_android.png -->

### Desktop
![Screenshot Desktop](screenshot_desktop.png) <!-- Tambahkan screenshot Desktop di root project dengan nama file screenshot_desktop.png -->

---

### Menjalankan Aplikasi Lokal

- Android app: `./gradlew :androidApp:assembleDebug` (lalu install apk) atau jalankan via IDE.
- Desktop app: `./gradlew :desktopApp:run`