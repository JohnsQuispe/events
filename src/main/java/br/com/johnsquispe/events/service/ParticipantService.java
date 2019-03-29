package br.com.johnsquispe.events.service;

import br.com.johnsquispe.events.vo.FiltroParticipantVO;
import br.com.johnsquispe.events.vo.ParticipantVO;
import org.springframework.stereotype.Service;

@Service
public class ParticipantService {

    private void save (FiltroParticipantVO filtroParticipantVO) {

        ParticipantVO participantVO = ParticipantVO.of(filtroParticipantVO);

    }

}
