import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso("Java Básico", "Iniciando no Java", 20);

        Curso cursoSQL = new Curso("SQL Database", "Banco de Dados Relacionais", 10);

        Mentoria mentoriaJavaAvancado = new Mentoria("Java Avançado", "Avançando em Java");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Spread");
        bootcamp.setDescricao("Bootcamp Java Developer na plataforma DIO");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoSQL);
        bootcamp.getConteudos().add(mentoriaJavaAvancado);

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);

        System.out.println("\nConteúdos Inscritos do João:\n" + devJoao.getConteudosInscritos());
        System.out.println("\nConteúdos Inscritos da Maria:\n" + devMaria.getConteudosInscritos());

        devJoao.progredir();
        devMaria.progredir();

        System.out.println("Conteúdos Inscritos do João: " + devJoao.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos da Maria" + devMaria.getConteudosConcluidos());

        System.out.println("Conteúdos Inscritos do João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos da Maria" + devMaria.getConteudosInscritos());

        System.out.println("XP do João: " + devJoao.calcularTotalXp());
        System.out.println("XP da Maria: " + devMaria.calcularTotalXp());

        System.out.println("Maria dá mais uma passo no Bootcamp...");
        devMaria.progredir();

        System.out.println("XP do João: " + devJoao.calcularTotalXp());
        System.out.println("XP da Maria: " + devMaria.calcularTotalXp());

    }
}
