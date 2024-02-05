package br.com.germat.dao;

import br.com.germat.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoDao extends JpaRepository<Aluno, Integer> {
}
