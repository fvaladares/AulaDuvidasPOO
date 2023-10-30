import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        Funcionario funcionario2;
        int matricula;
        String nome;
        double salario;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cadastro de funcionário");
        System.out.print("Nome: ");
        nome = entrada.next();
        System.out.println();
        System.out.print("Matrícula: ");
        matricula = entrada.nextInt();
        System.out.println();
        System.out.print("Salário: ");
        salario = entrada.nextDouble();
        System.out.println();

        funcionario.setMatricula(matricula);
        funcionario.setNome(nome);
        funcionario.setSalario(salario);

        funcionario2 = new Funcionario(
                nome,
                matricula,
                salario);

        System.out.printf("Funcionario 1: nome: %1$s Matrícula: %2$s",
                funcionario.getNome(),
                funcionario.getMatricula());

        System.out.println("\n");

        System.out.printf("Funcionario 2: nome: %1$s Matrícula: %2$s",
                funcionario2.getNome(),
                funcionario2.getMatricula());

        System.out.println("\n");

        System.out.println(funcionario2);
    }
}