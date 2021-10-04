package com.hemanth.daggerhiltpractice.util

import javax.inject.Inject

class Battery @Inject constructor() {

    fun getBatterySize(): Int{
        return 12
    }
}