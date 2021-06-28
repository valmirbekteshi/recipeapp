package com.division5.recipeapp.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.division5.recipeapp.R
import com.division5.recipeapp.databinding.FragmentLoginBinding
import com.division5.recipeapp.ui.recipelist.RecipeListFragment
import com.division5.recipeapp.ui.recipelist.RecipeListPresenter


class LoginFragment : Fragment() {

    private var login_binding: FragmentLoginBinding? = null


    // we extract
    // the non null value of the _binding
    private val binding get() = login_binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        login_binding = FragmentLoginBinding.inflate(inflater, container, false)


        binding.registerTextBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_loginFragment_to_register)
        }

        binding.loginButton.setOnClickListener {

            it.findNavController().navigate(R.id.action_loginFragment_to_recipeListFragment)


        }

        return binding.root
    }

}