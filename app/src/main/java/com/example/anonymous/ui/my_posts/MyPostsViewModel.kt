package com.example.anonymous.ui.my_posts

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyPostsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Qui appaiono tutti i post che ho pubblicato"
    }
    val text: LiveData<String> = _text
}