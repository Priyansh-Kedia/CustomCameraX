package com.kedia.customcamerax

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kedia.customcameraxmultiple.CustomCameraX
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), CustomCameraX.CustomCameraX {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cc.setListener(this)
    }

    override fun onConfirmImages(imageArrayList: MutableList<Bitmap?>) {

    }
}