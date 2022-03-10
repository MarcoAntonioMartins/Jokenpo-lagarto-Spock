package auctus.jokenpo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import auctus.jokenpo.Entidade.Jogador;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {

}