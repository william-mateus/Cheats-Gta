package br.com.willaimsilva.cheatsgta.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import br.com.willaimsilva.cheatsgta.adapter.CheatsIIIAdapter
import br.com.willaimsilva.cheatsgta.databinding.FragmentSlideshowBinding
import br.com.willaimsilva.cheatsgta.repository.CheatsIIIRepository

class SlideshowFragment : Fragment() {

 private lateinit var binding:FragmentSlideshowBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val slideshowViewModel =
            ViewModelProvider(this)[SlideshowViewModel::class.java]

        binding = FragmentSlideshowBinding.inflate(inflater, container, false)

        val repository = CheatsIIIRepository()
        val cheats = repository.findAllIii()
        val adapter = CheatsIIIAdapter(cheats)
        binding.recyclerView.adapter = adapter

        return binding.root
    }


}