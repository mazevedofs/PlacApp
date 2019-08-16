package com.marina.placapp.ui.game.awayteam


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.localbroadcastmanager.content.LocalBroadcastManager

import com.marina.placapp.R
import kotlinx.android.synthetic.main.fragment_away_team.*

class AwayTeamFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_away_team, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btNext.setOnClickListener {
            val intent = Intent("FILTER_AWAY_TEAM_NAME")
            intent.putExtra("away_team_name", inputAwayTeam.text.toString())

            LocalBroadcastManager.getInstance(requireContext()).sendBroadcast(intent)
        }
    }


}


