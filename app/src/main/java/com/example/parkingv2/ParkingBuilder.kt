package com.example.parkingv2

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object parkingBuilder {
    private const val URL = "https://datatank.stad.gent/4/mobiliteit/"

    fun create(): ParkingService {
        val client = OkHttpClient.Builder().build()

        return Retrofit.Builder()
            .baseUrl(URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ParkingService::class.java)
    }
}