
package poo.uem.modelo;

import java.util.Date;

/**
 *
 * @author José Seie
 */

public class Candidato {
    
    private int numeroDoCandidato;
    private String nome;
    private String email;
    private char sexo;
    private Date dataDeNascimento;
    private String morada;
    private String curso;
    private String regime;
    private boolean statusRemovido;

    public Candidato() {
    }

    public Candidato(int numeroDoCandidato, String nome, String email, char sexo, Date dataDeNascimento, String morada, String curso, String regime, boolean statusRemovido) {
        this.numeroDoCandidato = numeroDoCandidato;
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
        this.morada = morada;
        this.curso = curso;
        this.regime = regime;
        this.statusRemovido = statusRemovido;
    }

    public int getNumeroDoCandidato() {
        return numeroDoCandidato;
    }

    public void setNumeroDoCandidato(int numeroDoCandidato) {
        this.numeroDoCandidato = numeroDoCandidato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }

    public boolean isStatusRemovido() {
        return statusRemovido;
    }

    public void setStatusRemovido(boolean statusRemovido) {
        this.statusRemovido = statusRemovido;
    }

    @Override
    public String toString() {
        return "Candidato{" + "numeroDoCandidato=" + numeroDoCandidato + ", nome=" + nome + ", email=" + email + ", sexo=" + sexo + ", dataDeNascimento=" + dataDeNascimento + ", morada=" + morada + ", curso=" + curso + ", regime=" + regime + ", statusRemovido=" + statusRemovido + '}';
    }

    
    
    
    
    
}
