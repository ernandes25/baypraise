package com.example.baypraise.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ItensDashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Cadastro da Igreja"
    }
    val text: LiveData<String> = _text
}