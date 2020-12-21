package entites;

public class PessoaFisica extends Contribuinte {
    private Double gastosSaude;

    public PessoaFisica(String nome, Double rendimentoAnual, Double gastosSaude) {
        super(nome, rendimentoAnual);
        this.gastosSaude = gastosSaude;
    }


    @Override
    public Double taxa() {
        if (getRendimentoAnual() < 20000.00){
            return (getRendimentoAnual() * 0.15) - (gastosSaude * 0.50);
        }else {
            return (getRendimentoAnual() * 0.25) - (gastosSaude * 0.50);
        }
    }
}
