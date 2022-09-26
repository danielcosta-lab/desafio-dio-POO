import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
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


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        
    }
}
