package com.elytelabs.toolbox

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.elytelabs.toolbox.UtilKit.getAppVersionCode
import com.elytelabs.toolbox.UtilKit.getAppVersionName
import com.elytelabs.toolbox.UtilKit.sendFeedbackEmail
import com.elytelabs.toolbox.UtilKit.showLongToast
import com.elytelabs.toolbox.UtilKit.showToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = findViewById<Button>(R.id.email)
        email.setOnClickListener {
            sendFeedbackEmail(this,
                "example@abc", "subject", getString(R.string.app_name))
        }

        val getAppVersionName = findViewById<Button>(R.id.getAppVersionName)
        getAppVersionName.setOnClickListener {
            showLongToast(getAppVersionName(this).toString())
        }

        val getAppVersionCode = findViewById<Button>(R.id.getAppVersionCode)
        getAppVersionCode.setOnClickListener {
            showToast(getAppVersionCode(this).toString())
        }

    }
}