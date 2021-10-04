package com.hemanth.daggerhiltpractice.util

import javax.inject.Inject

class Car @Inject constructor(
   val battery: Battery
) {

    fun getCarName(): String{
        return "This is a Toyota"
    }

    fun getBatterySize(): String{
        return "The Battery size is ${battery.getBatterySize()}"
    }
}