package com.abner.syncittechnologies.expenses

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.abner.syncittechnologies.R

class ExpensesFragment : Fragment() {

    companion object {
        fun newInstance() = ExpensesFragment()
    }

    private lateinit var viewModel: ExpensesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.expenses_fragment, container, false)
    }
}