package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.myapplication.data.repository.BookRepository
import com.example.myapplication.domain.usecase.GetBooksUseCase
import com.example.myapplication.presentation.screens.BookListScreen
import com.example.myapplication.presentation.viewmodel.BookViewModel

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val repository = BookRepository()
        val useCase = GetBooksUseCase(repository)
        val viewModel = BookViewModel(useCase)

        setContent {
            BookListScreen(viewModel)
        }
    }
}