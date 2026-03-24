package com.example.myapplication.data.repository

import com.example.myapplication.data.model.Book
class BookRepository {

    private val booksList = listOf(
        Book("978-0-13-235088-4", "Clean Code", 464),
        Book("978-0-201-61622-4", "The Pragmatic Programmer", 352),
        Book("978-0-262-03384-8", "Introduction to Algorithms", 1312),
        Book("978-1-491-94794-8", "Kotlin in Action", 360),
        Book("978-1-118-95163-2", "Android Programming", 720),

        // الكتب الجدد 👇
        Book("978-0-596-00016-1", "Design Patterns", 395),
        Book("978-0-321-12742-6", "Refactoring", 448),
        Book("978-1-59327-599-0", "Eloquent JavaScript", 472),
        Book("978-0-134-59520-1", "Effective Java", 416),
        Book("978-1-59327-950-9", "Automate the Boring Stuff with Python", 592)
    )

    fun getAllBooks(): List<Book> = booksList
}
