package com.example.parkingv2

import com.example.parkingv2.models.Parking
import retrofit2.Call
import retrofit2.http.GET

interface ParkingService {
    @GET("bezettingparkingsrealtime.json")
    fun getParkings(): Call<List<Parking?>?>?
}