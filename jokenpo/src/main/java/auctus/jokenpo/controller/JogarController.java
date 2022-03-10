package auctus.jokenpo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import auctus.jokenpo.Entidade.Partida;
import auctus.jokenpo.Entidade.Jogador;
import auctus.jokenpo.repository.JogadorRepository;
import auctus.jokenpo.repository.PartidasRepository;

@RestController
public class JogarController {

    @Autowired
    private PartidasRepository partidasRepository;

    @Autowired
    private JogadorRepository jogadorRepository;

    // ⇊⇊⇊⇊ PARTIDA ⇊⇊⇊⇊

    @GetMapping("/jogar")
    public ResponseEntity<Object> jogar(@RequestBody List<Jogador> jogador) {

        if (jogador.size() == 3 && jogadorRepository.existsById(jogador.get(0).getId())
                && jogadorRepository.existsById(jogador.get(1).getId())
                && jogadorRepository.existsById(jogador.get(2).getId())) {

            Jogador jogador1 = jogadorRepository.getById(jogador.get(0).getId());
            Jogador jogador2 = jogadorRepository.getById(jogador.get(1).getId());
            Jogador jogador3 = jogadorRepository.getById(jogador.get(2).getId());

            String resultado = jogar_partida_classica(jogador1, jogador2, jogador3);
            System.out.println(resultado);
            return ResponseEntity.ok().build();

        } else {
            System.out.println("Numero de jogadores incorretos");
            return ResponseEntity.badRequest().build();
        }

    }

    @GetMapping("/jogar_classico")
    public ResponseEntity<Object> jogar_classico(@RequestBody List<Jogador> jogador) {

        if (jogador.size() == 2 && jogadorRepository.existsById(jogador.get(0).getId())
                && jogadorRepository.existsById(jogador.get(1).getId())) {

            Jogador jogador1 = jogadorRepository.getById(jogador.get(0).getId());
            Jogador jogador2 = jogadorRepository.getById(jogador.get(1).getId());

            String resultado = jogar_partida_2_jogadores(jogador1, jogador2);
            System.out.println(resultado);
            return ResponseEntity.ok().build();
            
        } else {
            System.out.println("Dados de incorretos");
            return ResponseEntity.badRequest().build();
        }

    }

    // RESULTADO DE TODAS AS PARTIDAS
    @GetMapping("/resultado")
    public List<Partida> resultado() {

        List<Partida> partidas = partidasRepository.findAll();
        return partidas;

    }

    // RESULTADO DE UMA PARTIDA
    @GetMapping("/resultado_unico")
    String resultado_unico(@RequestBody Partida partida) {

        Partida resultado = partidasRepository.getById(partida.getId());

        return resultado.getDescricao()+","+resultado.getResultado();

    }

    // ⇊⇊⇊⇊ JOGO ⇊⇊⇊⇊

    private String jogar_partida_2_jogadores(Jogador jogador1, Jogador jogador2) {

        String resultado = "Empate";

        if (!jogador1.getJogada().equals(jogador2.getJogada())) {

            if (jogador1.getJogada().equals("Pedra")
                    && (jogador2.getJogada().equals("Tesoura") || jogador2.getJogada().equals("Lagarto"))) {
                resultado = "jogador 1 ganhou";
            } else if (jogador1.getJogada().equals("Papel")
                    && (jogador2.getJogada().equals("Pedra") || jogador2.getJogada().equals("Spock"))) {
                resultado = "jogador 1 ganhou";
            } else if (jogador1.getJogada().equals("Tesoura")
                    && (jogador2.getJogada().equals("Papel") || jogador2.getJogada().equals("Lagarto"))) {
                resultado = "jogador 1 ganhou";
            } else if (jogador1.getJogada().equals("Lagarto")
                    && (jogador2.getJogada().equals("Spock") || jogador2.getJogada().equals("Papel"))) {
                resultado = "jogador 1 ganhou";
            } else if (jogador1.getJogada().equals("Spock")
                    && (jogador2.getJogada().equals("Tesoura") || jogador2.getJogada().equals("Pedra"))) {
                resultado = "jogador 1 ganhou";
            } else {
                resultado = "jogador 2 ganhou";
            }

        }
        return resultado;
    }

    private String jogar_partida_classica(Jogador jogador1, Jogador jogador2, Jogador jogador3) {

        String ganhador = "Empate";

        if (!(jogador1.getJogada().equals(jogador2.getJogada()) && jogador1.getJogada().equals(jogador3.getJogada()))) {

            // EMPATE TRINGULO

            if (!(jogador1.getJogada().equals(jogador2.getJogada())
                    || jogador1.getJogada().equals(jogador3.getJogada())
                    || jogador3.getJogada().equals(jogador2.getJogada()))) {

                ganhador = "Empate entre todos od jogadores ";

            }

            // EMPATES JOGADOR 1 E JOGADOR 2
            else if (jogador1.getJogada().equals("Pedra")
                    && jogador2.getJogada().equals("Pedra")
                    && jogador3.getJogada().equals("Tesoura")) {

                ganhador = "Empate entre os jogadores " + jogador1.getNome() + " e " + jogador2.getNome();

            } else if (jogador1.getJogada().equals("Tesoura")
                    && jogador2.getJogada().equals("Tesoura")
                    && jogador3.getJogada().equals("Papel")) {

                ganhador = "Empate entre os jogadores " + jogador1.getNome() + " e " + jogador2.getNome();

            } else if (jogador1.getJogada().equals("Papel")
                    && jogador2.getJogada().equals("Papel")
                    && jogador3.getJogada().equals("Pedra")) {

                ganhador = "Empate entre os jogadores " + jogador1.getNome() + " e " + jogador2.getNome();

            }

            // EMPATES JOGADOR 1 E JOGADOR 3

            if (jogador1.getJogada().equals("Pedra")
                    && jogador3.getJogada().equals("Pedra")
                    && jogador2.getJogada().equals("Tesoura")) {

                ganhador = "Empate entre os jogadores " + jogador1.getNome() + " e " + jogador3.getNome();

            } else if (jogador1.getJogada().equals("Tesoura")
                    && jogador3.getJogada().equals("Tesoura")
                    && jogador2.getJogada().equals("Papel")) {

                ganhador = "Empate entre os jogadores " + jogador1.getNome() + " e " + jogador3.getNome();

            } else if (jogador1.getJogada().equals("Papel")
                    && jogador3.getJogada().equals("Papel")
                    && jogador2.getJogada().equals("Pedra")) {

                ganhador = "Empate entre os jogadores " + jogador1.getNome() + " e " + jogador3.getNome();

            }

            // EMPATES JOGADOR 2 E JOGADOR 3

            if (jogador2.getJogada().equals("Pedra")
                    && jogador3.getJogada().equals("Pedra")
                    && jogador1.getJogada().equals("Tesoura")) {

                ganhador = "Empate entre os jogadores " + jogador2.getNome() + " e " + jogador3.getNome();

            } else if (jogador2.getJogada().equals("Tesoura")
                    && jogador3.getJogada().equals("Tesoura")
                    && jogador1.getJogada().equals("Papel")) {

                ganhador = "Empate entre os jogadores " + jogador2.getNome() + " e " + jogador3.getNome();

            } else if (jogador2.getJogada().equals("Papel")
                    && jogador3.getJogada().equals("Papel")
                    && jogador1.getJogada().equals("Pedra")) {

                ganhador = "Empate entre os jogadores " + jogador2.getNome() + " e " + jogador3.getNome();

            }

            // JOGADOR 1 GANHA
            else if (jogador1.getJogada().equals("Pedra")
                    && jogador2.getJogada().equals("Tesoura")
                    && jogador3.getJogada().equals("Tesoura")) {

                ganhador = "Ganhador : " + jogador1.getNome();

            } else if (jogador1.getJogada().equals("Papel")
                    && jogador2.getJogada().equals("Pedra")
                    && jogador3.getJogada().equals("Pedra")) {

                ganhador = "Ganhador : " + jogador1.getNome();

            } else if (jogador1.getJogada().equals("Tesoura")
                    && jogador2.getJogada().equals("Papel")
                    && jogador3.getJogada().equals("Papel")) {

                ganhador = "Ganhador : " + jogador1.getNome();

            }

            // JOGADOR 2 GANHA
            if (jogador2.getJogada().equals("Pedra")
                    && jogador1.getJogada().equals("Tesoura")
                    && jogador3.getJogada().equals("Tesoura")) {

                ganhador = "Ganhador : " + jogador2.getNome();

            } else if (jogador2.getJogada().equals("Papel")
                    && jogador1.getJogada().equals("Pedra")
                    && jogador3.getJogada().equals("Pedra")) {

                ganhador = "Ganhador : " + jogador2.getNome();

            } else if (jogador2.getJogada().equals("Tesoura")
                    && jogador1.getJogada().equals("Papel")
                    && jogador3.getJogada().equals("Papel")) {

                ganhador = "Ganhador : " + jogador2.getNome();

            }

            // JOGADOR 3 GANHA
            if (jogador3.getJogada().equals("Pedra")
                    && jogador2.getJogada().equals("Tesoura")
                    && jogador1.getJogada().equals("Tesoura")) {

                ganhador = "Ganhador : " + jogador3.getNome();

            } else if (jogador3.getJogada().equals("Papel")
                    && jogador2.getJogada().equals("Pedra")
                    && jogador1.getJogada().equals("Pedra")) {

                ganhador = "Ganhador : " + jogador3.getNome();

            } else if (jogador3.getJogada().equals("Tesoura")
                    && jogador2.getJogada().equals("Papel")
                    && jogador1.getJogada().equals("Papel")) {

                ganhador = "Ganhador : " + jogador3.getNome();

            }

        }

        Partida partida = new Partida();
        partida.setDescricao(jogador1.getNome() + " usou " + jogador1.getJogada() + ", "
                + jogador2.getNome() + " usou " + jogador2.getJogada() + ", "
                + jogador3.getNome() + " usou " + jogador3.getJogada());
        partida.setResultado(ganhador);

        partidasRepository.save(partida);

        return ganhador;
    }

}