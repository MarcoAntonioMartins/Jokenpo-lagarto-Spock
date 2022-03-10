// public String jogar_partida(Jogador jogador1, Jogador jogador2, Jogador jogador3) {

//     String resultado = "Empate";

//     System.out.println(jogador1.getJogada());
//     System.out.println(jogador2.getJogada());
//     System.out.println(jogador3.getJogada());

//     // VERIFICA SE TODAS AS JOGADAS SÃO IGUAIS
//     if (jogador1.getJogada().equals(jogador2.getJogada()) && jogador1.getJogada().equals(jogador3.getJogada())) {

//         System.out.println("Empate entre todos os jogadores");

//     }

//     // EMPATES TRINGULO

//     else if (jogador1.getJogada().equals("Tesoura")
//             && jogador2.getJogada().equals("Papel") && jogador3.getJogada().equals("Pedra")
//             || jogador2.getJogada().equals("Pedra") && jogador3.getJogada().equals("Papel")) {

//         System.out.println("Empate entre todos os jogadores");

//     } else if (jogador1.getJogada().equals("Papel")
//             && jogador2.getJogada().equals("Pedra") && jogador3.getJogada().equals("Lagarto")
//             || jogador2.getJogada().equals("Lagarto") && jogador3.getJogada().equals("Pedra")) {

//         System.out.println("Empate entre todos os jogadores");

//     } else if (jogador1.getJogada().equals("Pedra")
//             && jogador2.getJogada().equals("Lagarto") && jogador3.getJogada().equals("Spock")
//             || jogador2.getJogada().equals("Spock") && jogador3.getJogada().equals("Lagarto")) {

//         System.out.println("Empate entre todos os jogadores");

//     } else if (jogador1.getJogada().equals("Lagarto")
//             && jogador2.getJogada().equals("Spock") && jogador3.getJogada().equals("Tesoura")
//             || jogador2.getJogada().equals("Tesoura") && jogador3.getJogada().equals("Spock")) {

//         System.out.println("Empate entre todos os jogadores");

//     } else if (jogador1.getJogada().equals("Spock")
//             && jogador2.getJogada().equals("Tesoura") && jogador3.getJogada().equals("Papel")
//             || jogador2.getJogada().equals("Papel") && jogador3.getJogada().equals("Tesoura")) {

//         System.out.println("Empate entre todos os jogadores");

//     }

//     // 2
//     else if (jogador2.getJogada().equals("Tesoura")
//             && jogador1.getJogada().equals("Papel") && jogador3.getJogada().equals("Pedra")
//             || jogador1.getJogada().equals("Pedra") && jogador3.getJogada().equals("Papel")) {

//         System.out.println("Empate entre todos os jogadores");

//     } else if (jogador2.getJogada().equals("Papel")
//             && jogador1.getJogada().equals("Pedra") && jogador3.getJogada().equals("Lagarto")
//             || jogador1.getJogada().equals("Lagarto") && jogador3.getJogada().equals("Pedra")) {

//         System.out.println("Empate entre todos os jogadores");

//     } else if (jogador2.getJogada().equals("Pedra")
//             && jogador1.getJogada().equals("Lagarto") && jogador3.getJogada().equals("Spock")
//             || jogador1.getJogada().equals("Spock") && jogador3.getJogada().equals("Lagarto")) {

//         System.out.println("Empate entre todos os jogadores");

//     } else if (jogador2.getJogada().equals("Lagarto")
//             && jogador1.getJogada().equals("Spock") && jogador3.getJogada().equals("Tesoura")
//             || jogador1.getJogada().equals("Tesoura") && jogador3.getJogada().equals("Spock")) {

//         System.out.println("Empate entre todos os jogadores");

//     } else if (jogador2.getJogada().equals("Spock")
//             && jogador1.getJogada().equals("Tesoura") && jogador3.getJogada().equals("Papel")
//             || jogador1.getJogada().equals("Papel") && jogador3.getJogada().equals("Tesoura")) {

//         System.out.println("Empate entre todos os jogadores");

//     }

//     // 3

//     else if (jogador3.getJogada().equals("Tesoura")
//             && jogador2.getJogada().equals("Papel") && jogador1.getJogada().equals("Pedra")
//             || jogador2.getJogada().equals("Pedra") && jogador1.getJogada().equals("Papel")) {

//         System.out.println("Empate entre todos os jogadores");

//     } else if (jogador3.getJogada().equals("Papel")
//             && jogador2.getJogada().equals("Pedra") && jogador1.getJogada().equals("Lagarto")
//             || jogador2.getJogada().equals("Lagarto") && jogador1.getJogada().equals("Pedra")) {

//         System.out.println("Empate entre todos os jogadores");

//     } else if (jogador3.getJogada().equals("Pedra")
//             && jogador2.getJogada().equals("Lagarto") && jogador1.getJogada().equals("Spock")
//             || jogador2.getJogada().equals("Spock") && jogador1.getJogada().equals("Lagarto")) {

//         System.out.println("Empate entre todos os jogadores");

//     } else if (jogador3.getJogada().equals("Lagarto")
//             && jogador2.getJogada().equals("Spock") && jogador1.getJogada().equals("Tesoura")
//             || jogador2.getJogada().equals("Tesoura") && jogador1.getJogada().equals("Spock")) {

//         System.out.println("Empate entre todos os jogadores");

//     } else if (jogador3.getJogada().equals("Spock")
//             && jogador2.getJogada().equals("Tesoura") && jogador1.getJogada().equals("Papel")
//             || jogador2.getJogada().equals("Papel") && jogador1.getJogada().equals("Tesoura")) {

//         System.out.println("Empate entre todos os jogadores");

//     }

//     // EMPATES JOGADOR 1 COM O JOGADOR 2

//     // talvez posso usar esse metodo como principal

//     else if (jogador1.getJogada().equals("Pedra")
//             && jogador2.getJogada().equals("Pedra")
//             && !(jogador3.getJogada().equals("Spock") || jogador3.getJogada().equals("Papel"))) {

//         System.out.println("Empate entre os jogadores " + jogador1.getNome() + " e " + jogador2.getNome());

//     } else if (jogador1.getJogada().equals("Lagarto")
//             && jogador2.getJogada().equals("Lagarto")
//             && !(jogador3.getJogada().equals("Tesoura") || jogador3.getJogada().equals("Pedra"))) {

//         System.out.println("Empate entre os jogadores " + jogador1.getNome() + " e " + jogador2.getNome());

//     } else if (jogador1.getJogada().equals("Spock")
//             && jogador2.getJogada().equals("Spock")
//             && !(jogador3.getJogada().equals("Papel") || jogador3.getJogada().equals("Lagarto"))) {

//         System.out.println("Empate entre os jogadores " + jogador1.getNome() + " e " + jogador2.getNome());

//     } else if (jogador1.getJogada().equals("Tesoura")
//             && jogador2.getJogada().equals("Tesoura")
//             && !(jogador3.getJogada().equals("Pedra") || jogador3.getJogada().equals("Spock"))) {

//         System.out.println("Empate entre os jogadores " + jogador1.getNome() + " e " + jogador2.getNome());

//     } else if (jogador1.getJogada().equals("Papel")
//             && jogador2.getJogada().equals("Papel")
//             && !(jogador3.getJogada().equals("Tesoura") || jogador3.getJogada().equals("Lagarto"))) {

//         System.out.println("Empate entre os jogadores " + jogador1.getNome() + " e " + jogador2.getNome());

//     }

//     // EMPATES JOGADOR 1 COM O JOGADOR 3

//     else if (jogador1.getJogada().equals("Pedra")
//             && jogador3.getJogada().equals("Pedra")
//             && !(jogador2.getJogada().equals("Spock") || jogador2.getJogada().equals("Papel"))) {

//         System.out.println("Empate entre os jogadores " + jogador1.getNome() + " e " + jogador3.getNome());

//     } else if (jogador1.getJogada().equals("Lagarto")
//             && jogador3.getJogada().equals("Lagarto")
//             && !(jogador2.getJogada().equals("Tesoura") || jogador2.getJogada().equals("Pedra"))) {

//         System.out.println("Empate entre os jogadores " + jogador1.getNome() + " e " + jogador3.getNome());

//     } else if (jogador1.getJogada().equals("Spock")
//             && jogador3.getJogada().equals("Spock")
//             && !(jogador2.getJogada().equals("Papel") || jogador2.getJogada().equals("Lagarto"))) {

//         System.out.println("Empate entre os jogadores " + jogador1.getNome() + " e " + jogador3.getNome());

//     } else if (jogador1.getJogada().equals("Tesoura")
//             && jogador3.getJogada().equals("Tesoura")
//             && !(jogador2.getJogada().equals("Pedra") || jogador2.getJogada().equals("Spock"))) {

//         System.out.println("Empate entre os jogadores " + jogador1.getNome() + " e " + jogador3.getNome());

//     } else if (jogador1.getJogada().equals("Papel")
//             && jogador3.getJogada().equals("Papel")
//             && !(jogador2.getJogada().equals("Tesoura") || jogador2.getJogada().equals("Lagarto"))) {

//         System.out.println("Empate entre os jogadores " + jogador1.getNome() + " e " + jogador3.getNome());

//     }

//     // EMPATES JOGADOR 2 COM O JOGADOR 3

//     else if (jogador2.getJogada().equals("Pedra")
//             && jogador3.getJogada().equals("Pedra")
//             && !(jogador1.getJogada().equals("Spock") || jogador1.getJogada().equals("Papel"))) {

//         System.out.println("Empate entre os jogadores " + jogador2.getNome() + " e " + jogador3.getNome());

//     } else if (jogador2.getJogada().equals("Lagarto")
//             && jogador3.getJogada().equals("Lagarto")
//             && !(jogador1.getJogada().equals("Tesoura") || jogador1.getJogada().equals("Pedra"))) {

//         System.out.println("Empate entre os jogadores " + jogador2.getNome() + " e " + jogador3.getNome());

//     } else if (jogador2.getJogada().equals("Spock")
//             && jogador3.getJogada().equals("Spock")
//             && !(jogador1.getJogada().equals("Papel") || jogador1.getJogada().equals("Lagarto"))) {

//         System.out.println("Empate entre os jogadores " + jogador2.getNome() + " e " + jogador3.getNome());

//     } else if (jogador2.getJogada().equals("Tesoura")
//             && jogador3.getJogada().equals("Tesoura")
//             && !(jogador1.getJogada().equals("Pedra") || jogador1.getJogada().equals("Spock"))) {

//         System.out.println("Empate entre os jogadores " + jogador2.getNome() + " e " + jogador3.getNome());

//     } else if (jogador2.getJogada().equals("Papel")
//             && jogador3.getJogada().equals("Papel")
//             && !(jogador1.getJogada().equals("Tesoura") || jogador1.getJogada().equals("Lagarto"))) {

//         System.out.println("Empate entre os jogadores " + jogador2.getNome() + " e " + jogador3.getNome());

//     }

//     // JOGADOR 1 GANHA
//     else if (jogador1.getJogada().equals("Pedra")
//             && (jogador2.getJogada().equals("Lagarto") || jogador2.getJogada().equals("Tesoura"))
//             && (jogador3.getJogada().equals("Lagarto") || jogador3.getJogada().equals("Tesoura"))) {

//         System.out.println("Jogador " + jogador1.getNome() + " Ganhou");

//     } else if (jogador1.getJogada().equals("Lagarto")
//             && (jogador2.getJogada().equals("Spock") || jogador2.getJogada().equals("Papel"))
//             && (jogador3.getJogada().equals("Spock") || jogador3.getJogada().equals("Papel"))) {

//         System.out.println("Jogador " + jogador1.getNome() + " Ganhou");

//     } else if (jogador1.getJogada().equals("Spock")
//             && (jogador2.getJogada().equals("Tesoura") || jogador2.getJogada().equals("Pedra"))
//             && (jogador3.getJogada().equals("Tesoura") || jogador3.getJogada().equals("Pedra"))) {

//         System.out.println("Jogador " + jogador1.getNome() + " Ganhou");

//     } else if (jogador1.getJogada().equals("Tesoura")
//             && (jogador2.getJogada().equals("Papel") || jogador2.getJogada().equals("Lagarto"))
//             && (jogador3.getJogada().equals("Papel") || jogador3.getJogada().equals("Lagarto"))) {

//         System.out.println("Jogador " + jogador1.getNome() + " Ganhou");

//     } else if (jogador1.getJogada().equals("Papel")
//             && (jogador2.getJogada().equals("Pedra") || jogador2.getJogada().equals("Spock"))
//             && (jogador3.getJogada().equals("Pedra") || jogador3.getJogada().equals("Spock"))) {

//         System.out.println("Jogador " + jogador1.getNome() + " Ganhou");

//     }

//     // JOGADOR 2 GANHA
//     if (jogador2.getJogada().equals("Pedra")
//             && (jogador1.getJogada().equals("Lagarto") || jogador1.getJogada().equals("Tesoura"))
//             && (jogador3.getJogada().equals("Lagarto") || jogador3.getJogada().equals("Tesoura"))) {

//         System.out.println("Jogador " + jogador2.getNome() + " Ganhou");

//     } else if (jogador2.getJogada().equals("Lagarto")
//             && (jogador1.getJogada().equals("Spock") || jogador1.getJogada().equals("Papel"))
//             && (jogador3.getJogada().equals("Spock") || jogador3.getJogada().equals("Papel"))) {

//         System.out.println("Jogador " + jogador2.getNome() + " Ganhou");

//     } else if (jogador2.getJogada().equals("Spock")
//             && (jogador1.getJogada().equals("Tesoura") || jogador1.getJogada().equals("Pedra"))
//             && (jogador3.getJogada().equals("Tesoura") || jogador3.getJogada().equals("Pedra"))) {

//         System.out.println("Jogador " + jogador1.getNome() + " Ganhou");

//     } else if (jogador2.getJogada().equals("Tesoura")
//             && (jogador1.getJogada().equals("Papel") || jogador1.getJogada().equals("Lagarto"))
//             && (jogador3.getJogada().equals("Papel") || jogador3.getJogada().equals("Lagarto"))) {

//         System.out.println("Jogador " + jogador2.getNome() + " Ganhou");

//     } else if (jogador2.getJogada().equals("Papel")
//             && (jogador1.getJogada().equals("Pedra") || jogador1.getJogada().equals("Spock"))
//             && (jogador3.getJogada().equals("Pedra") || jogador3.getJogada().equals("Spock"))) {

//         System.out.println("Jogador " + jogador2.getNome() + " Ganhou");

//     }

//     // JOGADOR 3 GANHA
//     if (jogador3.getJogada().equals("Pedra")
//             && (jogador1.getJogada().equals("Lagarto") || jogador1.getJogada().equals("Tesoura"))
//             && (jogador2.getJogada().equals("Lagarto") || jogador2.getJogada().equals("Tesoura"))) {

//         System.out.println("Jogador " + jogador3.getNome() + " Ganhou");

//     } else if (jogador3.getJogada().equals("Lagarto")
//             && (jogador1.getJogada().equals("Spock") || jogador1.getJogada().equals("Papel"))
//             && (jogador2.getJogada().equals("Spock") || jogador2.getJogada().equals("Papel"))) {

//         System.out.println("Jogador " + jogador3.getNome() + " Ganhou");

//     } else if (jogador3.getJogada().equals("Spock")
//             && (jogador1.getJogada().equals("Tesoura") || jogador1.getJogada().equals("Pedra"))
//             && (jogador2.getJogada().equals("Tesoura") || jogador2.getJogada().equals("Pedra"))) {

//         System.out.println("Jogador " + jogador3.getNome() + " Ganhou");

//     } else if (jogador3.getJogada().equals("Tesoura")
//             && (jogador1.getJogada().equals("Papel") || jogador1.getJogada().equals("Lagarto"))
//             && (jogador2.getJogada().equals("Papel") || jogador2.getJogada().equals("Lagarto"))) {

//         System.out.println("Jogador " + jogador3.getNome() + " Ganhou");

//     } else if (jogador3.getJogada().equals("Papel")
//             && (jogador1.getJogada().equals("Pedra") || jogador1.getJogada().equals("Spock"))
//             && (jogador2.getJogada().equals("Pedra") || jogador2.getJogada().equals("Spock"))) {

//         System.out.println("Jogador " + jogador3.getNome() + " Ganhou");

//     }

//     return resultado;

// }