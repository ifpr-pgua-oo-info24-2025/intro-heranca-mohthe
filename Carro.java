public class Carro extends Veiculo {
    protected Integer numPortas;

    
    public Integer getNumPortas() {
        return numPortas;
    }
    
    public void setNumPortas(Integer numPortas) {
        this.numPortas = numPortas;
    }
    
    public String exibirDetalhes(){
        return "Marca: " + this.marca +
                "\nModelo: " + this.modelo +
                "\nAno: " + this.ano +
                "\nNumero de placas: " + this.numPortas;
    }
}
