package com.abner.syncittechnologies.main



import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.abner.syncittechnologies.R
import com.abner.syncittechnologies.databinding.ActivityMainBinding
import com.abner.syncittechnologies.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
  val binding :MainFragmentBinding = DataBindingUtil.inflate(inflater,R.layout.main_fragment,container,false)


       binding.bottomNavigation.setOnNavigationItemReselectedListener { item ->
            when(item.itemId) {
                R.id.page_1 ->  {
                    this.findNavController().navigate(R.id.incomesFragment)

                }
                R.id.page_2 -> {
                    this.findNavController().navigate(R.id.expensesFragment)
                }
                else ->  true
            }
        }
 return  binding.root
    }
    }

