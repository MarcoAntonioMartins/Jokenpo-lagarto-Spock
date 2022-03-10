package auctus.jokenpo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import auctus.jokenpo.Entidade.Partida;

public interface PartidasRepository extends JpaRepository<Partida, Long> {

}