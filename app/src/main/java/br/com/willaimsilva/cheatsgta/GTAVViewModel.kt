package br.com.willaimsilva.cheatsgta

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GTAVViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is gta Fragment"
    }
    val text: LiveData<String> = _text
}