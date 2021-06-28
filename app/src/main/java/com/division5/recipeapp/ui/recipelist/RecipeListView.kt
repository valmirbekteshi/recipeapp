package com.division5.recipeapp.ui.recipelist

import com.division5.recipeapp.data.Recipe

interface RecipeListView {

    fun showRecipeList(recipeList: List<Recipe>)

}