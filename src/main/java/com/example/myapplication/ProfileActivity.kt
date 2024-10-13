package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation)

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_profile -> {
                    // Stay on the current activity (ProfileActivity)
                    true
                }

                R.id.nav_home -> {
                    // Navigate to HomeActivity
                    startActivity(Intent(this, HomeActivity::class.java))
                    true
                }
                R.id.nav_messages -> {
                    // Navigate to MessagesActivity
                    startActivity(Intent(this, MessagesActivity::class.java))
                    true
                }
                R.id.nav_notifications -> {
                    // Navigate to NotificationsActivity
                    startActivity(Intent(this, NotificationActivity::class.java))
                    true
                }

                else -> false
            }
        }
    }
}
