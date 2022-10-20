public class secao10 {

  public static void main(String[] args) throws Exception {
    /*
     * TIPOS REFERÊNCIA VS. TIPOS VALOR
     *
     * CLASSES SÃO TIPOS REFERÊNCIA
     * Variáveis cujo tipo são classes não devem ser entendidas como caixas,
     * mas sim "TENTÁCULOS" (ponteiros) para caixas.
     * 
     * EXEMPLO:
     * 
     * Product p1, p2;
     * p1 = new Product("TV", 900.00, 0);
     * p2 = p1;
     * 
     * Neste caso acima P2 passa a apontar para onde P1 aponta.
     * 
     * ========================================================================
     * 
     * VALOR "NULL"
     * Tipos referência aceitam o valor NULL, que indica que a variável aponta
     * pra ninguém.
     * 
     * EXEMPLO:
     * 
     * Product p1, p2;
     * p1 = new Product("TV", 900.00, 0);
     * p2 = null;
     * 
     * ========================================================================
     * 
     * TIPOS PRIMITIVOS SÃO TIPOS VALOR
     * Em JAVA, tipos primitivos são tipos valor. Tipos valor são CAIXAS e não
     * ponteiros.
     * 
     * EXEMPLO:
     * 
     * double x, y;
     * x = 10;
     * y = x;
     * 
     * Neste caso acima y recebe uma CÓPIA de x.
     * 
     * ========================================================================
     * 
     * TIPOS PRIMITIVOS E INICIALIZAÇÃO
     * DEMO
     * 
     * int p;
     * System.out.println(p); //erro: variável não iniciada
     * 
     * p = 10;
     * System.out.println(p); //variável iniciada
     * 
     * ========================================================================
     * 
     * VALORES PADRÃO
     * Quando alocamos (new) qualquer tipo estruturado (classe ou array), são
     * atribuídos valores padrão aos seus elementos.
     * números: 0
     * boolean: false
     * char: caractere código
     * objeto: null
     * 
     * EXEMPLO:
     * 
     * Product p = new Product();
     * p ==> name = null, price = 0.0, quantity = 0
     * 
     * ========================================================================
     * 
     * DESALOCAÇÃO DE MEMÓRIA - GARBAGE COLLECTOR E ESCOPO LOCAL
     * 
     * GARBAGE COLLECTOR
     * É um processo que automatiza o gerenciamento de memória de um programa em
     * execução.
     * O garbage collector monitora os objetos alocados dinamicamente pelo
     * programa (no heap), desalocando aqueles que não estão mais sendo utilizados.
     * 
     * RESUMO
     * Objetos alocados dinamicamente, quando não possuem mais referência para
     * eles, serão desalocados pelo garbage collector.
     * 
     * Variáveis locais são desalocados imediatamente assim que seu escopo local
     * sai de execução.
     * 
     * ========================================================================
     * 
     * VETORES
     * Em programação, "vetor" é o nome dado a arranjos unidimensionais.
     * 
     * Arranjo (array) é uma estrutura de dados:
     * Homogênia (dados do mesmo tipo).
     * Ordenada (elementos acessados por meio de posições).
     * Alocada de uma vez só, em um bloco contínuo de memória.
     * 
     * Vantagens
     * Acesso imediato aos elementos pela sua posição.
     * 
     * Desvantagens
     * Tamanho fixo.
     * Dificuldade para se realizar inserções e deleções.
     */
  }
}
