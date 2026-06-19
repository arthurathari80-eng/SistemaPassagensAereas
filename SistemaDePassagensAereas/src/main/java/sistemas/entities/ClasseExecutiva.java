package sistemas.entities;

public class ClasseExecutiva extends Passagem {
    private boolean servicoBordoVip = true;
    private boolean acessoSalaVip = true;

    public ClasseExecutiva(String nomePassageiro, String numeroVoo,double precoOriginal){
        super(nomePassageiro,numeroVoo,precoOriginal);
    }
    public double calcularPrecoFinal(){
        return (getPrecoOriginal()*1.5);
    }
    public String toString(){
        return ("Nome: "+getNomePassageiro()+
                "Numero do Voo: "+getNumeroVoo()+
                "Tipo de Assento: Executiva"+
                servicoBordoVip+acessoSalaVip+
                "Valor total: "+calcularPrecoFinal());
    }
}
