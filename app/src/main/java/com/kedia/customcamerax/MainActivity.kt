package com.kedia.customcamerax

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kedia.customcameraxmultiple.CustomCameraX

class MainActivity : AppCompatActivity(), CustomCameraX.CustomCameraX {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onConfirmImages(imageArrayList: MutableList<Bitmap?>) {

    }
}