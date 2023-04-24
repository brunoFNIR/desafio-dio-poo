import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Conteudo curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("descrição curso java");
        ((Curso) curso1).setCargaHoraria(8);

        Conteudo curso2 = new Curso();
        curso2.setTitulo("JS");
        curso2.setDescricao("descrição curso js");
        ((Curso) curso2).setCargaHoraria(4);

        Conteudo mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("descrição mentoria java");
        ((Mentoria) mentoria1).setData(LocalDate.now());

        Conteudo mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria js");
        mentoria2.setDescricao("descrição mentoria js");
        ((Mentoria) mentoria2).setData(LocalDate.now());

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
