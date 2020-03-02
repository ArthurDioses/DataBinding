package com.example.databinding_project.viewmodel

import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class LoginFormViewModel {
    //Observable Databinding
    val emailObservable = ObservableField<String>("")
    val passwordObservable = ObservableField<String>("")
    val loginEnableObservable = ObservableBoolean(false)

    //LiveData Databinding
    val emailData = MutableLiveData<String>("")
    val passwordData = MutableLiveData<String>("")
    private val _loginEnabledData = MutableLiveData<Boolean>(false)
    val loginEnableData: LiveData<Boolean> = _loginEnabledData

    fun updateLoginEnabledState(enabled: Boolean) {
        _loginEnabledData.value = enabled
    }
}