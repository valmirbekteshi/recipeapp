package com.division5.recipeapp.ui.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.division5.recipeapp.R
import com.division5.recipeapp.databinding.FragmentRegisterBinding


class Register : Fragment() {

    private var register_binding: FragmentRegisterBinding? = null
    private val binding get() = register_binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        register_binding = FragmentRegisterBinding.inflate(inflater, container, false)


        binding.gotoLoginTextBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_register_to_loginFragment)
        }
        return binding.root
    }


}