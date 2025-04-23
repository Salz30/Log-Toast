package com.example.implicit

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import android.util.Log
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

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

    fun openWebsite(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
    fun openLocation(location: String) {
        val uri = Uri.parse("geo:0,0?q=$location")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        intent.setPackage("com.google.android.apps.maps")
        startActivity(intent)
    }
    fun ShareText(text: String) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, text)
        startActivity(Intent.createChooser(intent, "Share Text"))
    }

    fun openWebsite(view: View) {}
    fun openLocation(view: View) {}
    fun ShareText(view: View) {}


}