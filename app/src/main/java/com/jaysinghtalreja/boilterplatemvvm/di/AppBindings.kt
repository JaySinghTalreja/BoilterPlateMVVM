package com.jaysinghtalreja.boilterplatemvvm.di

import com.jaysinghtalreja.boilterplatemvvm.MainActivity
import com.jaysinghtalreja.boilterplatemvvm.di.bindings.FragmentBindings
import com.jaysinghtalreja.boilterplatemvvm.di.bindings.ViewModelBindings
import com.jaysinghtalreja.boilterplatemvvm.utils.async.ThreadManager
import com.jaysinghtalreja.boilterplatemvvm.utils.async.ThreadManagerImpl
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AppBindings {

    @ContributesAndroidInjector(
        modules = [
            FragmentBindings::class,
            ViewModelBindings::class
        ]
    )
    abstract fun contributeMainActivity(): MainActivity

    @Binds
    abstract fun provideThreadManager(threadManager: ThreadManagerImpl): ThreadManager
}