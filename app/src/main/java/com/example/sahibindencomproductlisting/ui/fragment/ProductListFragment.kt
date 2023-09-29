package com.example.sahibindencomproductlisting.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sahibindencomproductlisting.databinding.FragmentProductListBinding
import com.example.sahibindencomproductlisting.ui.adapter.ProductAdapter
import com.example.sahibindencomproductlisting.ui.viewModel.ProductViewModel


class ProductListFragment : Fragment() {
    private lateinit var binding: FragmentProductListBinding
    private lateinit var viewModel: ProductViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        binding = FragmentProductListBinding.inflate(inflater, container, false)

        binding.productsRv.layoutManager = LinearLayoutManager(requireContext())

        viewModel.productList.observe(viewLifecycleOwner){
            val productAdapter = ProductAdapter(requireContext(),it ,viewModel)
            binding.productsRv.adapter = productAdapter
        }
        return binding.root
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel : ProductViewModel by viewModels()
        viewModel = tempViewModel
    }


}