public class PesquisaAtendimentoCliente {
    public static void main(String[] args) {
        String[] opnioesExemplo = {"EXCELENTE", "BOM", "RUIM", "EXCELENTE", "RUIM", "BOM", "EXCELENTE", "BOM", "BOM", "EXCELENTE"};

        int excelenteCount = 0;
        int ruimCount = 0;

        for (int i = 0; i < opnioesExemplo.length; i++) {
            String opiniao = opnioesExemplo[i];

            if (opiniao.equals("EXCELENTE")) {
                excelenteCount++;
            } else if (opiniao.equals("RUIM")) {
                ruimCount++;
            }
        }

        System.out.println("Resultados da pesquisa:");
        System.out.println("Quantidade de respostas EXCELENTES: " + excelenteCount);
        System.out.println("Quantidade de respostas RUINS: " + ruimCount);
    }
}
