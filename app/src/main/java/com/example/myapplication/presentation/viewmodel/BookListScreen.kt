package com.example.myapplication.presentation.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.presentation.viewmodel.BookViewModel

@Composable
fun BookListScreen(viewModel: BookViewModel) {

    val books by viewModel.books.collectAsState()
    Text(
        text = "Total Books: ${books.size}",
        style = MaterialTheme.typography.titleMedium,
        modifier = Modifier.padding(16.dp)
    )

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(books) { book ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 12.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = book.title,
                        style = MaterialTheme.typography.titleLarge
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "ISBN: ${book.isbn}")
                    Text(text = "Pages: ${book.nbPages}")
                }
            }
        }
    }
}
