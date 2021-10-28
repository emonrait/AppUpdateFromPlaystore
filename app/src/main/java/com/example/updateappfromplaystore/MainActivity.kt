package com.example.updateappfromplaystore

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.play.core.appupdate.AppUpdateManager
import com.google.android.play.core.install.model.AppUpdateType

class MainActivity : AppCompatActivity() {

    private lateinit var inAppUpdate: InAppUpdate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inAppUpdate = InAppUpdate(this)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        inAppUpdate.onActivityResult(requestCode,resultCode, data)
    }

    override fun onResume() {
        super.onResume()
        inAppUpdate.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
        inAppUpdate.onDestroy()
    }
}