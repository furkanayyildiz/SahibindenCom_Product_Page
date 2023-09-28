package com.example.sahibindencomproductlisting.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sahibindencomproductlisting.databinding.FragmentProductListBinding


class ProductListFragment : Fragment() {
    private lateinit var binding: FragmentProductListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        binding = FragmentProductListBinding.inflate(inflater, container, false)

        return binding.root
    }



}