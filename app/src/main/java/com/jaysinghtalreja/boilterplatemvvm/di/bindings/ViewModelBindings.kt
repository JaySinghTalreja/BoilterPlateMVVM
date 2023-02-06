package com.jaysinghtalreja.boilterplatemvvm.di.bindings

import androidx.lifecycle.ViewModel
import com.jaysinghtalreja.boilterplatemvvm.di.modules.viewmodel.ViewModelKey

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelBindings {

//    @Binds
//    @IntoMap
//    @ViewModelKey(WeatherLookupViewModel::class)
//    abstract fun bindWeatherLookupViewModel(viewModel: WeatherLookupViewModel): ViewModel
//
//    @Binds
//    @IntoMap
//    @ViewModelKey(ForecastListViewModel::class)
//    abstract fun bindForecastListViewModel(viewModel: ForecastListViewModel): ViewModel
}
