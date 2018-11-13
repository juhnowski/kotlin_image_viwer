package com.juhnowski.ilya.imgviewer

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.BitmapRegionDecoder
import android.os.AsyncTask
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.security.NetworkSecurityPolicy
import android.support.annotation.RequiresApi
import android.util.Log
import android.view.View
import android.widget.ImageView
import java.net.URL

class MainActivity : AppCompatActivity() {

        val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    fun load(view: View){
        //NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted("calzestore.ru")

        DownloadImageTask(findViewById(R.id.my_image_view) as ImageView)
            .execute("https://www.android.com/static/2016/img/share/andy-lg.png");

    }

}