package br.com.johnsquispe.events.dao.impl;

import br.com.johnsquispe.events.dao.IDAO;
import br.com.johnsquispe.events.domain.Participant;
import br.com.johnsquispe.events.repository.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipantDAO implements IDAO<Participant> {

    @Autowired
    private ParticipantRepository participantRepository;

    @Override
    public void create(Participant participant) {

        participantRepository.save(participant);

    }

    @Override
    public List<Participant> retrieve() {
        return null;
    }

    @Override
    public void update(Participant participant) {

    }

    @Override
    public void delete(Participant participant) {

    }
}
