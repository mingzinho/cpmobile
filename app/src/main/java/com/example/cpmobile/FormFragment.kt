package com.example.cpmobile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.fragment.app.Fragment

class FormFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_form, container, false)

        val destinationInput: EditText = view.findViewById(R.id.destinationInput)
        val dateInput: EditText = view.findViewById(R.id.dateInput)
        val transportSpinner: Spinner = view.findViewById(R.id.transportSpinner)
        val submitButton: Button = view.findViewById(R.id.submitButton)

        submitButton.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("DESTINATION", destinationInput.text.toString())
            bundle.putString("DATE", dateInput.text.toString())
            bundle.putString("TRANSPORT", transportSpinner.selectedItem.toString())

            val fragment = DetailsFragment()
            fragment.arguments = bundle

            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit()
        }

        return view
    }
}