package com.example.score

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.score.databinding.FragmentMainBinding


class fragment_main : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding
    private val viewModel: ViewModelMain by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        return _binding?.root
    }

    fun updateScor(){
        binding?.Display?.text = viewModel.score.toString()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.viewModel = viewModel
        binding?.lifecycleOwner = viewLifecycleOwner


        binding?.buttonAdd1?.setOnClickListener {
            viewModel.addOne()
            updateScor()

        }
        binding?.buttonAdd4?.setOnClickListener {
            viewModel.addFour()
            updateScor()


        }
        binding?.buttonSub2?.setOnClickListener {
            viewModel.subTwo()
            updateScor()

        }


    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}