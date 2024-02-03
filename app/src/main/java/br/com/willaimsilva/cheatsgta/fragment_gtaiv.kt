package br.com.willaimsilva.cheatsgta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import br.com.willaimsilva.cheatsgta.adapter.CheatsIVAdapter
import br.com.willaimsilva.cheatsgta.adapter.CheatsVAdapter
import br.com.willaimsilva.cheatsgta.databinding.FragmentGtaivBinding
import br.com.willaimsilva.cheatsgta.databinding.FragmentGtavBinding
import br.com.willaimsilva.cheatsgta.repository.CheatsIV
import br.com.willaimsilva.cheatsgta.repository.CheatsV

class fragment_gtaiv : Fragment() {

    private lateinit var binding: FragmentGtaivBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
        binding = FragmentGtaivBinding.inflate(inflater, container, false)

        val repository = CheatsIV()
        val cheats = repository.findAllIV()
        val adapter = CheatsIVAdapter(cheats)

        binding.recyclerViewIV.adapter = adapter

        return binding.root
    }

}