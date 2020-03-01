package com.example.databinding_project.viewmodel

import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField

class LoginFormViewModel {
    val emailObservable = ObservableField<String>("")
    val passwordObservable = ObservableField<String>("")
    val loginEnableObservable = ObservableBoolean(false)
}