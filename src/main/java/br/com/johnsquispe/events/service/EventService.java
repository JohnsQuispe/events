package br.com.johnsquispe.events.service;

import br.com.johnsquispe.events.dao.ParticipantDAO;
import br.com.johnsquispe.events.vo.FiltroParticipantVO;
import br.com.johnsquispe.events.vo.ParticipantVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @Autowired
    ParticipantDAO participantDAO;

    public void save(FiltroParticipantVO filtroParticipantVO) {

        ParticipantVO participantVO = ParticipantVO.of(filtroParticipantVO);

        participantDAO.save(participantVO);

    }

}
