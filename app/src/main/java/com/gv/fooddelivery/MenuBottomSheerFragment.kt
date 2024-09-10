package com.gv.fooddelivery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.gv.fooddelivery.Adapters.PopularAdapter
import com.gv.fooddelivery.Models.PopularModel


class MenuBottomSheerFragment : BottomSheetDialogFragment() {

    private lateinit var adapter : PopularAdapter
    private lateinit var menuList: ArrayList<PopularModel>
    private lateinit var menuRv: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view= inflater.inflate(R.layout.fragment_menu_bottom_sheer, container, false)


        menuList=ArrayList()
        menuList.add(PopularModel(R.drawable.pop_menu_burger, "Sandwich", "7$",1))
        menuList.add(PopularModel(R.drawable.pop_menu_sandwich, "Momo", "4$",1))
        menuList.add(PopularModel(R.drawable.pop_menu_momo, "Burger", "5$",1))
        menuList.add(PopularModel(R.drawable.pop_menu_burger, "Sandwich", "7$",1))
        menuList.add(PopularModel(R.drawable.pop_menu_sandwich, "Momo", "4$",1))
        menuList.add(PopularModel(R.drawable.pop_menu_momo, "Burger", "5$",1))
        menuList.add(PopularModel(R.drawable.pop_menu_burger, "Sandwich", "7$",1))
        menuList.add(PopularModel(R.drawable.pop_menu_sandwich, "Momo", "4$",1))
        menuList.add(PopularModel(R.drawable.pop_menu_momo, "Burger", "5$",1))
        menuList.add(PopularModel(R.drawable.pop_menu_burger, "Sandwich", "7$",1))
        menuList.add(PopularModel(R.drawable.pop_menu_sandwich, "Momo", "4$",1))
        menuList.add(PopularModel(R.drawable.pop_menu_momo, "Burger", "5$",1))
        menuList.add(PopularModel(R.drawable.pop_menu_burger, "Sandwich", "7$",1))
        menuList.add(PopularModel(R.drawable.pop_menu_sandwich, "Momo", "4$",1))
        menuList.add(PopularModel(R.drawable.pop_menu_momo, "Burger", "5$",1))
        adapter=PopularAdapter(requireContext(),menuList)
        menuRv=view.findViewById(R.id.menu_RV)
        menuRv.layoutManager= LinearLayoutManager(requireContext())
        menuRv.adapter=adapter
    return view

    }

}