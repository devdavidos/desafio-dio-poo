import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso de Java Orientado a Objeto!");
        curso1.setDescricao("Curso básico de Java POO.");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso de JavaScript Avançado.");
        curso2.setDescricao("Melhores partes do javaScript");
        curso2.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Start UNI GFT.");
        mentoria.setDescricao("Programa de estágio GFT.");
        mentoria.setData(LocalDate.now());
        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        */
        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDavid = new Dev();
        devDavid.setNome("David");
        devDavid.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devDavid.getConteudosInscritos());
        devDavid.progredir();
        System.out.println("Conteúdos Concluidos" + devDavid.getConteudosConcluidos());
        System.out.println("\nXP: " + devDavid.calcularTotalXp());

        System.out.println("--------------------------------");

        Dev devJaqueline = new Dev();
        devJaqueline.setNome("João");
        devJaqueline.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devJaqueline.getConteudosInscritos());
        devJaqueline.progredir();
        System.out.println("Conteúdos Concluidos" + devDavid.getConteudosConcluidos());
        System.out.println("\nXP: " + devDavid.calcularTotalXp());
    }
}
