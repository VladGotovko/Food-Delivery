package com.gv.fooddelivery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.gv.fooddelivery.Adapters.CartAdapter
import com.gv.fooddelivery.Models.PopularModel
import com.gv.fooddelivery.Models.SharedModel
import com.gv.fooddelivery.databinding.FragmentCartBinding
import java.lang.reflect.Array

class CartFragment : Fragment() {
    private lateinit var binding : FragmentCartBinding
//private lateinit var list: ArrayList<PopularModel>
private lateinit var adapter: CartAdapter
private lateinit var sharedModel: SharedModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentCartBinding.inflate(inflater,container, false )
        sharedModel= ViewModelProvider(requireActivity()).get(SharedModel::class.java)


        adapter=CartAdapter(requireContext(),sharedModel.cartItem.value?:ArrayList())
        binding.cartRv.layoutManager=LinearLayoutManager(requireContext())
        binding.cartRv.adapter=adapter
        return binding.root
    }



    }
