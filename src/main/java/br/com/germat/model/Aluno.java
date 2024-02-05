package br.com.germat.model;

import br.com.germat.Enums.Curso;
import br.com.germat.Enums.Status;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "curso")
    @Enumerated(EnumType.STRING)
    private Curso curso;
    @Column(name= "matricula")
    private String Matricula;
    @Column(name= "status")
    @Enumerated(EnumType.STRING)
    private Status status;
    @Column(name = "turno")
    private String turno;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}