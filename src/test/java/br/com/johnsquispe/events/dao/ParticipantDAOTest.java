package br.com.johnsquispe.events.dao;

import br.com.johnsquispe.events.domain.Participant;
import br.com.johnsquispe.events.repository.ParticipantRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class ParticipantDAOTest {

    @Autowired
    private ParticipantRepository participantRepository;

    @Test
    public void testeSalvaParticipante() throws Exception {

       // participantDAO.create(new Participant());
        participantRepository.save(new Participant());

    }



}
