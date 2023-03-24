package com.example.bottomnavigationmenenislesiw

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.bottomnavigationmenenislesiw.databinding.FragmentRepositoryBinding

class RepositoryFragment : Fragment(R.layout.fragment_repository) {
    private lateinit var binding: FragmentRepositoryBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentRepositoryBinding.bind(view)

    }
}