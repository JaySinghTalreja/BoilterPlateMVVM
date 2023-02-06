package com.jaysinghtalreja.boilterplatemvvm.network

import com.jaysinghtalreja.boilterplatemvvm.BoilterPlateApp
import com.jaysinghtalreja.boilterplatemvvm.utils.extentions.isNetNotConnected
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class NoConnectionInterceptor @Inject constructor(
    private val context: BoilterPlateApp
) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        return if (context.isNetNotConnected()) {
            throw NoInternetException()
        }else {
            chain.proceed(chain.request())
        }
    }
}