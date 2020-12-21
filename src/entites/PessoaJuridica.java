package entites;

public class PessoaJuridica extends Contribuinte{

    private Integer numFuncionarios;

    public PessoaJuridica(String nome, Double rendimentoAnual, Integer numFuncionarios) {
        super(nome, rendimentoAnual);
        this.numFuncionarios = numFuncionarios;
    }


    @Override
    public Double taxa() {
        if(numFuncionarios > 10){
            return getRendimentoAnual() * 0.14;
        }else {
            return getRendimentoAnual() * 0.16;
        }
    }
}
