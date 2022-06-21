package br.com.willaimsilva.cheatsgta.repository

import br.com.willaimsilva.cheatsgta.R
import br.com.willaimsilva.cheatsgta.model.Cheats


class CheatsRepository {

    private val cheatsSanAndreas: List<Cheats> = listOf(
          Cheats(
              "Armas 1",
              "R1, R2, L1, R2, ←, ↓, →, ↑, ←, ↓, → e ↑",
              "Pistola 9mm, bastão de beisebol, espingarda, MP5, AK-47, rifle, lançador de foguetes, molotovs e lata de spray",
              R.drawable.icon_gta_sa

          ),
          Cheats(
              "Armas 2",
              "R1, R2, L1, R2, ←, ↓, →, ↑, ↓, ↓ e ↓",
              "Faca, Desert Eagle, Tec-9, navalha, M4, Sniper, lança-chamas, granadas e extintor",
              R.drawable.icon_gta_sa
            ),
            Cheats(
                "Armas 3",
                "R1, R2, L1, R2, ←, ↓, →, ↑, ↓ e ↓",
                "Serra elétrica, pistola 9mm com silenciador, S.P.A.S., MP5, M4, explosivos remotos, Sniper, bazuca com detector de calor",
                R.drawable.icon_gta_sa
            ),
            Cheats(
                "Saúde e munição",
                "R1, R2, L1, X, ←, ↓, → e ↑",
                "Saúde e munição no máximo e $250,000 de dinheiro",
                R.drawable.icon_gta_sa
            ),
            Cheats(
                "Vida infinita",
                "↓, X, →, ←, →, R1, →, ↓, ↑ e △",
                "Você ainda pode ser morto atropelado, afogado, caindo de alturas elevadas e em explosões",
                R.drawable.icon_gta_sa
            ),
            Cheats(
                "Munição infinita",
                "L1, R1, ▢, R1, ←, R2, R1, ←, ▢, ↑, L1 e L1",
                "Munição para todas as armas",
                R.drawable.icon_gta_sa
            ),
            Cheats(
                "Oxigênio infinito",
                "↓, ←, L1, ↓, ↓, R2, ↓, L2 e ↓",
                "Mergulhe sem se preocupar com afogamento",
                R.drawable.icon_gta_sa
            ),
            Cheats(
                "Cometer suicídio",
                "→, L2, ↑, R1, ←, ←, R1, L1, L2 e L1",
                "Voce morre e volta no Hospital mais próximo",
                R.drawable.icon_gta_sa
            ),
            Cheats(
                "Ativa Modo Adrenalina",
                "X, X, ▢, R1, L1, X, ↓, ← e X",
                "CJ fica mais lento, mas mais forte",
                 R.drawable.icon_gta_sa
            ),
            Cheats(
                "Nunca tem fome",
                "▢, L2, R1, △, ↑, ▢, L2, ↑ e X",
                "Cj nunca tera fome e nunca perderá o músculo ",
                R.drawable.icon_gta_sa
            ),
            Cheats(
                "Nunca ser Procurado",
                "O, →, O, →, ←, ▢, △ e ↑",
                "A policia nao procura mais voce,porem nao zera as estrelas que voce ja possui",
                R.drawable.icon_gta_sa
             ),
            Cheats(
                "Nível 6 de Procuredo",
                "O, →, O, →, ←, ▢, X e ↓",
                "Voce ficará com 6 estrelas e a policia virá atrás de voce",
                R.drawable.icon_gta_sa
             ),

            Cheats(
                "Aumenta o nível de Procurado",
                "R1, R1, O, R2, ←, →, ←, →, ← e →",
                "Cada vez que o código é usado, duas estrelas de Procurado são adicionadas",
                R.drawable.icon_gta_sa
            ),
            Cheats(
                "Reduz o nível de Procurado",
                "R1, R1, O, R2, ↑, ↓, ↑, ↓, ↑ e ↓",
                "Cada vez que o código é usado, duas estrelas de \"Procurado\" são removidas",
                R.drawable.icon_gta_sa

            ),
            Cheats(
                "Recruta pedestres para a gangue de CJ",
                "↓, ▢, ↑, R2, R2, ↑, →, → e ↑",
                "Se os pedestres estiverem desarmados, ganham uma Pistola 9mm",
                 R.drawable.icon_gta_sa

            ),
             Cheats(
                 "Recruta qualquer pessoa para a gangue de CJ",
                 "R2, R2, R2, X, L2, L1, R2, L1, ↓ e X",
                 "Se os pedestres estiverem desarmados, ganham um Lançador de Foguetes",
                 R.drawable.icon_gta_sa

            ),
             Cheats(
                "Respeito no máximo",
                "L1, R1, △, ↑, R2, X, L1, ↑, L2, L2, L1 e L1",
                "Voce conseguirá recrutar mais pessoas para a sua gangue",
                R.drawable.icon_gta_sa

            ),
            Cheats(
                "Sex Appeal no máximo",
                "O, △, △, ↑, O, R1, L2, ↑, △, L1, L1 e L1",
                "Sabe como é né...",
                 R.drawable.icon_gta_sa

             ),

            Cheats(
                "Carro Indestrutível",
                "▢, L2, X, R1, L2, L2, ←, R1, →, L1, L1 e L1",
                "seu carro nunca ficará danificado",
                R.drawable.icon_gta_sa

            ),
            Cheats(
                "CJ fica gordo",
                "△, ↑, ↑, ←, →, ▢, O e ↓",
                "Seu personagem ficará com a gordura no maxímo",
                R.drawable.icon_gta_sa

             ),
            Cheats(
                "CJ fica magro",
                "△, ↑, ↑, ←, →, ▢, O e →",
                "Cj voltará ao peso normal",
                 R.drawable.icon_gta_sa

             ),
             Cheats(
                "CJ fica musculoso",
                "△, ↑, ↑, ←, →, ▢, O e ←",
                "Cj ficará com os musculos no maxímo",
                 R.drawable.icon_gta_sa

            ),
            Cheats(
                "Apenas membros de gangue nas ruas",
                "L2, ↓ R1, R1, ←, R1, R1, R2, → e ↓",
                "Não há polícia ou pedestres nas ruas. Homens armados disparam uns contra os outros. Tráfego apenas nas zonas de gangues",
                R.drawable.icon_gta_sa

             ),
             Cheats(
                "Membros de gangue em todo Estado de San Andreas",
                "←, →, →, →, ←, X, ↓, ↑, ▢, → e ↓",
                "Todas as pessoas do jogo em todo o Estado são membros de gangues.",
                R.drawable.icon_gta_sa

             ),
            Cheats(
                "Hunter",
                "O, X, L1, O, O, L1, O, R1, R2, L2, L1 e L1",
                "Helicóptero",
                R.drawable.icon_gta_sa
            ),
             Cheats(
                "Tanker",
                "R1, ↓, ←, →, R2, ↑, →, ▢, →, L2, L1 e L1",
                "Caminhão",
                 R.drawable.icon_gta_sa
             ),
            Cheats(
                 "Dozer",
                 "R2, L1, L1, →, →, ↑, ↑, X, L1 e ←",
                "Retroescavadeira",
                R.drawable.icon_gta_sa
            ),
            Cheats(
                "Jetpack",
                "↑, ↓, ←, →, L1, L2, R1, R2, ↑, ↓, ← e →",
                "Mochila Jato",
            R.drawable.icon_gta_sa
             ),
            Cheats(
                "Para-quedas",
                "←, →, L1, L2, R1, R2, R2, ↑, ↓, → e L1",
                "Para-quedas",
                 R.drawable.icon_gta_sa
             ),
             Cheats(
                 "Katana",
                 "X, X, ↑, R2, L2, O, R1, O e ▢",
                 "Arma Especial",
                 R.drawable.icon_gta_sa
             ),
            Cheats(
                "Rhino",
                "O, O, L1, O, O, O, L1, L2, R1, △, O e △",
                "Tanque de guerra",
                 R.drawable.icon_gta_sa
             ),
             Cheats(
                 "Ranger",
                 "↓, →, →, L1, →, ↓, ▢ e L2",
                 "Veículo off-road",
                 R.drawable.icon_gta_sa
             ),
             Cheats(
                "Caddy",
                "O, L1, ↓, R1, L2, X, R1, L1, O e X",
                "Carro de golfe",
                 R.drawable.icon_gta_sa
             ),
            Cheats(
                "Hotring Racer 1",
                "R1, O, R2, ←, L1, L2, X, X, ▢ e R1",
                "Carro de corrida",
                R.drawable.icon_gta_sa
              ),
            Cheats(
                "Hotring Racer 2",
                "R2, L1, O, ←, L1, R1, →, ↑, O, R2",
                "Carro de corrida",
                R.drawable.icon_gta_sa
             ),
            Cheats(
                "Bloodring Banger",
                "↑, R1, O, L2, L2, X, R1, L1, ← e ←",
                "Carro de corrida antigo",
                R.drawable.icon_gta_sa

            ),
             Cheats(
                 "Stretch Limo",
                 "R2, ↑, L1, ←, ←, R1, L1, O e →",
                 "Limousine",
                 R.drawable.icon_gta_sa

        ),
             Cheats(
                 "Romero's Hearse",
                 "↓, R2, ↓, R1, L2, ←, R1, L1, ← e →",
                 "Carro funerário",
                 R.drawable.icon_gta_sa

             ),
              Cheats(
                  "Trashmaster",
                  "O, R1, O, R1, ←, ←, R1, L1, O e ←",
                  "Caminhão do lixo",
                  R.drawable.icon_gta_sa

             ),
             Cheats(
                 "Quadriciculo",
                 "←, ←, →, →, ↑, ↑ ▢, O, △, R1 e R2",
                 "Quadriciculo",
                 R.drawable.icon_gta_sa

             ),
            Cheats(
                "Hydra",
                "△, △, ▢, O, X, L1, L1, ↓ e ↑",
                "Jato",
                R.drawable.icon_gta_sa
            ),
             Cheats(
                "Vortex",
                "△, △, ▢, O, X, L2, L2, ↓ e ↓",
                "Barco que anda na água e na terra",
                 R.drawable.icon_gta_sa
             ),
            Cheats(
                "Monster Truck",
                "→, ↑, R1, R1, R1, →, △, △, X, O, L1 e L1",
                "Caminhonete Monstro",
                R.drawable.icon_gta_sa
            ),
            Cheats(
                "Stunt Plane",
                "O, ↑, L1, L2, ↑, R1, L1, L1, ←, ←, X e △",
                "Avião",
                R.drawable.icon_gta_sa
            ),
            Cheats(
                "Céu laranja",
                "←, ←, L2, R1, →, ▢, ▢, L1, L2 e X",
                "O relógio fica parado nas 21h",
                R.drawable.icon_gta_sa
            ),
            Cheats(
                "Acelera o tempo",
                "O, O, L1, ▢, L1, ▢, ▢, ▢, L1, △, O e △",
                "o tempo passa mais rapido",
                 R.drawable.icon_gta_sa
            ),
             Cheats(
                 "Desacelera o tempo",
                 "△, ↑, →, ↓, ▢, R2 e R1",
                 "tudo fica em camera lenta",
                 R.drawable.icon_gta_sa
             ),
             Cheats(
                 "Tempo ensolarado",
                 "R2, X, L1, L1, L2, L2, L2 e △",
                 "auto explicativo",
                 R.drawable.icon_gta_sa
             ),
            Cheats(
                "Tempo muito ensolarado",
                "R2, X, L1, L1, L2, L2, L2 e ↓",
                "auto explicativo",
                R.drawable.icon_gta_sa
            ),
            Cheats(
                "Nublado 1",
                "R2, X, L1, L1, L2, L2, L2 e ▢",
                "nublado",
                 R.drawable.icon_gta_sa
            ),
             Cheats(
                 "Nublado 2",
                 "L2, ↓, ↓, ←, ▢, ←, R2, ▢, X, R1, L1 e L1",
                 "Nublado 2",
                 R.drawable.icon_gta_sa
             ),
             Cheats(
                "Névoa",
                "R2, X, L1, L1, L2, L2, L2 e X",
                 "Névoa",
                 R.drawable.icon_gta_sa
             ),
            Cheats(
                "Tempestade",
                "R2, X, L1, L1, L2, L2, L2 e O",
                "Tempestade",
                 R.drawable.icon_gta_sa
             ),
              Cheats(
                  "Tempestade de areia",
                  "↑, ↓, L1, L1, L2, L2, L1, L2, R1 e R2",
                  "Tempestade de areia",
                  R.drawable.icon_gta_sa
             ),
            Cheats(
                "Sempre meia-noite",
                "▢, L1, R1, →, X, ↑, L1, ← e ←",
                "O relógio trava em 00:00",
                R.drawable.icon_gta_sa
            ),
            Cheats(
                "Ativa o Modo Caos",
                "L2, →, L1, △, →, →, R1, L1, →, L1, L1 e L1",
                "Casas pegam fogo, pedestres assaltam lojas, entre outras coisas",
                 R.drawable.icon_gta_sa
           ),
            Cheats(
                 "Todos os pedestres são Elvis Presley",
                "L1, O, △, L1, L1, ▢, L2, ↑, ↓ e ←",
                "Todos os pedestres são Elvis Presley",
                R.drawable.icon_gta_sa
             ),
             Cheats(
                 "Pedestres atacam com armas",
                 "X, L1, ↑, ▢, ↓, X, L2, △, ↓, R1, L1 e L1",
                 "Pedestres atacam com armas",
                 R.drawable.icon_gta_sa
            ),
            Cheats(
                 "Pedestres caçam CJ",
                 "↓, ↑, ↑, ↑, X, R2, R1, L2 e L2",
                 "Todos os pedestres te atacam",
                 R.drawable.icon_gta_sa
             ),
             Cheats(
                 "Pedestres se rebelam",
                 "↓, ←, ↑, ←, X, R2, R1, L2, e L1",
                 "Pedestres fazem guerra",
                 R.drawable.icon_gta_sa
             ),
            Cheats(
                "Pedestres carregam armas",
                "R2. R1, X, △, X, △, ↑ e ↓",
                "Todos os pedestres andam armados mas nao atiram",
                R.drawable.icon_gta_sa
             ),
             Cheats(
                "Tema Ninja",
                "X, X, ↓, R2, L2, O, R1, O e ▢",
                "Todos os pedestres são homens asiáticos com katanas. Todos os carros são pretos. CJ ganha uma katana",
                 R.drawable.icon_gta_sa
             ),
             Cheats(
                 "Tema Festa",
                 "△, △, L1, ▢, ▢, O, ▢, ↓ e O",
                 "CJ fica com nariz e cabelo de palhaço. Pedestres ficam com roupas engraçadas. Carro de sorvete aparece com frequência",
                 R.drawable.icon_gta_sa
             ),
            Cheats(
                "Atrai mulheres",
                "▢, ←, ▢, ▢, L2, X, △, X e △",
                "Atrai mulheres",
                R.drawable.icon_gta_sa
             ),
            Cheats(
                "Mira perfeita enquanto está dirigindo",
                "↑, ↑, ▢, L2, →, X, R1, ↓, R2 e O",
                "Enquanto dirigi voce consegue mirar perfeitamente nas pessoas",
                 R.drawable.icon_gta_sa
             ),
             Cheats(
                 "CJ se move mais rápido",
                 "△, ↑, →, ↓ L2, L1 e ▢",
                 "Todo o jogo fica mais rapido",
                 R.drawable.icon_gta_sa
             ),
            Cheats(
                "CJ pula mais alto",
                "↑, ↑, △, △, ↑, ↑, ←, →, ▢, R2 e R2",
                "Pulo é 10x mais alto que o normal",
                 R.drawable.icon_gta_sa
             ),
             Cheats(
                "Soco mais forte",
                "↑, ←, X, △, R1, O, O, O e L2",
                "Um soco mata. Todos os pedestres ganham essa modificação",
                R.drawable.icon_gta_sa
             ),
            Cheats(
                "Festa na praia",
                "↑, ↑, ↓, ↓, ▢, O, L1, R1, △ e ↓",
                "Pedestres viram mulheres de biquini, CJ usa sandálias e calções e todos os veículos ficam com estilo praia",
                 R.drawable.icon_gta_sa
             ),
             Cheats(
                "Todos os carros têm nitro",
                 "←, △, R1, L1, ↓, ▢, △, ↓, O, L2, L1 e L1",
                "Exatamente todos os carros ficam com nitro",
                 R.drawable.icon_gta_sa
             ),
            Cheats(
                "Carros saltam no ar em batidas",
                "▢, R2, ↓, ↓, ←, ↓, ←, ←, L2 e X",
                "Quando voce bate em um carro ele fica flutuando",
                 R.drawable.icon_gta_sa
            ),
             Cheats(
                "Todos os carros são rurais 1",
                "L1, L1, R1, R1, L2, L1, R2, ↓, ← e ↑",
                "Pessoas são rurais",
                R.drawable.icon_gta_sa
             ),
             Cheats(
                "Todos os carros são rurais 2",
                "△, ←, ▢, R2, ↑, L2, ↓, L1, X, L1, L1 e L1",
                "Todos os carros são rurais 2",
                R.drawable.icon_gta_sa
             ),
            Cheats(
                "Todos os carros são ruins",
                "L2, →, L1, ↑, X, L1, L2, R2, R1, L1, L1 e L1",
                "Somente carros velhos nas ruas",
                 R.drawable.icon_gta_sa
            ),
             Cheats(
                 "Todos os carros são invisíveis",
                 "△, L1, △, R2, ▢, L1 e L1",
                 "As motos têm apenas as rodas invisíveis",
                 R.drawable.icon_gta_sa
             ),
            Cheats(
                "Controle do carro melhorado",
                "△, R1, R1, ←, R1, L1, R2 e L1",
                "Apertar R3 faz o carro pular",
                 R.drawable.icon_gta_sa
             ),
             Cheats(
                 "Carros mais rápidos",
                 "→, R1, ↑, L2, L2, ←, R1, L1, R1 e R1",
                 "Carrod Raros",
                 R.drawable.icon_gta_sa
             ),
             Cheats(
                "Tráfego intenso",
                "R2, O, R1, L2, ←, R1, L1, R2 e L2",
                "Muito mais carros na rua",
                 R.drawable.icon_gta_sa
             ),
             Cheats(
                  "Tráfego reduzido",
                 "X, ↓, ↑, R2, ↓, △, L1, △ e ←",
                 "Não há pedestres",
                 R.drawable.icon_gta_sa
             ),
             Cheats(
                "Dirigir na água",
                "→, R2, O, R1, L2, ▢, R1 e R2",
                "Todos os carros andam na agua",
                 R.drawable.icon_gta_sa
             ),
            Cheats(
               "Destruir todos os carros",
                "R2, L2, R1, L1, L2, R2, ▢, △, O, △, L2 e L1",
                "Todos os Carros explodem",
                R.drawable.icon_gta_sa
             ),
             Cheats(
                 "Carros da cor preta",
                 "O, L2, ↑, R1, ←, X, R1, L1, ← e O",
                 "Todos os carros são pretos",
                 R.drawable.icon_gta_sa
            ),
            Cheats(
                 "Carros da cor rosa",
                 "O, L1, ↓, L2, ←, X, R1, L1, → e O",
                 "Todos os carros ficam com a cor rosa",
                  R.drawable.icon_gta_sa
             ),
             Cheats(
                 "Táxis possuem nitro",
                 "↑, X, △, X, △, X, ▢, R2 e →",
                 "Impossível desativar o código",
                 R.drawable.icon_gta_sa
             ),
            Cheats(
                "Carros raros e rápidos aparecem com mais frequência",
                "↑, L1, R1, ↑, →, ↑, X, L2, X e L1",
                "Carros raros aparecem nas ruas",
                 R.drawable.icon_gta_sa
             ),
            Cheats(
                 "Carros voam",
                 "▢, ↓, L2, ↑, L1, O, ↑, X e ←",
                 "O controle é semelhante ao de um avião",
                R.drawable.icon_gta_sa
             ),
            Cheats(
                "Barcos voam",
                "R2, O, ↑, L1, →, R1, →, ↑, ▢ e △",
                "Todos os Barcos podem voar",
                 R.drawable.icon_gta_sa
             ),
            Cheats(
                "Carro da Morte",
                "L1, L2, L2, ↑, ↓, ↓, ↑, R1, R2 e R2",
                "O carro controlado por CJ fica indestrutível e destrói tudo que toca",
                R.drawable.icon_gta_sa
             ),
            Cheats(
                 "Saltos com uma bicicleta",
                 "△, ▢, O, O, ▢, O, O, L1, L2, L2, R1 e R2",
                 "CJ salta por cima de prédios com uma bicicleta",
                 R.drawable.icon_gta_sa
             ),


        )

    fun findAllSa(): List<Cheats> {
        return this.cheatsSanAndreas
    }
}