package com.example.cpmobile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class DetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_details, container, false)

        val destination = arguments?.getString("DESTINATION")
        val date = arguments?.getString("DATE")
        val transport = arguments?.getString("TRANSPORT")

        // Referenciar os TextViews e exibir os dados
        val destinationText: TextView = view.findViewById(R.id.destinationText)
        val dateText: TextView = view.findViewById(R.id.dateText)
        val transportText: TextView = view.findViewById(R.id.transportText)

        destinationText.text = destination
        dateText.text = date
        transportText.text = transport

        return view
    }
}