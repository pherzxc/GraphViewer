package com.example.graphviewer

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.databinding.DataBindingUtil
import com.example.graphviewer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){

    private lateinit var binding: ActivityMainBinding
    var categorySelected : String = null.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

//        generateSpinner()
//
//        binding.searchBtn.setOnClickListener {searchQuery(it)}
    }
//
//    override fun onItemSelected(parent: AdapterView<*>, view: View, pos: Int, id: Long) {
//        categorySelected = parent.getItemAtPosition(pos).toString()
//    }
//
//    override fun onNothingSelected(parent: AdapterView<*>) {
//        // Another interface callback
//    }
//
//
//    private fun searchQuery(view: View) {
//        Toast.makeText(this, "Name: " + binding.inputField.text + " Type : " + categorySelected, Toast.LENGTH_SHORT).show()
//        hideKeyboard(view)
//    }
//
//    private fun hideKeyboard(view: View) {
//        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//        imm.hideSoftInputFromWindow(view.windowToken, 0)
//    }
//
//    private fun generateSpinner() {
//        val spinner: Spinner = binding.category
//        ArrayAdapter.createFromResource(this, R.array.category_type, android.R.layout.simple_spinner_item
//        ).also { adapter ->
//            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//            spinner.adapter = adapter
//        }
//        spinner.onItemSelectedListener = this
//    }
}
