import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descircao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Apex");
        curso2.setDescricao("descrição curso Apex");
        curso2.setCargaHoraria(200);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria Java");
        mentoria1.setDescricao("descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dev");
        bootcamp.setDescricao("Descrição Bootcamp Java Dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devVinicius = new Dev();
        devVinicius.setNome("Vinícius");
        devVinicius.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devVinicius.getConteudoInscritos());
        devVinicius.progredir();
        System.out.println("Conteúdos Inscritos" + devVinicius.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos" + devVinicius.getConteudoConcluidos());
        System.out.println("XP: " + devVinicius.calcularTotalXp());
        
        System.out.println("---------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devJoao.getConteudoInscritos());
        devJoao.progredir();
        System.out.println("Conteúdos Inscritos" + devJoao.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos" + devJoao.getConteudoConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}
