# 📱 Tugas Pertemuan 6 - Penambahan Log dan Toast

## 👤 Identitas 
- **Nama**: Salman Azhar Latisio  
- **NIM**: 23552011046  
- **Kelas**: TIF RP 23 CNS C  

---

## 📌 Deskripsi Tugas
Log digunakan untuk mencatat informasi debugging, sementara Toast digunakan untuk menampilkan pemberitahuan singkat kepada pengguna

---
## 🧩 Penempatan Log dan Toast

```kotlin
  class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
      val websiteEditText: EditText = findViewById(R.id.website_edit_text)
      val openWebsiteButton: Button = findViewById(R.id.open_website_button)
        openWebsiteButton.setOnClickListener {
            val websiteUrl = websiteEditText.text.toString()
            Log.v("Cek String", websiteUrl)
            Toast.makeText(applicationContext, websiteUrl, Toast.LENGTH_SHORT).show()
            openWebsite(websiteUrl)
        }

        val locationEditText: EditText = findViewById(R.id.location_edit_text)
        val locationButton: Button = findViewById(R.id.location_button)
        locationButton.setOnClickListener {
            val locationName = locationEditText.text.toString()
            Log.v("Cek String", locationName)
            Toast.makeText(applicationContext, locationName, Toast.LENGTH_SHORT).show()
            openLocation(locationName)
        }

        val shareEditText: EditText = findViewById(R.id.share_edit_text)
        val shareTextButton: Button = findViewById(R.id.share_text_button)
        shareTextButton.setOnClickListener {
            val shareText = shareEditText.text.toString()
            Log.v("Cek String", shareText)
            Toast.makeText(applicationContext, shareText, Toast.LENGTH_SHORT).show()
            ShareText(shareText)
        }

    }
```
## 📸 Screenshot hasil penambahan code
<img width="959" alt="Log   Toast" src="https://github.com/user-attachments/assets/5b8737e7-889e-42b5-9a84-59051cd8436b" />

