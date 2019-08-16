package com.marina.placapp.ui.score

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel : ViewModel() {

    val goalHome = MutableLiveData<Int>()
    val goalAway = MutableLiveData<Int>()

    init {
        initGame()
    }

    fun initGame() {
        goalHome.value = 0
        goalAway.value = 0
    }

    fun markGoalHome() {
        goalHome.value = goalHome.value?.plus(1)
    }

    fun markGoalAway() {
        goalAway.value = goalAway.value?.plus(1)
    }

    fun restart() {
        initGame()
    }

}
