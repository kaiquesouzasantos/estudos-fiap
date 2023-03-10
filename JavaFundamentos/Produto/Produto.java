package Produto;

public class Produto {
    String nome, descricao;
    float valor;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString(){
        return "Produto [NOME: "+nome+" | DESCRIÇÂO: "+descricao+" | VALOR: "+valor+" ]";
    }
}
