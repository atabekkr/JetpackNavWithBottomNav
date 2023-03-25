package com.example.bottomnavigationmenenislesiw

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import com.example.bottomnavigationmenenislesiw.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentHomeBinding.bind(view)

        binding.buttonHome.setOnClickListener {
            val navController =
                Navigation.findNavController(requireActivity(), R.id.fragment_container)

            navController.navigate(MainFragmentDirections.actionMainFragmentToRepositoryFragment2())
        }

    }
}