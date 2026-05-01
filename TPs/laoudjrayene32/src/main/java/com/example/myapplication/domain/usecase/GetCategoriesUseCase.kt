package com.ElOuedUniv.maktaba.domain.usecase

import com.ElOuedUniv.maktaba.data.repository.CategoryRepository

class GetCategoriesUseCase(
    private val repository: CategoryRepository
) {
    operator fun invoke() = repository.getAllCategories()
}