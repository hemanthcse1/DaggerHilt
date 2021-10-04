package com.hemanth.daggerhiltpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.hemanth.daggerhiltpractice.util.Car
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = car.getCarName()
        Log.d(TAG, "onCreate: "+name)

        Log.d(TAG, "onCreate: "+car.getBatterySize())
    }
}