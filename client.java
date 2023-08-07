//"criar a class" 

public class cliente {
    private String nome;
    private String cpf;
//criar um construtor (botão direito 'insert code' depois 'construtor )
    public cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
//"criar get e set dando  retorno nas entidades(botão direito 'insert code' depois 'getter and setter'  "
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
   
}
