package com.example.anonymous.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Qui ci saranno i post nelle varie card"
    }
    val text: LiveData<String> = _text
}