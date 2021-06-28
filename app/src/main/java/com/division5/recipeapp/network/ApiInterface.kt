package com.division5.recipeapp.network

import com.division5.recipeapp.data.Recipe
import com.division5.recipeapp.data.Root
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiInterface {

    @GET("search?q=pizza")
    fun getPizzaRecipes() : Call<Root>

    companion object {

        var BASE_URL = "https://forkify-api.herokuapp.com/api/"

        fun create() : ApiInterface {

            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(ApiInterface::class.java)

        }
    }
}