package com.abner.syncittechnologies.incomes

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.abner.syncittechnologies.R

class IncomesFragment : Fragment() {

    companion object {
        fun newInstance() =
            IncomesFragment()
    }

    private lateinit var viewModel: IncomesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.incomes_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(IncomesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}