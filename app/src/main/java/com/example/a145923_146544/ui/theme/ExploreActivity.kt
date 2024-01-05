package com.example.a145923_146544.ui.theme

class ExploreActivity : AppCompatActivity() {
    private lateinit var recipeAdapter: RecipeAdapter

    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore)

        val recipes = RecipeDataProvider.recipes
        recipeAdapter = RecipeAdapter(recipes) { recipe -> showRecipeDetails(recipe) }

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.adapter = recipeAdapter
    }

    private fun showRecipeDetails(recipe: Recipe) {

    }
}
