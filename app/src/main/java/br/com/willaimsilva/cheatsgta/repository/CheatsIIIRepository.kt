package br.com.willaimsilva.cheatsgta.repository

import br.com.willaimsilva.cheatsgta.R
import br.com.willaimsilva.cheatsgta.model.Cheats

class CheatsIIIRepository {
    private val cheatsiii: List<Cheats> = listOf(

        Cheats(
            "Destrave todas as armas",
            "R2, R2, L1, R2, ←, ↓, →, ↑, ←, ↓, →, ↑",
            "Libera todas as armas do jogo",
            R.drawable.icon_gta_iii
        ),
        Cheats(
            "Armadura cheia",
            "R2, R2, L1, L2, ←, ↓, →, ↑, ←, ↓, →, ↑",
            "Colete no maximo",
            R.drawable.icon_gta_iii
        ),
        Cheats(
            "Recupere a vida",
            "R2, R2, L1, R1, ←, ↓, →, ↑, ←, ↓, →, ↑",
            "Recupera também o carro que você está dirigindo.",
            R.drawable.icon_gta_iii
        ),
        Cheats(
            "Exploda todos os carros",
            "L2, R2, L1, R1, L2, R2, △, ◻, ◯, △, L2, L1",
            "Todo os Carros ao seu redor Explodem ",
            R.drawable.icon_gta_iii
        ),
        Cheats(
            "Tempo limpo",
            "L1, L2, R1, R2, R2, R1, L2, △",
            "Mudança no clima",
            R.drawable.icon_gta_iii
        ),
        Cheats(
            "Tempo fechado",
            "L1, L2, R1, R2, R2, R1, L2, ◻",
            "Mudança no clima",
            R.drawable.icon_gta_iii
        ),
        Cheats(
            "Tempo nublado",
            "L1, L2, R1, R2, R2, R1, L2, X",
            "Mudança no clima",
            R.drawable.icon_gta_iii
        ),
        Cheats(
            "Tempo chuvoso",
            "L1, L2, R1, R2, R2, R1, L2, ◯",
            "Mudança no clima",
            R.drawable.icon_gta_iii
        ),
        Cheats(
            "Pedestres malucos",
            "R2, R1, △, X, L2, L1, ↑, ↓",
            "Pedestres andam pelas ruas com armas",
            R.drawable.icon_gta_iii
        ),
        Cheats(
            "Comece um tumulto",
            "↓, ↑, ←, ↑, X, R1, R2, L2, L1",
            "Todos os pedestres fazem guerra",
            R.drawable.icon_gta_iii
        ),
        Cheats(
            "Câmera lenta",
            "△, ↑, →, ↓, ▢, R1, R2",
            "Todo o jogo ficara mais lento",
            R.drawable.icon_gta_iii
        ),
        Cheats(
            "Jogo acelerado",
            "△, ↑, →, ↓, ▢, L1, L2",
            "Todo o jogo ficara muito mais rapido em sua jogatina",
            R.drawable.icon_gta_iii
        ),
        Cheats(
            "Avance no tempo",
            "◯, ◯, ◯, ▢, ▢, ▢, ▢, ▢, L1, △, ◯, △",
            "O relogio pulará algumas horas",
            R.drawable.icon_gta_iii
        ),
        Cheats(
            "Carros voadores",
            "→, R2, ◯, R1, L2, ↓, L1, R1",
            "Todos os carros passam a voar quando voce acelera",
            R.drawable.icon_gta_iii
        ),
        Cheats(
            "Tanque",
            "◯, ◯, ◯, ◯, ◯, ◯, R1, L2, L1, △, ◯, △",
            "Tanque de guerra",
            R.drawable.icon_gta_iii
        ),
        Cheats(
            "Melhore a habilidade de direção",
            "R1, L1, R2, L1, ←, R1, R1, △",
            "Melhora curvas, aceleração, frenagem e permite pular do carro apertando L3.",
            R.drawable.icon_gta_iii
        ),
        Cheats(
            "Carros invisíveis",
            "L1, L1, ▢, R2, △, L1, △",
            "Todos os carros ficam só com as rodas visíveis",
            R.drawable.icon_gta_iii
        ),
        Cheats(
            "Aumente o nível de procurado",
            "R2, R2, L1, R2, ←, →, ←, →, ←, →",
            "Aumentará 2 estrelas em seu nivel de procurado",
            R.drawable.icon_gta_iii
        ),
        Cheats(
            "Diminua o nível de procurado",
            "R2, R2, L1, R2, ↑, ↓, ↑, ↓, ↑, ↓",
            "Diminui 2 estrelas no seu nivel de procurado",
            R.drawable.icon_gta_iii
        ),
        Cheats(
            "Mais dinheiro",
            "R2, R2, L1, L1, ←, ↓, →, ↑, ←, ↓, →, ↑",
            "$250.000",
            R.drawable.icon_gta_iii
        ),
        Cheats(
            "Mais sangue",
            "▢, L1, ◯, ↓, L1, R1, △, →, L1, X",
            "Sem Descrição",
            R.drawable.icon_gta_iii
        ),
        Cheats(
            "Faça os pedestres te atacar",
            "↓, ↑, ←, ↑, X, R1, R2, L1, L2",
            "Todos os pedestres querem bater em voce e te seguem",
            R.drawable.icon_gta_iii
        ),
        Cheats(
            "Faça os pedestres lutar entre eles",
            "↓, ↑, ←, ↑, X, R1, R2, L2, L1",
            "Todos os pedestres começam a brigar",
            R.drawable.icon_gta_iii
        ),
        Cheats(
            "Destrave todas as roupas",
            "→, ↓, ←, ↑, L1, L2, ↑, ←, ↓, →",
            "Todas as roupas da loja ficaram disponiveis",
            R.drawable.icon_gta_iii
        ),

    )

    fun findAllIii() :List<Cheats> {
        return this.cheatsiii
    }
}