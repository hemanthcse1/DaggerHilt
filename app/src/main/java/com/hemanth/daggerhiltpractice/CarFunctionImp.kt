package com.hemanth.daggerhiltpractice

import com.hemanth.daggerhiltpractice.repository.CarRepository
import javax.inject.Inject

class CarFunctionImp @Inject constructor(
    val carRepository: CarRepository
) : CarFunctions{

    override fun doDrive(): String {
       return "Car can drive"
    }

    fun insert() : Int{
        return carRepository.addRow()
    }

}