package com.aluno.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aluno.app.model.Aluno;

@Repository
@Transactional
public interface AlunoRepository extends CrudRepository<Aluno, Long>{
	
	@Query("SELECT al FROM Aluno al WHERE al.nome LIKE %?1%")
    List<Aluno> findAlunoByNome(String nome);
}
