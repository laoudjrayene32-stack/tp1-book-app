package com.ElOuedUniv.maktaba.data.repository

import com.ElOuedUniv.maktaba.data.model.Category

class CategoryRepositoryImpl : CategoryRepository {

    private val categoriesList = listOf(
        Category("1", "Programming", "Books about coding"),
        Category("2", "Algorithms", "Data structures"),
        Category("3", "Databases", "Database systems"),
        Category("4", "Mobile Dev", "Android & iOS"),
        Category("5", "AI", "Artificial Intelligence")
    )

    override fun getAllCategories(): List<Category> {
        return categoriesList
    }

    override fun getCategoryById(id: String): Category? {
        return categoriesList.find { it.id == id }
    }
}