package auctus.jokenpo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import auctus.jokenpo.Entidade.Jogador;
import auctus.jokenpo.repository.JogadorRepository;

@RestController
public class JogadorController {

    @Autowired
    private JogadorRepository jogadorRepository;

    // ⇊⇊⇊⇊ JOGADOR ⇊⇊⇊⇊

    // CADASTRAR SEM ID
    @PostMapping("/cadastrar")
    ResponseEntity<Object> cadastrar(@RequestBody Jogador jogador) {

        if (jogador.getNome() != null && !jogador.getNome().isEmpty() && jogador.getJogada() != ""
                && (jogador.getJogada().equals("Spock") || jogador.getJogada().equals("Lagarto")
                        || jogador.getJogada().equals("Pedra") || jogador.getJogada().equals("Papel")
                        || jogador.getJogada().equals("Tesoura"))) {
            jogadorRepository.save(jogador);
            return ResponseEntity.ok().build();
        } else {
            System.out.println("Dados de incorretos");
            return ResponseEntity.badRequest().build();
        }

    }

    // ALTERAR COMPLETO
    @PutMapping("/editar")
    ResponseEntity<Object> editar(@RequestBody Jogador jogador) {
        if (jogadorRepository.existsById(jogador.getId())) {
            jogadorRepository.save(jogador);
            return ResponseEntity.ok().build();
        } else {
            System.out.println("Cadastro não encontrado");
            return ResponseEntity.badRequest().build();
        }
    }

    // REMOVER COM O ID
    @DeleteMapping("/remover")
    ResponseEntity<Object> remover(@RequestBody Jogador jogador) {
        if (jogadorRepository.existsById(jogador.getId())) {
            jogadorRepository.delete(jogador);
            return ResponseEntity.ok().build();
        } else {
            System.out.println("Cadastro não encontrado");
            return ResponseEntity.badRequest().build();
        }
    }

    // LISTAR UM CADASTRO
    @GetMapping("/encontrar_cadastro")
    public boolean resultado_unico(@RequestBody Jogador jogador) {

        return jogadorRepository.existsById(jogador.getId());

    }

    // LISTAR TODOS OS CADASTROS
    @GetMapping("/cadastros")
    public List<Jogador> resultado() {

        List<Jogador> Jogador = jogadorRepository.findAll();
        return Jogador;

    }

}
