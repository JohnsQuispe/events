package br.com.johnsquispe.events.vo;

public class FiltroParticipantVO {

    private String id;
    private String email;
    private String password;
    private String repassowrd;
    private String name;
    private String cpf;
    private String gender;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRepassowrd(String repassowrd) {
        this.repassowrd = repassowrd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRepassowrd() {
        return repassowrd;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getGender() {
        return gender;
    }
}
