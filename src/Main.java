import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso = new Curso();
		curso.setTitulo("Java");
		curso.setDescricao("Curso Java");
		curso.setCargaHoraria(8);
		
		Curso curso1 = new Curso();
		curso1.setTitulo("C#");
		curso1.setDescricao("Curso C#");
		curso1.setCargaHoraria(8);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Java");
		mentoria.setDescricao("Mentoria Java");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso);
		System.out.println(curso1);
		
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição: Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev1 = new Dev();
		dev1.setNome("Jony");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos: " + dev1.getConteudosInscritos());
		dev1.progredir();
		dev1.progredir();
		System.out.println("Conteúdos Inscritos: " + dev1.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos: " + dev1.getConteudosConcluidos());
		System.out.println("XP: " + dev1.calcularTotalXp());

		
		System.out.println("");
		
		Dev dev2 = new Dev();
		dev2.setNome("Beathriz");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos: " + dev2.getConteudosInscritos());
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		System.out.println("Conteúdos Inscritos: " + dev2.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos: " + dev2.getConteudosConcluidos());
		System.out.println("XP: " + dev2.calcularTotalXp());

	}

}
