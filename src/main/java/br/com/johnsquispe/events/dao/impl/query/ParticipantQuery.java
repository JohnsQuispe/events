package br.com.johnsquispe.events.dao.impl.query;

public class ParticipantQuery {

    public static StringBuilder INSERT_PARTICIPANT = new StringBuilder()
            .append("INSERT INTO ")
            .append(             "PARTICIPANTS ")
            .append("VALUES ")
            .append(        "(NEXTVAL('PARTICIPANT_SEQUENCE'), :cpf, :gender, :name, :email, :password); ");

}
