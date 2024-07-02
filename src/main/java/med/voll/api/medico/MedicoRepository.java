package med.voll.api.medico;

import org.springframework.data.jpa.repository.JpaRepository;
//herda o CRUD do JpaRepository
public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
