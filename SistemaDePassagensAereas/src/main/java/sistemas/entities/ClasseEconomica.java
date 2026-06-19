package sistemas.entities;

public class ClasseEconomica extends Passagem{
    private boolean despacharMala;
    private double taxaBagagem = 120.00;

    public ClasseEconomica(String nomePassageiro, String numeroVoo,double precoOriginal,boolean despacharMala){
        super(nomePassageiro,numeroVoo,precoOriginal);
        this.despacharMala = despacharMala;

    }

    public boolean isDespacharMala() {
        return despacharMala;
    }

    public void setDespacharMala(boolean despacharMala) {
        this.despacharMala = despacharMala;
    }
    public double calcularPrecoFinal(){
        if (despacharMala = true){
            return (getPrecoOriginal()+taxaBagagem);
        } else if (despacharMala = false) {
            return getPrecoOriginal();
        }
        return calcularPrecoFinal();
    }
    public String toString(){
        return ("Nome: "+getNomePassageiro()+
                "Número do Voo: "+getNumeroVoo()+
                "Tipo de assento: Econômico "+
                "Valor Total: "+calcularPrecoFinal());

    }
}
