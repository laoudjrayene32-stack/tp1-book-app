package com.example.myapplication.domain.usecase

import com.example.myapplication.data.repository.BookRepository
import com.example.myapplication.data.model.Book

class GetBooksUseCase(private val repository: BookRepository) {

    operator fun invoke(): List<Book> {
        return repository.getAllBooks()
    }
}