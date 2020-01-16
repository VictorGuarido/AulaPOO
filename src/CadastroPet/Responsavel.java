package CadastroPet;

public class Responsavel {

    private String nome;
    private String sobrenome;
    private String cep;
    private String numeroResidencial;
    private int idade;
    private String email;
    private String telefone;

    //sets e gets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getNumeroResidencial() {
        return numeroResidencial;
    }
    public void setNumeroResidencial(String numeroResidencial) {
        this.numeroResidencial = numeroResidencial;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Responsavel(String nome, String sobrenome, String cep, String numeroResidencial, int idade, String email, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cep = cep;
        this.numeroResidencial = numeroResidencial;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }

    public void retornarDadosBasicos(){
        if(nome == "Victor"){
            System.out.println("Esse é o Cara!!");
        }
        System.out.println("Nome: " + nome + "\nE-mail: " + email);
    }

    public String retornarTodosDados() { // toString
        return "Responsavel{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cep='" + cep + '\'' +
                ", numeroResidencial='" + numeroResidencial + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    public boolean verificarMaiorIdade(int idade){

        if(idade >= 18){
            return true;
        }
        else {
            return false;
        }
    }
}
