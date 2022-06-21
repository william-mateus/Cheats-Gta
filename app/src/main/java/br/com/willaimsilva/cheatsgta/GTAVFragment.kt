package br.com.willaimsilva.cheatsgta

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import br.com.willaimsilva.cheatsgta.adapter.CheatsVAdapter
import br.com.willaimsilva.cheatsgta.databinding.FragmentGtavBinding
import br.com.willaimsilva.cheatsgta.databinding.FragmentHomeBinding
import br.com.willaimsilva.cheatsgta.repository.CheatsV
import br.com.willaimsilva.cheatsgta.ui.home.HomeViewModel


class GTAVFragment : Fragment() {
    private lateinit var binding: FragmentGtavBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val GTAVViewModel = ViewModelProvider(this)[GTAVViewModel::class.java]

        binding = FragmentGtavBinding.inflate(inflater, container, false)

        val repository = CheatsV()
        val cheats = repository.findAllV()
        val adapter = CheatsVAdapter(cheats)

        binding.recyclerViewV.adapter = adapter

        return binding.root


    }


}

