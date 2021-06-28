package com.division5.recipeapp.data

import com.google.gson.annotations.SerializedName

data class Recipe(
    val publisher: String,
    val title: String,
    @SerializedName("source_url")
    val sourceUrl: String,
    @SerializedName("recipe_id")
    val recipeId: String,
    @SerializedName("image_url")
    val imageUrl: String,
    @SerializedName("social_rank")
    val socialRank: Double,
    @SerializedName("publisher_url")
    val publisherUrl: String
)

data class Root(
    val count: Long,
    val recipes: List<Recipe>
)
