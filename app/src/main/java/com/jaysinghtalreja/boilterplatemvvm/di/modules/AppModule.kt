package com.jaysinghtalreja.boilterplatemvvm.di.modules

import android.app.Application
import com.jaysinghtalreja.boilterplatemvvm.BoilterPlateApp
import com.jaysinghtalreja.boilterplatemvvm.di.modules.viewmodel.ViewModelModule
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Module(
    includes = [
        AndroidInjectionModule::class,
        ViewModelModule::class,
        NetModule::class,
    ]
)
class AppModule {

    @Singleton
    @Provides
    fun provideApplicationContext(application: Application): BoilterPlateApp = application as BoilterPlateApp
}
