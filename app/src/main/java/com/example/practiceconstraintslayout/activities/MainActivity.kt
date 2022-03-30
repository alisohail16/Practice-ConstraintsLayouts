package com.example.practiceconstraintslayout.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceconstraintslayout.adapters.CategoryAdapter
import com.example.practiceconstraintslayout.adapters.MoreCategoryAdapter
import com.example.practiceconstraintslayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var moreCategoryAdapter: MoreCategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        moreCategoryAdapter = MoreCategoryAdapter(this)
        categoryAdapter = CategoryAdapter(this)

        setupRv()
    }

    private fun setupRv() {
        binding.mainCatRv.apply {
            adapter = categoryAdapter
        }
        binding.moreCatRv.apply {
            adapter = moreCategoryAdapter
        }
    }
}