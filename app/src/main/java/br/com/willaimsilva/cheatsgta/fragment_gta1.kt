package br.com.willaimsilva.cheatsgta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.willaimsilva.cheatsgta.adapter.Cheats1Adapter
import br.com.willaimsilva.cheatsgta.adapter.CheatsIVAdapter
import br.com.willaimsilva.cheatsgta.databinding.FragmentGta1Binding
import br.com.willaimsilva.cheatsgta.databinding.FragmentGtaivBinding
import br.com.willaimsilva.cheatsgta.repository.CheatGta1
import br.com.willaimsilva.cheatsgta.repository.CheatsIV


class fragment_gta1 : Fragment() {

    private lateinit var binding: FragmentGta1Binding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentGta1Binding.inflate(inflater, container, false)

        val repository = CheatGta1()
        val cheats = repository.findAllGta1()
        val adapter = Cheats1Adapter(cheats)

        binding.recyclerView1.adapter = adapter

        return binding.root
    }

}