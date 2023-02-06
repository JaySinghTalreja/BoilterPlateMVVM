package com.jaysinghtalreja.boilterplatemvvm.di

import android.app.Application
import com.jaysinghtalreja.boilterplatemvvm.BoilterPlateApp
import com.jaysinghtalreja.boilterplatemvvm.di.modules.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        AppBindings::class
    ]
)
interface AppComponent : AndroidInjector<BoilterPlateApp> {
    fun inject(app: Application)

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun app(app: Application): Builder

        fun build(): AppComponent
    }

}