package com.example.parkingv2.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.parkingv2.models.Parking

class HomeViewModel : ViewModel() {
    private var _parking = MutableLiveData<Parking>()
    val parking: LiveData<Parking>
        get() = _parking
    val naam: String = "een naam"
}