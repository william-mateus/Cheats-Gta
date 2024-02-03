package br.com.willaimsilva.cheatsgta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.willaimsilva.cheatsgta.adapter.Cheats2Adpter
import br.com.willaimsilva.cheatsgta.adapter.CheatsIVAdapter
import br.com.willaimsilva.cheatsgta.databinding.FragmentGta2Binding
import br.com.willaimsilva.cheatsgta.databinding.FragmentGtaivBinding
import br.com.willaimsilva.cheatsgta.repository.CheatsGta2
import br.com.willaimsilva.cheatsgta.repository.CheatsIV


class fragment_gta2 : Fragment() {

    private lateinit var binding: FragmentGta2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGta2Binding.inflate(inflater, container, false)

        val repository = CheatsGta2()
        val cheats = repository.findAllGta2()
        val adapter = Cheats2Adpter(cheats)

        binding.recyclerView2.adapter = adapter

        return binding.root
    }


}

