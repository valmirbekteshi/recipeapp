package com.division5.recipeapp.ui.recipelist

import android.util.Log
import com.division5.recipeapp.data.Recipe
import com.division5.recipeapp.data.Root
import com.division5.recipeapp.network.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RecipeListPresenter(var view: RecipeListView) {


    fun getRecipeList(){
        val apiInterface = ApiInterface.create().getPizzaRecipes()
        apiInterface.enqueue(object :Callback<Root>{
            override fun onResponse(call: Call<Root>, response: Response<Root>) {
                if (response.isSuccessful){
                    if(response.body()?.recipes != null) {
                        view.showRecipeList(response.body()!!.recipes)
                    }
                }
            }

            override fun onFailure(call: Call<Root>, t: Throwable) {

            }

        })

    }
}