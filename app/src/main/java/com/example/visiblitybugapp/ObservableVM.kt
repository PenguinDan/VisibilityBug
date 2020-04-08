package com.example.visiblitybugapp

import android.app.Application
import androidx.annotation.StringRes
import androidx.databinding.Observable
import androidx.databinding.PropertyChangeRegistry
import androidx.lifecycle.AndroidViewModel

open class ObservableVM(
    application: Application
) : AndroidViewModel(application), Observable {

    @delegate:Transient
    private val registry: PropertyChangeRegistry by lazy { PropertyChangeRegistry() }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback) {
        registry.add(callback)
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback) {
        registry.remove(callback)
    }

    fun notifyChange(viewId: Int) {
        registry.notifyChange(this, viewId)
    }
}