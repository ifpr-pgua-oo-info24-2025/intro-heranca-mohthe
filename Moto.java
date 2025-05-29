public class Moto extends Veiculo {
    protected String tipoGuidao;

    public String getTipoGuidao() {
        return tipoGuidao;
    }

    public void setTipoGuidao(String tipoGuidao) {
        this.tipoGuidao = tipoGuidao;
    }

    public String exibirDetalhes(){
        return "Marca: " + this.marca +
                "\nModelo: " + this.modelo +
                "\nAno: " + this.ano +
                "\nTipo de guidao: " + this.tipoGuidao;
    }
}
