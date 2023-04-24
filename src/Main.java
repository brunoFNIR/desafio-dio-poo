import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JS");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria js");
        mentoria2.setDescricao("descrição mentoria js");
        mentoria2.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bc1");
        bootcamp.setDescricao("Descrição Bc1");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);


        Dev devBruno = new Dev();
        devBruno.setNome("Bruno");
        devBruno.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devBruno.getConteudosInscritos());
        devBruno.progredir();
        devBruno.progredir();
        System.out.println("Conteudos Inscritos: " + devBruno.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devBruno.getConteudosConcluidos());
        System.out.println("XP: " + devBruno.calcularTotalXp());

        System.out.println();


        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteudos Inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());




    }
}
