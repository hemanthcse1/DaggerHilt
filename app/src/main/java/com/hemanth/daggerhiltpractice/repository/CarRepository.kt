package com.hemanth.daggerhiltpractice.repository

import javax.inject.Inject

class CarRepository @Inject constructor(){

    fun addRow(): Int{
        return 102
    }
}