package com.dov4k1n.vkinternshiptask

import android.app.Application
import com.dov4k1n.vkinternshiptask.data.AppContainer
import com.dov4k1n.vkinternshiptask.data.DefaultAppContainer

class ProductsApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}