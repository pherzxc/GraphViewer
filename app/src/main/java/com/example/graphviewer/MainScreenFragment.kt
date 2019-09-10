package com.example.graphviewer

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getSystemServiceName
import androidx.databinding.DataBindingUtil
import com.example.graphviewer.databinding.FragmentMainScreenBinding
import kotlinx.android.synthetic.main.fragment_main_screen.view.*

class MainScreenFragment : Fragment(), AdapterView.OnItemSelectedListener {

    private lateinit var binding: FragmentMainScreenBinding
    var categorySelected : String = null.toString()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_main_screen,
            container,
            false
        )
        generateSpinner()

        binding.searchBtn.setOnClickListener({search()})

        return this.binding.root
    }

    override fun onItemSelected(parent: AdapterView<*>, view: View, pos: Int, id: Long) {
        categorySelected = parent.getItemAtPosition(pos).toString()
    }

    override fun onNothingSelected(parent: AdapterView<*>) {
        // Another interface callback
    }

    private fun search() {
        Toast.makeText(context, "SEARCH " + binding.inputField.text + " " + categorySelected, Toast.LENGTH_SHORT).show()

        
    }

    private fun generateSpinner() {
        val spinner: Spinner = binding.category
        context?.let {
            ArrayAdapter.createFromResource(
                it, R.array.category_type, R.layout.spinner_layout
            ).also { adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                spinner.adapter = adapter
            }
        }
        spinner.onItemSelectedListener = this
    }

}
