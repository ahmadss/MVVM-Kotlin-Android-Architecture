package com.task.ui.base.listeners

import com.task.data.dto.recipes.RecipesItem

/**
 * Created by Ahmad Saifuddin
 */

interface RecyclerItemListener {
    fun onItemSelected(recipe : RecipesItem)
}
