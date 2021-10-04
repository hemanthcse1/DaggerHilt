package com.hemanth.daggerhiltpractice.module

import com.hemanth.daggerhiltpractice.CarFunctionImp
import com.hemanth.daggerhiltpractice.CarFunctions
import com.hemanth.daggerhiltpractice.repository.CarRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class ActivityModule {

    @Provides
    fun provideCarRepository(): CarRepository{
        return CarRepository()
    }

    @Provides
    fun provideCarFunctionImpl(carRepository: CarRepository): CarFunctions{
        return CarFunctionImp(carRepository)
    }

   /* @Binds
    abstract fun bindCarFunction(carFunctionImp: CarFunctionImp): CarFunctions*/


}