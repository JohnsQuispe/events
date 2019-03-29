package br.com.johnsquispe.events.dao.impl;

import br.com.johnsquispe.events.dao.ParticipantDAO;
import br.com.johnsquispe.events.dao.impl.query.ParticipantQuery;
import br.com.johnsquispe.events.vo.ParticipantVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ParticipantDAOImpl implements ParticipantDAO {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void save(ParticipantVO participantVO) {

        MapSqlParameterSource namedParameters = new MapSqlParameterSource();

        namedParameters.addValue("cpf", participantVO.getCpf());
        namedParameters.addValue("gender", participantVO.getGender());
        namedParameters.addValue("name", participantVO.getName());
        namedParameters.addValue("email", participantVO.getEmail());
        namedParameters.addValue("password", participantVO.getPassword());

        namedParameterJdbcTemplate.update(ParticipantQuery.INSERT_PARTICIPANT.toString(), namedParameters);

    }

}
