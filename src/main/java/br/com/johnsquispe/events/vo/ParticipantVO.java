package br.com.johnsquispe.events.vo;

import br.com.johnsquispe.events.util.DataConveter;
import lombok.Getter;

@Getter
public class ParticipantVO {

    private String email;
    private String password;
    private String repassword;
    private String name;
    private String cpf;
    private String gender;
    private int id;

    public ParticipantVO(String email, String password, String repassword, String name, String cpf, String gender, int id) {
        this.email = email;
        this.password = password;
        this.repassword = repassword;
        this.name = name;
        this.cpf = cpf;
        this.gender = gender;
        this.id = id;
    }

    public static ParticipantVO of (FiltroParticipantVO filtroParticipantVO) {

        ParticipantVO participantVO = new ParticipantVO(
                filtroParticipantVO.getEmail(),
                filtroParticipantVO.getPassword(),
                filtroParticipantVO.getRepassowrd(),
                filtroParticipantVO.getName(),
                filtroParticipantVO.getCpf(),
                filtroParticipantVO.getGender(),
                DataConveter.toInt(filtroParticipantVO.getId())
        );

        return participantVO;

    }

}

       