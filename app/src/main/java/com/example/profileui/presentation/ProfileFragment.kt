package com.example.profileui.presentation

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.profileui.R

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val creditValScore = view.findViewById<TextView>(R.id.text_credit_score)
        val lifeTimeCashback = view.findViewById<TextView>(R.id.text_lifetime_cashback)
        val creditIcon = view.findViewById<ImageView>(R.id.credit_icon)

        creditIcon.rotation = -45f

        // I can connect these textviews with the data from the ViewModel
    }
}