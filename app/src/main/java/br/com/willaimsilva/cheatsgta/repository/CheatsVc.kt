package br.com.willaimsilva.cheatsgta.repository

import br.com.willaimsilva.cheatsgta.R
import br.com.willaimsilva.cheatsgta.model.Cheats

class CheatsVc {
    private val CheatsVici: List<Cheats> = listOf(

        Cheats(
            "Armas 1",
            "R1, R2, L1, R2, ←, ↓, →, ↑, ←, ↓, → e ↑",
            "Pack de armas 1",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Armas 2",
            "R1 R2 L1 R2 ←, ↓, →, ↑, ←, ↓, ↓ e ←",
            "Pack de armas 2",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Armas 3",
            "R1 R2 L1 R2 ←, ↓, →, ↑, ←, ↓, ↓ e ↓",
            "Pack de armas 3",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Colete completo",
            "R1, R2, L1, X, ←, ↓, →, ↑, ←, ↓, →, ↑",
            "Voce ganha um colete",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Saúde completa",
            "R1, R2, L1, O, ←, ↓, →, ↑, ←, ↓, →, ↑",
            "Sua barra de vida ficara cheia",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Suicídio",
            "→, L2, ↓, R1, ←, ←, R1, L1 L2 L1",
            "voce morre e volta no Hospital mais próximo",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Nível de procurado aumentado",
            "R1, R1, O, R2, ←, →, ←, →, ←, →",
            "Voce sera procurado",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Nível procurado diminuído",
            "R1, R1, O, R2, ↑, ↓, ↑, ↓, ↑, ↓",
            "Diminui seu nivel de procurado mas nao elimina a policia",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Mulheres seguem você",
            "O, X, L1, L1, R2, X, X, O, △",
            "As mulheres seguem voce",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Jogar com Ricardo Diaz",
            "L1, L2, R1, R2, ↓, L1, R2, L2",
            "Troca seu personagem",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Jogar com Lance Vance",
            "O, L2, ←, X, R1, L1, X, L1",
            "Troca seu personagem",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Jogar com Candy Suxxx",
            "O, R2, ↓, R1, ←, →, R1, L1, X, L2",
            "Troca seu personagem",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Jogar com Ken Rosenberg",
            "→, L1, ↑, L2, L1, →, R1, L1, X, R1",
            "Troca seu personagem",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Jogar com Hilary King",
            "R1, O, R2, L1, →, R1, L1, X, R2",
            "Troca seu personagem",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Jogar com Love Fist Guy 1",
            "↓, L1, ↓, L2, ←, X, R1, L1, X, X",
            "Troca seu personagem",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Jogar com Love Fist Guy 2",
            "R1, L2, R2, L1, ←, R2, →, X, ▢, L1",
            "Troca seu personagem",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Jogar com Phil Cassady",
            "→, R1, ↑, R2, L1, →, R1, L1, O",
            "Troca seu personagem",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Jogar com Sonny Forelli",
            "O, L1, O, L2, ←, X, R1, L1, X,",
            "Troca seu personagem",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Jogar com Mercedez",
            "R2, L1, ↑, L1, →, R1, →, ↑, O, △",
            "Troca seu personagem",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Rhino",
            "O, O, O, L1, O, O, O, L1, L2, R1, △, O, △",
            "Tank",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Bloodring Racer",
            "↓, R1, O, L2, L2, X, R1, L1, ←, ←",
            "Carro de corrida velho",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Bloodring Banger",
            "↑, →, →, L1, →, ↑, ▢, L2",
            "Carro de corrida velho 2",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Hotring Racer 1",
            "R1, O, R2, →, L1, L2, X, X, ▢, R1",
            "Carro de corrida 1",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Hotring Racer 2",
            "R2, L1, O, →, L1, R1, →, ↑, O, R2",
            "Carro de caorrida 2",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Romero's Hearse",
            "↓, R2, ↓, R1, L2, ←, R1, L1, ←, →",
            "Carro",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Love Fist",
            "R2, ↑, L2, ←, ←, R1, L1, O, →",
            "Sem Descrição",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Trashmaster",
            "O, R1, O, R1, ←, ←, R1, L1, O, →",
            "Sem Descrilçao",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Sabre Turbo",
            "→, L2, ↓, L2, L2, X, R1, L1, O ←",
            "Carro Turbo",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Caddie",
            "O, L1, ↑, R1, L2, X, R1, L1, O, X",
            "Carro de Golf",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Explodir todos os carros",
            "R2, L2, R1, L1, L2, R2, ▢, △, O, △, L2, L1",
            "Todos os carros ao redor explodem",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Motoristas violentos",
            "R2, O, R1, L2, ←, R1, L1, R2, L2",
            "Motoristas querem brigar quando voce bate",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Carros rosas",
            "O, L1, ↓, L2, ←, X, R1, L1, →, O",
            "Todos os carros são rosa",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Carros pretos",
            "O, L2, ↑, R1, ←, X, R1, L1, →, O",
            "Todos os carros ficam na cor preta",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Carro desliza",
            "→, R2, O, R1, L2, ↓, L1, R1",
            "Seu carro faz drift mais facil",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Direção perfeita",
            "△, R1, R1, ←, R1, L1, R2, L1",
            "Sua Barra de Direção fica no maxímo",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Pedestres em motim",
            "↓, ←, ↑, ←, X, R2, R1, L2, L1",
            "Todos os pedestres ficam malucos",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Pedestres odeiam você",
            "↓, ↑, ↑, ↑, X, R2, R1, ←, ←",
            "Todos os pedestres querem te atacar",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Pedestres armados",
            "R2, R1, X, △, X, △, ↑, ↓",
            "Todos os pedestres andam com armas",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Carros flutuam na água",
            "→, R2, O, R1, L2, ▢, R1, R2",
            "Carro pode ser dirigido na agua",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Muda o tamanho dos pneus",
            "R1, X, △, →, R2, ▢, ↑, ↓, ▢",
            "As rodas dos veiculos ficam maiores",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Policiais ressuscitam",
            "O, L1, ↓, L2, ←, X, R1, L1, →, X",
            "Sem Descrição",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Mulheres armadas e de biquíni",
            "→, L1, O, L2, ←, X, R1, L1 L1, X",
            "Voces Sabem né...",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Dia ensolarado",
            "R2, X, L1 (2x), L2 (3x), ↓",
            "Sempre tem sol",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Dia nublado",
            "R2, X, L1 L1, L2 L2, L2, △",
            "O dia fica nublado",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Dia muito nublado",
            "R2, X, L1 L1, L2, L2, L2, ▢",
            "Sem Descrição",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Dia com neblina",
            "R2, X, L1 L1, L2, L2, L2, O",
            "Sem Descrição",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Dia com tempestade",
            "R2, X, L1 L1, L2, L2, L2, X",
            "Sem Descrição",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Tempo acelerado",
            "O, O, L1, ▢, L1, ▢, ▢, ▢, L1, △, O, △",
            "Todo o jogo ficara mais rapido",
            R.drawable.icon_gta_viciii
        ),
        Cheats(
            "Tempo lento",
            "△, ↑, →, ↓, ▢, R2, R1",
            "O jogo ficara em camera lenta",
            R.drawable.icon_gta_viciii
        ),

    )

    fun FindAllVc(): List<Cheats> {
        return this.CheatsVici
    }
}