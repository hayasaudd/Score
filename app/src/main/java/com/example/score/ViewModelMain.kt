package com.example.score

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelMain: ViewModel() {
    private var _score =0
    val score: Int
    get() = _score

    //add one function
    fun addOne(){
         _score +=1
    }

    //add four function
    fun addFour(){
       _score +=4
    }

    //subtract two function
    fun subTwo(){
        if (_score!! >=2 )  _score -=2
    }


}