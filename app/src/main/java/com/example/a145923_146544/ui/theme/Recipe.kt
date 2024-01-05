package com.example.a145923_146544.ui.theme

class Recipe (
    val title: String,
    val type: String,
    val servings: Int,
    val difficulty: String,
    val ingredients: List<String>,
    val steps: List<String>
)

object RecipeDataProvider {
    val recipes = listOf(
        Recipe("Mandazi", "Breakfast", 10, "Intermediate", listOf("Flour", "Milk", "Yeast"), listOf("Knead dough", "Deep fry")),
        Recipe("Githeri", "Lunch", 4, "Intermediate", listOf("Maize", "Beans", "Potatoes"), listOf("Boil maize and beans", "Cook ingredients together")),

    )
}

