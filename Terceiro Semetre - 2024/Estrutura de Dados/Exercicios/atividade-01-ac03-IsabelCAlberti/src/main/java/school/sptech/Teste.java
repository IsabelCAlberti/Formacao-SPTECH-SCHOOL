package school.sptech;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
     Repositorio repositorio = new Repositorio();

        /*Crie um loop, exibindo o menu:
        0 - Sair
        1- Salvar objeto
        2- Deletar objeto
        3- Exibir
        4- Desfazer*/
        //O loop deve ser executado enquanto o usuário não escolher a opção 0.
        //Para cada opção, chame o método correspondente do Repositorio.
        //UTILIZE SCAN PARA LER A OPÇÃO DO USUÁRIO.

        Estadio estadio1 = new Estadio(1, "Maracanã", 100000.0, "Coberto", "Futebol", 1000000.0);
        Estadio estadio2 = new Estadio(2, "Mineirão", 80000.0, "Coberto", "Futebol", 800000.0);
        Estadio estadio3 = new Estadio(3, "Beira-Rio", 50000.0, "Coberto", "Futebol", 500000.0);
        Estadio estadio4 = new Estadio(4, "Allianz Parque", 45000.0, "Coberto", "Futebol", 450000.0);
        Estadio estadio5 = new Estadio(5, "Arena Corinthians", 50000.0, "Coberto", "Futebol", 500000.0);

        Scanner scan = new Scanner(System.in);
        repositorio.salvar(estadio1);
        repositorio.salvar(estadio2);
        repositorio.salvar(estadio3);
        repositorio.salvar(estadio4);
        repositorio.salvar(estadio5);

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("0 - Sair");
            System.out.println("1 - Salvar objeto");
            System.out.println("2 - Deletar objeto");
            System.out.println("3 - Exibir");
            System.out.println("4 - Desfazer");
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o id do estádio:");
                    int id = scan.nextInt();
                    if(repositorio.existePorId(id)){
                        System.out.println("Id já cadastrado, tente novamente");
                    } else {
                        System.out.println("Digite o nome do estádio:");
                        String nome = scan.next();
                        System.out.println("Digite o lotação do estádio:");
                        Double lotacao = scan.nextDouble();
                        System.out.println("Digite o tipo de Cobertura do estádio:");
                        String cobertura = scan.next();
                        System.out.println("Digite o tipo de Evento do estádio:");
                        String tipoEvento = scan.next();
                        System.out.println("Digite o Valor do Estádio do estádio:");
                        Double valorDoEstadio = scan.nextDouble();
                        Estadio estadio = new Estadio(id, nome, lotacao, cobertura, tipoEvento, valorDoEstadio);
                        repositorio.salvar(estadio);
                    }

                    if (repositorio.pilha.isFull()) {
                        System.out.println("Lista cheia, não é possível cadastrar mais estádios");
                    }
                    repositorio.exibir();
                    break;
                case 2:
                    System.out.println("Digite o id do estádio a ser deletado:");
                    id = scan.nextInt();
                    repositorio.deletar(id);
                    System.out.println("\nDeletado");
                    repositorio.exibir();
                    break;
                case 3:
                    repositorio.exibir();
                    System.out.println("\nExibindo");
                    break;
                case 4:
                    repositorio.desfazer();
                    System.out.println("\nDesfeito" );
                    repositorio.exibir();
                    break;
            }
        }
    }
}
