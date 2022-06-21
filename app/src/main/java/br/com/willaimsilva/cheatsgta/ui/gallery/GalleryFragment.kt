package br.com.willaimsilva.cheatsgta.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import br.com.willaimsilva.cheatsgta.adapter.CheatAdapter
import br.com.willaimsilva.cheatsgta.adapter.CheatsVcAdapter
import br.com.willaimsilva.cheatsgta.databinding.FragmentGalleryBinding
import br.com.willaimsilva.cheatsgta.repository.CheatsVc

class GalleryFragment : Fragment() {

    private lateinit var binding: FragmentGalleryBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel = ViewModelProvider(this)[GalleryViewModel::class.java]

        binding = FragmentGalleryBinding.inflate(inflater, container, false)

        val repository = CheatsVc()
        val cheats = repository.FindAllVc()
        val adapter = CheatsVcAdapter(cheats)

        binding.recyclerViewVc.adapter = adapter

        return binding.root
    }


}