package termometro.api.colaborador;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Colaborador, Long> {
}
