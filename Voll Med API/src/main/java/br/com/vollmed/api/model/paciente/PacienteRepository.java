package br.com.vollmed.api.model.paciente;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PacienteRepository extends JpaRepository<PacienteEntity, Long> {
    Page<PacienteEntity> findAllByAtivoTrue(Pageable paginacao);
}
