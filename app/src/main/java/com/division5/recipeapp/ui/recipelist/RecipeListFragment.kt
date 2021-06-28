package com.division5.recipeapp.ui.recipelist

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.division5.recipeapp.data.Recipe
import com.division5.recipeapp.databinding.FragmentRecipeListBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class RecipeListFragment : Fragment() , RecipeListView {
    private val recipeList: List<Recipe> = listOf()

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var recipe_list_binding: FragmentRecipeListBinding? = null
    private var presenter: RecipeListPresenter? = null


    // we extract
    // the non null value of the _binding
    private val binding get() = recipe_list_binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        recipe_list_binding = FragmentRecipeListBinding.inflate(inflater,container,false)
        presenter = RecipeListPresenter(this)

        presenter?.getRecipeList()

        return binding.root
    }


    override fun showRecipeList(recipeList: List<Recipe>) {
        Log.d("recipelistFragment", recipeList?.toString())
        recipe_list_binding?.recipeListRecyclerView?.layoutManager = LinearLayoutManager(context)
        val testAdapter = RecipeAdapter(recipeList,requireContext())
        recipe_list_binding?.recipeListRecyclerView?.adapter = testAdapter

        }
}