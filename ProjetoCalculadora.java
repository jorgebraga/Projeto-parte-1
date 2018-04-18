/* Projeto parte 1
 * Desenvolvimento Mobile
 * Aldo Henrique
 * Jorge Braga
 * CPD: 28987
 */
import java.util.Scanner;

public class ProjetoCalculadora {

    public static void main(String[] args) {
        double mediaG = 0;
        double mediaM = 0;
        double contadorM = 0;
        int contadorF = 0;
        int mediaF = 0;
        // Classe Scanner
        Scanner input = new Scanner(System.in);

        int opcoes;
        do {
            System.out.println(" [1] SOMA");
            System.out.println(" [2] SUBTRAÇÃO");
            System.out.println(" [3] DIVISÃO");
            System.out.println(" [4] FAIXA ETÁRIA");
            System.out.println(" [5] NÚMEROS PRIMOS");
            System.out.println(" [6] MUDANÇA DE BASE");
            System.out.println(" [7] SAIR");
            opcoes = input.nextInt();

            switch (opcoes) {
                /* [1] - SOMA */
                case 1:
                    System.out.println("SOMA");
                    System.out.println(" Entre com o primeiro número: ");  // Entrada de Dados
                    int num1 = input.nextInt();
                    System.out.println(" Entre com o segundo número: "); // Entrada de Dados
                    int num2 = input.nextInt();
                    System.out.println(" O resultado é: " + (num1 + num2));  //Calculo

                    // Opção para retornar ao menu principal
                    while (opcoes != 0) {
                        System.out.println(" Pressione 0 para voltar ao MENU inicial");
                        opcoes = input.nextInt();
                        if (opcoes == 0) {
                            opcoes = 0;
                        } else {
                            System.out.println(" Opção inválida.");
                        }
                    }
                    // Fim da opção de retorno ao menu
                    break;

                // [2] - SUBTRAÇÃO
                case 2:
                    System.out.println("SUBTRAÇÃO");
                    System.out.println(" Digite o primeiro número: "); // Entrada de dados
                    int num3 = input.nextInt();
                    System.out.println(" Digite o segundo número: ");  //Entrada de dados
                    int num4 = input.nextInt();
                    System.out.println(" Resultado:" + (num3 - num4));  //Calculo

                    /* Opção para retornar ao menu principal */
                    while (opcoes != 0) {
                        System.out.println(" Pressione 0 para voltar ao MENU inicial");
                        opcoes = input.nextInt();
                        if (opcoes == 0) {
                            opcoes = 0;
                        } else {
                            System.out.println(" Opção inválida.");
                        }
                    }
                    // Fim da opção de retorno ao menu
                    break;

                case 3:
                    // [3] - DIVISÃO
                    System.out.println(" + + DIVISÃO + + ");
                    System.out.println(" Entre com o primeiro número: "); // Entrada de dados
                    int num5 = input.nextInt();
                    System.out.println(" Entre com o segundo número: "); // Entrada de dados
                    int num6 = input.nextInt();
                    System.out.println(" O resultado é:" + (num5 / num6)); // Calculo

                    // Opção para retornar ao menu principal
                    while (opcoes != 0) {
                        System.out.println(" Pressione 0 para voltar ao MENU inicial");
                        opcoes = input.nextInt();
                        if (opcoes == 0) {
                            opcoes = 0;
                        } else {
                            System.out.println(" Opção inválida.");
                        }
                    }
                    // Fim da opção de retorno ao menu
                    break;

                case 4:
                    // [4] - FAIXA ETÁRIA
                    System.out.println("FAIXA ETÁRIA");
                    double mediamsc = 0;
                    double mediafem = 0;
                    System.out.println(" Informe o número de pessoas");
                    int numeropessoas = input.nextInt();
                    for (int i = 0; i < numeropessoas; i++) {
                        System.out.println(" Informe sua idade ");
                        int idade = input.nextInt();
                        System.out.println(" Informe o seu sexo: (1) Masculino (2)Feminino ");
                        int sexo = input.nextInt();

                        mediaG = mediaG + idade;  // Somar TODAS as idades digitadas
                        if (sexo == 1) {

                            contadorM++;

                            mediaM = mediaM + idade;  // Soma das idades masculinas
                            mediamsc = mediaM / contadorM;  // Media da idades masculinas

                        } else if (sexo == 2) {

                            contadorF++;

                            mediaF = mediaF + idade;  // Somda das idades femininas
                            mediafem = mediaF / contadorF; // Media das idades femininas

                        }

                    }
                    //SAIDA DE DADOS
                    System.out.println(" Media Geral: " + mediaG / numeropessoas);
                    System.out.println(" Media Masculina: " + mediamsc);
                    System.out.println(" Media Feminina: " + mediafem);

                    // Opção para retornar ao menu principal
                    while (opcoes != 0) {
                        System.out.println(" Pressione 0 para voltar ao MENU inicial");
                        opcoes = input.nextInt();
                        if (opcoes == 0) {
                            opcoes = 0;
                        } else {
                            System.out.println(" Opção inválida.");
                        }
                    }
                    // Fim da opção de retorno ao menu
                    break;

                case 5:
                    // [5] - NÚMEROS PRIMOS
                    // variáveis utilizadas na opção 5
                    int soma = 0;

                    // Entrada de dados
                    System.out.println("Digite um número: ");
                    int num = input.nextInt();

                    for (int j = 1; j <= num; j++) {  // Número que irá aumentar para ser testado
                        int contador = 0;
                        for (int i = 1; i <= num; i++) { // FOR QUE IRÁ AUMENTAR para testar o Numero
                            if (j % i == 0) {
                                contador++;  // Conta quantas divisoes tiveram resto 0
                            }
                        }
                        //Numeros primos só tem 2 divisões
                        if (contador == 2) {
                            soma = soma + j;  //Soma dos primos
                        }
                    }
                    //Saída de Dados
                    System.out.println("A soma dos números primos de 1 até " + num + " é igual a: " + soma);

                    // Opção para retornar ao menu principal
                    while (opcoes != 0) {
                        System.out.println(" Pressione 0 para voltar ao MENU inicial");
                        opcoes = input.nextInt();
                        if (opcoes == 0) {
                            opcoes = 0;
                        } else {
                            System.out.println(" Opção inválida.");
                        }
                    }
                    // Fim da opção de retorno ao menu
                    break;

                case 6:
                    // [6] - MUDANÇA DE BASE
                    System.out.println("MUDANÇA DE BASE");
                    System.out.println(" Digite [1] para informar um número binário e [2] para informar um número decimal: ");
                    int bindec = input.nextInt();  //Opcao para o menu (binario ou decimal

                    switch (bindec) {
                        case 1:
                            System.out.println(" Digite o valor em binário ");
                            String entrada = input.next();
                            int potencia = 0;
                            int decimal = 0;

                            for (int i = entrada.length() - 1; i >= 0; i--) {
                                decimal += Math.pow(2, potencia) * Character.getNumericValue(entrada.charAt(i));
                                potencia++;

                            }
                            System.out.println(" O número informado em decimal é: " + decimal);
                            break;

                        case 2:
                            int dec,
                             mod;
                            String bin = "";
                            System.out.println(" Digite um número em decimal ");
                            dec = input.nextInt();

                            while (dec > 0) {
                                mod = (dec % 2);
                                bin = mod + bin;
                                dec = dec / 2;
                            }
                            System.out.println(" O valor do número informado em binário é " + bin);

                    }
                    // Opção para retornar ao menu principal
                    while (opcoes != 0) {
                        System.out.println(" Digite 0 para voltar ao MENU inicial");
                        opcoes = input.nextInt();
                        if (opcoes == 0) {
                            opcoes = 0;
                        } else {
                            System.out.println(" Opção inválida.");
                        }
                    }
                    // Fim da opção de retorno ao menu
                    break;

            }
            if (opcoes > 7) {

                while (opcoes > 7) {
                    System.out.println("Digite [7] para sair ou [0] para voltar ao menu : ");
                    opcoes = input.nextInt();

                    if (opcoes == 7) {
                        opcoes = 7;
                    } else if (opcoes == 0) {
                        opcoes = 0;
                    }
                }

            }

        } while (opcoes == 0);

        System.out.println("Volte Sempre!");

    }
}
