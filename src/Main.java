import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("JAVA", "Curso básico de Java", 40f);
        System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria("Mentoria Java POO", "Entendendo POO", LocalDate.now());
        System.out.println(mentoria1);
    }
}
