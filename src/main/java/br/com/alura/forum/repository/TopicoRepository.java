package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	//JPA Mapeia o relacionamento de topico com curso, buscando o atributo nome de Curso
	List<Topico> findByCursoNome(String nomeCurso);
	
	//Se caso tenha em topico o atributo com o mesmo nome da entidade e o nome colocamos _ entre a entidades
	//List<Topico> findByCurso_Nome(String nomeCurso);
	
	//Se caso queira não usar o conveção do spring data pode fazer uma query
	//@Query("SELECT t From Topico t WHERE t.curso.nome = :nomeCurso")
	//List<Topico> carregarPorNomeDoCurso(@Param("nomeCurso") String nomeCurso);

}
