package com.division5.recipeapp.ui.recipelist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.division5.recipeapp.R
import com.division5.recipeapp.data.Recipe
import com.division5.recipeapp.databinding.RecipeItemBinding
import com.squareup.picasso.Picasso
import kotlin.math.roundToInt

class RecipeAdapter(val recipes: List<Recipe>,private val context: Context) :
    RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>() {


    class RecipeViewHolder(private val itemBinding: RecipeItemBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(recipe: Recipe){
            Picasso.get().load(recipe.imageUrl).into(itemBinding.recipeImage);
            itemBinding.recipeTitle.text = recipe.title
            itemBinding.ratingBar.numStars = (1..5).random()


        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val itemBinding = RecipeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecipeViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val recipe: Recipe = recipes[position]
        holder.bind(recipe)
    }

    override fun getItemCount(): Int {
        return recipes.size
    }



}