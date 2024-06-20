import edu.victor.designpatterns.builder.Animal;
import edu.victor.designpatterns.builder.Pessoa;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa_1 = new Pessoa.PessoaBuilder()
                .nome("Victor")
                .sobreNome("Monterisi")
                .documento("cnh")
                .email("victor@email.com.br")
                .apelido("Vic")
                .dataNascimento(LocalDate.of(1989,10,01))
                .build();

        StringBuilder sb = new StringBuilder().append("Primeiro registro: " ).append(pessoa_1);
        System.out.println(sb);

        Animal dog = Animal.builder()
                .nome("Crully")
                .raca("Staffy")
                .dono("Victor")
                .build();

        System.out.println(dog);
    }
}