package com.abner.syncittechnologies.register

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.abner.syncittechnologies.R
import com.abner.syncittechnologies.databinding.RegisterFragmentBinding

class RegisterFragment : Fragment() {

    companion object {
        fun newInstance() = RegisterFragment()
    }

    private lateinit var viewModel: RegisterViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : RegisterFragmentBinding = DataBindingUtil.inflate(inflater,R.layout.register_fragment,container,false)

        context?.applicationContext?.let {
            ArrayAdapter.
            createFromResource(it, R.array.Languages,R.layout.item_country)
                .also { adapter ->
                    adapter.setDropDownViewResource(R.layout.item_country)
                    binding.spinner2.adapter = adapter
                }
        }


        binding.crearCuenta.setOnClickListener {
            this.findNavController().navigate(RegisterFragmentDirections.actionRegisterFragmentToLoginFragment())
        }



        return  binding.root
    }
}