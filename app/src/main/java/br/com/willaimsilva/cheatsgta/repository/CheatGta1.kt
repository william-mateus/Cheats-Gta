package br.com.willaimsilva.cheatsgta.repository

import br.com.willaimsilva.cheatsgta.R
import br.com.willaimsilva.cheatsgta.model.Cheats

class CheatGta1 {
    private val cheats1: List<Cheats> = listOf(
        Cheats(
            "Vida",
            "SATANLIVES",
            "O número de vidas que aumenta até 99.",
            R.drawable.logogta1
        ),
        Cheats(
            "Modo Deus",
            "HANGTHEDJ",
            "código da Fraude para a imortalidade ",
            R.drawable.logogta1
        ),
        Cheats(
            "Sem policia",
            "CHUFF",
            "a Polícia não perceber crimes cometidos por um personagem",
            R.drawable.logogta1
        ),
        Cheats(
            "Max de Procurado",
            "EATTHIS",
            "Máximo nível está ativado.",
            R.drawable.logogta1
        ),
        Cheats(
            "Armas",
            "GROOVY ou MADEMAN",
            "Todas as armas estão disponíveis",
            R.drawable.logogta1
        ),
        Cheats(
            "Colete",
            "PECKINPAH",
            "Cheat para todas as armas, blindados jaqueta e um Cartão de Prisão.",
            R.drawable.logogta1
        ),
        Cheats(
            "Dinheiro",
            "WEYHEY",
            " enganar o Dinheiro. /$9,999,990 (pontos) é creditado na conta do jogador.",
            R.drawable.logogta1
        ),
        Cheats(
            "Autar Pontos",
            "EXCREMENT",
            "Jogo de multiplicador de experiência é igual a 5. Por exemplo, /$100 (pontos) obtidas vai virar 500 (100х5 = 500).",
            R.drawable.logogta1
        ),
        Cheats(
            "Mapa San Andreas",
            "TVMAN",
            "Alguns distritos de San Andreas são desbloqueados.",
            R.drawable.logogta1
        ),
        Cheats(
            "Desbloquea  Liberty City ",
            "FECK",
            "Uma parte de Liberty City é desbloqueado.",
            R.drawable.logogta1
        ),
        Cheats(
            "Desbloquear Mapa",
            "CAPRICE ou TURF",
            "Todas as cidades são desbloqueados",
            R.drawable.logogta1
        ),
        Cheats(
            "Desbloquear cidades",
            "URGE",
            "Todas as cidades, exceto Vice City são desbloqueados.",
            R.drawable.logogta1
        ),
        Cheats(
            "Super Herói",
            "BSTARD",
            " Todos os mapas são desbloqueados, todas as armas com munição infinita estão disponíveis, o número de vidas aumenta até 99.",
            R.drawable.logogta1
        ),
        Cheats(
            "GPS",
            "BLOWME",
            " Permite coordenadas de visualização.",
            R.drawable.logogta1
        ),
        Cheats(
            "Selecionar Nivel",
            "SKYBABIES",
            "Permite seleccionar um nível de jogo.",
            R.drawable.logogta1
        ),
        Cheats(
            "Log do Jogo",
            "INGLORIOUS",
            "Permite selecionar qualquer nível de jogo e definição de parâmetros adicionais.",
            R.drawable.logogta1
        ),
    )
    fun findAllGta1():List<Cheats>{
        return this.cheats1
    }
}