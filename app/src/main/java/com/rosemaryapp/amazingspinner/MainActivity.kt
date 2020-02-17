package com.rosemaryapp.amazingspinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var array = arrayOf("India", "USA", "China", "Japan", "Other")

        val adapter = SpinnerAdapter(this, array)

        mAmazingSpinner1.setAdapter(adapter)

        mAmazingSpinner2.setAdapter(adapter)

        mAmazingSpinner3.setAdapter(adapter)

        mAmazingSpinner4.setAdapter(adapter)
    }
}
