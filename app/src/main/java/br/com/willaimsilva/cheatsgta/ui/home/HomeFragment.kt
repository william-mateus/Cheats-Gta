package br.com.willaimsilva.cheatsgta.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import br.com.willaimsilva.cheatsgta.adapter.CheatAdapter
import br.com.willaimsilva.cheatsgta.databinding.FragmentHomeBinding
import br.com.willaimsilva.cheatsgta.repository.CheatsRepository

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel = ViewModelProvider(this)[HomeViewModel::class.java]

        binding = FragmentHomeBinding.inflate(inflater, container, false)

        // Objetivo -> Mostra list
        // 3 - Colocar o adapter na recycler view
        // 2 - Instanciar o adapter
        // 1 - Pegar as manhas

        val repository = CheatsRepository()
        val cheats = repository.findAllSa()
        val adapter = CheatAdapter(cheats)
        binding.recyclerView.adapter = adapter

        return binding.root
    }

}