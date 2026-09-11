package classes;

public abstract class Animal implements interfaces.Animal {
    private int id;
    private String tipo;
    private String raca;
    private String nome;
    private int idade;
    private String status;

    public Animal(int id, String tipo, String raca, String nome, int idade, String status) {
        this.id = id;
        this.tipo = tipo;
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String coletarProduto() {
        return "";
    }

    @Override
    public String emitirSom() {
        return "";
    }

    @Override
    public String toString() {
        return  "[ID: " + id + "] " + nome + " (" + tipo + ')' +
                "\n - Raca: " + raca +
                "\n - Idade: " + idade + " anos | Status: " + status +
                "\n - Som: " + emitirSom();
    }

}
