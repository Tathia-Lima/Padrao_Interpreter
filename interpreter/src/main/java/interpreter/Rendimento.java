package interpreter;

    public class Rendimento {
        public static String formula = "valorAplicado * 0.01 * tempo + valorAplicado";

        public static double calcularRendimento(double valorAplicado, double taxaJuros, double tempo) {
            String expressao;
            expressao = formula.replace("valorAplicado", Double.toString(valorAplicado));
            expressao = expressao.replace("taxaJuros", Double.toString(taxaJuros));
            expressao = expressao.replace("tempo", Double.toString(tempo));
            InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
            return interpretador.interpretar();
        }
    }
