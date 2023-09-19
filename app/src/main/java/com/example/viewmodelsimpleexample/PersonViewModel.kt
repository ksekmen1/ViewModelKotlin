package com.example.viewmodelsimpleexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PersonViewModel : ViewModel() {
    val name: MutableLiveData<String> = MutableLiveData()
    val age: MutableLiveData<Int> = MutableLiveData()
}