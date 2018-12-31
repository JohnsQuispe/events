package br.com.johnsquispe.events.repository;

import br.com.johnsquispe.events.domain.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {



}
