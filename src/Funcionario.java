public class Funcionario {
    public Funcionario(String nome,
                       int matricula,
                       double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public Funcionario() {

    }

    // region: Atributos
    private String nome;
    private int matricula;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

// endRegion:Atributos


    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", salario=" + salario +
                '}';
    }
}
