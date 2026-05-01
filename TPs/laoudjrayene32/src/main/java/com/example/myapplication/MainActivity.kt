package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*

import com.example.myapplication.data.repository.BookRepository
import com.example.myapplication.domain.usecase.GetBooksUseCase
import com.example.myapplication.presentation.screens.BookListScreen
import com.example.myapplication.presentation.viewmodel.BookViewModel

import com.ElOuedUniv.maktaba.data.repository.CategoryRepositoryImpl
import com.ElOuedUniv.maktaba.domain.usecase.GetCategoriesUseCase
import com.ElOuedUniv.maktaba.presentation.view.CategoryListView
import com.ElOuedUniv.maktaba.presentation.viewmodel.CategoryViewModel

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Books
        val repository = BookRepository()
        val useCase = GetBooksUseCase(repository)
        val viewModel = BookViewModel(useCase)

        // Categories
        val categoryRepository = CategoryRepositoryImpl()
        val getCategoriesUseCase = GetCategoriesUseCase(categoryRepository)
        val categoryViewModel = CategoryViewModel(getCategoriesUseCase)

        setContent {
            ->

            var showCategories by remember { mutableStateOf(false) }

            if (showCategories) {
                CategoryListView(
                    viewModel = categoryViewModel,
                    onBackClick = { showCategories = false }
                )
            } else {
                BookListScreen(
                    viewModel = viewModel,
                    onCategoriesClick = { showCategories = true }
                )
            }
        }
        }
    }
