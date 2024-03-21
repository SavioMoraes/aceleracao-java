public class ForIn {
    public static void main(String[] args) {
        String[] nomes = new String[] {"Thor", "Vera", "Noah", "Lucas"};

        for (String nome : nomes) {
            imprimeMensagem(nome);
        }
    }

    static void imprimeMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
