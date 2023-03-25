package com.example.bottomnavigationmenenislesiw

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigationmenenislesiw.databinding.FragmentLoginBinding

class LoginFragment : Fragment(R.layout.fragment_login) {
    private lateinit var binding: FragmentLoginBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentLoginBinding.bind(view)

        binding.buttonLogin.setOnClickListener {
            findNavController().navigate(
                LoginFragmentDirections.actionLoginFragmentToMainFragment()
            )
        }
    }
}