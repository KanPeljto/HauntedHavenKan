package com.example.hauntedhaven.data

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.hauntedhaven.HauntedHavenApplication
import com.example.hauntedhaven.data.HauntedDao
import com.example.hauntedhaven.data.HauntedPlace
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class HauntedViewModel(private val hauntedDao: HauntedDao) : ViewModel() {

    private val _hauntedPlacesState = MutableStateFlow(listOf<HauntedPlace>())
    val hauntedPlacesState = _hauntedPlacesState.asStateFlow()

    private val _featuredHauntedPlacesState = MutableStateFlow(listOf<HauntedPlace>())
    val featuredHauntedPlacesState = _featuredHauntedPlacesState.asStateFlow()

    init {
        loadHauntedPlaces()
        loadFeaturedHauntedPlaces()
    }

    private fun loadHauntedPlaces() = viewModelScope.launch {
        hauntedDao.getAll().collect {
            _hauntedPlacesState.value = it
        }
    }

    private fun loadFeaturedHauntedPlaces() = viewModelScope.launch {
        hauntedDao.getFeatured().collect {
            _featuredHauntedPlacesState.value = it
        }
    }

    companion object {
        val factory : ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as HauntedHavenApplication)
                HauntedViewModel(application.database.hauntedDao())
            }
        }
    }
}
