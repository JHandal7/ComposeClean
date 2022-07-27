package com.handal.presentation.main

import android.os.Bundle
import androidx.activity.compose.setContent

import androidx.appcompat.app.AppCompatActivity


import com.handal.presentation.ui.screens.CatFactScreen
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CatFactScreen(catFact = mainViewModel.catFact) {
                mainViewModel.getCatFact()
            }
        }
    }
}