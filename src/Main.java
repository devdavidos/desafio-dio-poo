import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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




        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }

}
