import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso(); // a partir da palavra new é instanciada o objeto
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Iniciante em Programação Java");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso(); // a partir da palavra new é instanciada o objeto
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Iniciante em Programação Javascript");
        curso2.setCargaHoraria(20);

        Mentoria mentoria = new Mentoria ();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Evoluindo com Java");
        mentoria.setData(LocalDate.now());


        /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Iniciando Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDaniel = new Dev();
        devDaniel.setNome("Daniel");
        devDaniel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos:" + devDaniel.getConteudosInscritos());
        devDaniel.progredir();
        devDaniel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos:" + devDaniel.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:" + devDaniel.getConteudosConcluidos());
        System.out.println("XP:" + devDaniel.calcularTotalXp());



    }
}
