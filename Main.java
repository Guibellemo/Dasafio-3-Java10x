package Desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String[][] array = new String[1000][6];
        Scanner scanner = new Scanner(System.in);
        int contador = 1;


        // MENU
        while (contador > 0) {
            System.out.println("==================== MENU ====================");
            System.out.println(" ");
            System.out.println("1 - Mostrar informações de todos os ninjas");
            System.out.println("2 - Adicionar ninja");
            System.out.println("3 - Atualizar habilidade especial");
            System.out.println("4 - Sair");
            System.out.println(" ");
            System.out.println("==============================================");
            System.out.println("Digite a opção: ");

            int escolhaDoUsuario = scanner.nextInt();
            scanner.nextLine();


            switch (escolhaDoUsuario) {

                case 1:
                    // LISTAGEM

                    System.out.println(" ");
                    System.out.println("→ Lista de todos os ninjas:");

                    for (int i = 0; i < array.length; i++) {

                        if (array[0][0] == null) {
                            System.out.println("Não há ninjas cadastrados.");
                            break;
                        } else if (array[i][0] != null) {
                            System.out.println(" ");
                            System.out.println("Ninja " + (i + 1) + ":");
                            System.out.println(array[i][0]);

                            for (int j = 1; j < array[i].length; j++) {

                                System.out.println(array[i][j]);

                            }
                            System.out.println(" ");
                        } else {
                            break;
                        }


                    }
                    break;

                case 2:
                    // Adicionar novo ninja

                    Ninja ninja = new Ninja();
                    System.out.println("Adicione um ninja:");

                    for (int i = 0; i < array.length; i++) {

                        if (array[i][0] == null) {

                            // adicionar o nome do ninja
                            System.out.println("Digite o nome do ninja: ");
                            String nomeNinja = scanner.nextLine();
                            ninja.nome = nomeNinja;
                            array[i][0] = ninja.nome;

                            for (int j = 1; j < array[i].length; j++) {
                                // adicionar as caracteristicas do ninja.

                                if (j == 1) {
                                    System.out.println("Adicione a idade: ");
                                    int idadeNinja = scanner.nextInt();
                                    scanner.nextLine();
                                    ninja.idade = idadeNinja;
                                    String idadeString = Integer.toString(ninja.idade);
                                    array[i][j] = idadeString;

                                } else if (j == 2) {
                                    System.out.println("Adicione a missão: ");
                                    String missaoNinja = scanner.nextLine();
                                    ninja.missao = missaoNinja;
                                    array[i][j] = ninja.missao;

                                } else if (j == 3) {
                                    System.out.println("Adicione o nível de dificuldade: ");
                                    String nivelDeDificuldade = scanner.nextLine();
                                    ninja.nivelDificuldade = nivelDeDificuldade;
                                    array[i][j] = ninja.nivelDificuldade;

                                } else if (j == 4) {
                                    System.out.println("Status da missão: ");
                                    String statusDaMissao = scanner.nextLine();
                                    ninja.statusMissao = statusDaMissao;
                                    array[i][j] = ninja.statusMissao;

                                } else {
                                    System.out.println("Habilidade especial: ");
                                    String habilidadeEspecial = scanner.nextLine();
                                    ninja.habilidadeEspecial = habilidadeEspecial;
                                    array[i][j] = ninja.habilidadeEspecial;

                                }


                            }
                            break;
                        }

                    }

                    break;

                case 3:
                    //Atualizar habilidade especial

                    System.out.println("Atualize a habilidade especial:");
                    System.out.println("Digite o número do ninja que você quer alterar a habilidade especial.");

                    for (int i = 0; i < array[i].length; i++) {
                        if (array[i][0] != null) {
                            System.out.println("Ninja " + (i + 1) + " " + array[i][0]);
                        } else {
                            break;
                        }

                        int escolhaDoNinja = scanner.nextInt();
                        scanner.nextLine();

                        int indice = escolhaDoNinja - 1;

                        System.out.println("Digite a nova habilidade: ");
                        String novaHabilidadeEspecial = scanner.nextLine();

                        array[indice][5] = novaHabilidadeEspecial;

                        System.out.println("Habiliade modificada com sucesso.");

                    }
                    break;

                case 4:
                    // Sair do menu
                    System.out.println("Até mais!");
                    contador--;
                    break;

                default:
                    // Entrada inválida
                    System.out.println("Entrada inválida!");
            }
        }
        scanner.close();


    }
}
