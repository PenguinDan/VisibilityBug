package com.example.visiblitybugapp

import android.app.Application
import android.os.Handler
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR

class SecondVM(
    application: Application
) : ObservableVM(application) {
    var isLoading = true
        @Bindable get
        set(value) {
            if (field != value) {
                field = value
                notifyChange(BR.loading)
            }
        }

    init {
        Handler().postDelayed({
            isLoading = false
        }, 2000)
    }
}