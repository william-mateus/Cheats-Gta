package br.com.willaimsilva.cheatsgta.repository

import br.com.willaimsilva.cheatsgta.R
import br.com.willaimsilva.cheatsgta.model.Cheats

class CheatsGta2 {
    private val cheatsII: List<Cheats> = listOf(
        Cheats(
            "Seleção de nível",
            "ITSALLUP",
            "Seleciona nivel de policia",
            R.drawable.gta2_vdd
        ),
        Cheats(
            "Vida infinita:",
            "LIVELONG",
            "Sem descrição",
            R.drawable.gta2_vdd

        ),
        Cheats(
            "Todas as armas",
            "NAVARONE",
            "Sem Descrição",
            R.drawable.gta2_vdd

        ),
        Cheats(
            "Turbo mode",
            "IGNITION",
            "jogo mais rapido",
            R.drawable.gta2_vdd

        ),
        Cheats(
            "Sem polícia",
            "LOSEFEDS",
            "baixar level de procurado",
            R.drawable.gta2_vdd

        ),
        Cheats(
            "Exibir coordenadas",
            "WUGGLES",
            "Sem descrição",
            R.drawable.gta2_vdd

        ),
        Cheats(
            "Nível máximo de procurado",
            "DESIRES",
            "6 estrelas",
            R.drawable.gta2_vdd

        ),
        Cheats(
            "5x multiplicador",
            "HIGHFIVE",
            "Sem Descrição",
            R.drawable.gta2_vdd

        ),
        Cheats(
            "10 milhões de pontos",
            "BIGSCORE",
            "Sem Descrição",
            R.drawable.gta2_vdd

        ),
        Cheats(
            "500,000",
            "MUCHCASH",
            "Dinheiro",
            R.drawable.gta2_vdd

        ),
        Cheats(
            "Dinheiro ilimitado",
            "IAMPLAYA",
            "",
            R.drawable.gta2_vdd

        ),
        Cheats(
            "Debug de scripts básicos",
            "NOFRILLS",
            "Codigo do jogo",
            R.drawable.gta2_vdd

        ),
    )
    fun findAllGta2():List<Cheats>{
        return this.cheatsII
    }
}