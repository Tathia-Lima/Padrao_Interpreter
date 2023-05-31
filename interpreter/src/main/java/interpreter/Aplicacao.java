package interpreter;

public class Aplicacao {
    private double valorAplicado;
    private double taxaJuros;
    private double tempo;

    public double getValorAplicado() {
        return valorAplicado;
    }

    public void setValorAplicado(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public double calcularRendimento() {
        return (double) Rendimento.calcularRendimento(valorAplicado, taxaJuros, tempo);
    }
}