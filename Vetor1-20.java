import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

class Vetor120 {
	private static final Random ALEATORIO = new Random();

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("\n=== PRATICA: VETORES E REPETICAO ===");
			System.out.println("Digite um numero de 1 a 20 para escolher um exercicio.");
			System.out.println("Digite 0 para sair.");
			opcao = entrada.nextInt();
			if (opcao == 1) {
				exercicio1(entrada);
			} else if (opcao == 2) {
				exercicio2(entrada);
			} else if (opcao == 3) {
				exercicio3();
			} else if (opcao == 4) {
				exercicio4();
			} else if (opcao == 5) {
				exercicio5();
			} else if (opcao == 6) {
				exercicio6(entrada);
			} else if (opcao == 7) {
				exercicio7(entrada);
			} else if (opcao == 8) {
				exercicio8(entrada);
			} else if (opcao == 9) {
				exercicio9(entrada);
			} else if (opcao == 10) {
				exercicio10(entrada);
			} else if (opcao == 11) {
				exercicio11(entrada);
			} else if (opcao == 12) {
				exercicio12();
			} else if (opcao == 13) {
				exercicio13(entrada);
			} else if (opcao == 14) {
				exercicio14(entrada);
			} else if (opcao == 15) {
				exercicio15(entrada);
			} else if (opcao == 16) {
				exercicio16(entrada);
			} else if (opcao == 17) {
				exercicio17(entrada);
			} else if (opcao == 18) {
				exercicio18(entrada);
			} else if (opcao == 19) {
				exercicio19(entrada);
			} else if (opcao == 20) {
				exercicio20(entrada);
			} else if (opcao != 0) {
				System.out.println("Opcao invalida.");
			}
		} while (opcao != 0);
		entrada.close();
	}
	private static void exercicio1(Scanner entrada) {
		int[] numeros = new int[10];
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o numero da posicao " + (i + 1) + ": ");
			numeros[i] = entrada.nextInt();
		}
		System.out.println("Numeros primos e suas posicoes:");
		boolean encontrou = false;
		for (int i = 0; i < numeros.length; i++) {
			if (ehPrimo(numeros[i])) {
				System.out.println(numeros[i] + " na posicao " + (i + 1));
				encontrou = true;
			}
		}
		if (!encontrou) {
			System.out.println("Nenhum numero primo foi encontrado.");
		}
	}
	private static void exercicio2(Scanner entrada) {
		int[] primeiro = new int[10];
		int[] segundo = new int[10];
		int[] intercalado = new int[20];
		System.out.println("Digite os 10 valores do primeiro vetor:");
		for (int i = 0; i < primeiro.length; i++) {
			primeiro[i] = entrada.nextInt();
		}
		System.out.println("Digite os 10 valores do segundo vetor:");
		for (int i = 0; i < segundo.length; i++) {
			segundo[i] = entrada.nextInt();
		}
		for (int i = 0; i < primeiro.length; i++) {
			intercalado[i * 2] = primeiro[i];
			intercalado[i * 2 + 1] = segundo[i];
		}
		System.out.print("Vetor intercalado: ");
		imprimirVetor(intercalado);
	}
	private static void exercicio3() {
		int[] numeros = new int[10];
		preencherAleatorio(numeros, 0, 99);
		int soma = 0;
		for (int numero : numeros) {
			soma += numero;
		}
		System.out.print("Vetor gerado: ");
		imprimirVetor(numeros);
		System.out.println("Media: " + (soma / 10.0));
	}
	private static void exercicio4() {
		int[] numeros = new int[20];
		preencherAleatorio(numeros, 1, 30);
		System.out.print("Vetor gerado: ");
		imprimirVetor(numeros);
		boolean existe = false;
		for (int numero : numeros) {
			if (numero == 25) {
				existe = true;
			}
		}
		System.out.println(existe ? "O numero 25 existe no vetor." : "O numero 25 nao existe no vetor.");
	}
	private static void exercicio5() {
		int[] numeros = new int[15];
		preencherAleatorio(numeros, 1, 50);
		System.out.print("Vetor gerado: ");
		imprimirVetor(numeros);
		int indice = -1;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == 20) {
				indice = i;
				break;
			}
		}
		if (indice >= 0) {
			System.out.println("O numero 20 foi encontrado no indice " + indice + ".");
		} else {
			System.out.println("O numero 20 nao existe no vetor.");
		}
	}
	private static void exercicio6(Scanner entrada) {
		int[] numeros = new int[30];
		preencherAleatorio(numeros, 1, 100);
		System.out.print("Vetor gerado: ");
		imprimirVetor(numeros);
		System.out.print("Digite o valor que deseja remover: ");
		int valor = entrada.nextInt();
		int indice = -1;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == valor) {
				indice = i;
				break;
			}
		}
		if (indice == -1) {
			System.out.println("O valor nao existe no vetor.");
		} else {
			for (int i = indice; i < numeros.length - 1; i++) {
				numeros[i] = numeros[i + 1];
			}
			System.out.print("Vetor apos remover a primeira ocorrencia (29 elementos): ");
			for (int i = 0; i < numeros.length - 1; i++) {
				System.out.print(numeros[i] + (i < numeros.length - 2 ? " " : "\n"));
			}
		}
	}
	private static void exercicio7(Scanner entrada) {
		double[] valores = new double[5];
		for (int i = 0; i < valores.length; i++) {
			System.out.print("Digite o valor decimal " + (i + 1) + ": ");
			valores[i] = entrada.nextDouble();
		}
		double maior = valores[0];
		double menor = valores[0];
		for (int i = 1; i < valores.length; i++) {
			if (valores[i] > maior) {
				maior = valores[i];
			}
			if (valores[i] < menor) {
				menor = valores[i];
			}
		}
		System.out.println("Maior valor: " + maior);
		System.out.println("Menor valor: " + menor);
	}
	private static void exercicio8(Scanner entrada) {
		int[] vetorA = new int[15];
		int[] vetorB = new int[15];
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite o valor " + (i + 1) + " de A: ");
			vetorA[i] = entrada.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[vetorA.length - 1 - i];
		}
		System.out.print("Vetor A: ");
		imprimirVetor(vetorA);
		System.out.print("Vetor B (reverso): ");
		imprimirVetor(vetorB);
	}
	private static void exercicio9(Scanner entrada) {
		System.out.print("Quantos recibos deseja imprimir? ");
		int quantidade = entrada.nextInt();
		while (quantidade < 0) {
			System.out.print("Digite zero ou um numero positivo: ");
			quantidade = entrada.nextInt();
		}
		int recibo = 1;
		while (recibo <= quantidade) {
			System.out.println("Recibo " + recibo);
			recibo++;
		}
	}
	private static void exercicio10(Scanner entrada) {
		System.out.print("Digite o numero da tabuada: ");
		int numero = entrada.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + (numero * i));
		}
	}
	private static void exercicio11(Scanner entrada) {
		double soma = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite a temperatura " + i + ": ");
			soma += entrada.nextDouble();
		}
		System.out.println("Temperatura media: " + (soma / 10));
	}
	private static void exercicio12() {
		System.out.println("Numeros pares de 1 a 50:");
		for (int numero = 2; numero <= 50; numero += 2) {
			System.out.print(numero + (numero < 50 ? " " : "\n"));
		}
	}
	private static void exercicio13(Scanner entrada) {
		System.out.print("Digite um numero inteiro N: ");
		int limite = entrada.nextInt();
		System.out.println("Numeros primos menores ou iguais a " + limite + ":");
		for (int numero = 2; numero <= limite; numero++) {
			if (ehPrimo(numero)) {
				System.out.print(numero + " ");
			}
		}
		System.out.println();
	}
	private static void exercicio14(Scanner entrada) {
		System.out.print("Digite o numero positivo de etapas: ");
		int etapas = entrada.nextInt();
		while (etapas <= 0) {
			System.out.print("O numero deve ser positivo. Digite novamente: ");
			etapas = entrada.nextInt();
		}
		System.out.println("Considerando 1 unidade de tempo por etapa, o tempo total e: " + etapas);
	}
	private static void exercicio15(Scanner entrada) {
		System.out.print("Quantos termos da sequencia de Fibonacci deseja? ");
		int quantidade = entrada.nextInt();
		while (quantidade <= 0) {
			System.out.print("Digite uma quantidade positiva: ");
			quantidade = entrada.nextInt();
		}
		BigInteger atual = BigInteger.ZERO;
		BigInteger proximo = BigInteger.ONE;
		for (int i = 0; i < quantidade; i++) {
			System.out.print(atual + (i < quantidade - 1 ? " " : "\n"));
			BigInteger seguinte = atual.add(proximo);
			atual = proximo;
			proximo = seguinte;
		}
	}
	private static void exercicio16(Scanner entrada) {
		int[] respostas = new int[5];
		for (int i = 0; i < respostas.length; i++) {
			System.out.print("Digite a resposta " + (i + 1) + ": ");
			respostas[i] = entrada.nextInt();
		}
		System.out.print("Respostas na ordem inversa: ");
		for (int i = respostas.length - 1; i >= 0; i--) {
			System.out.print(respostas[i] + (i > 0 ? " " : "\n"));
		}
	}
	private static void exercicio17(Scanner entrada) {
		double soma = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite a nota do aluno " + i + ": ");
			soma += entrada.nextDouble();
		}
		System.out.println("Media das notas: " + (soma / 10));
	}
	private static void exercicio18(Scanner entrada) {
		System.out.print("Digite a temperatura 1: ");
		double maior = entrada.nextDouble();
		for (int i = 2; i <= 8; i++) {
			System.out.print("Digite a temperatura " + i + ": ");
			double temperatura = entrada.nextDouble();
			if (temperatura > maior) {
				maior = temperatura;
			}
		}
		System.out.println("Maior temperatura: " + maior);
	}
	private static void exercicio19(Scanner entrada) {
		int[] codigos = {101, 205, 310, 422, 587, 640};
		System.out.print("Digite o codigo do produto: ");
		int procurado = entrada.nextInt();
		boolean existe = false;
		for (int codigo : codigos) {
			if (codigo == procurado) {
				existe = true;
			}
		}
		System.out.println(existe ? "Codigo encontrado." : "Codigo nao encontrado.");
	}
	private static void exercicio20(Scanner entrada) {
		double[] precos = new double[10];
		for (int i = 0; i < precos.length; i++) {
			System.out.print("Digite o preco do produto " + (i + 1) + ": ");
			precos[i] = entrada.nextDouble();
		}
		for (int i = 0; i < precos.length - 1; i++) {
			for (int j = 0; j < precos.length - 1 - i; j++) {
				if (precos[j] > precos[j + 1]) {
					double temporario = precos[j];
					precos[j] = precos[j + 1];
					precos[j + 1] = temporario;
				}
			}
		}
		System.out.print("Precos em ordem crescente: ");
		for (int i = 0; i < precos.length; i++) {
			System.out.print(precos[i] + (i < precos.length - 1 ? " " : "\n"));
		}
	}
	private static boolean ehPrimo(int numero) {
		if (numero < 2) {
			return false;
		}
		for (int divisor = 2; divisor <= numero / divisor; divisor++) {
			if (numero % divisor == 0) {
				return false;
			}
		}
		return true;
	}
	private static void preencherAleatorio(int[] vetor, int minimo, int maximo) {
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = ALEATORIO.nextInt(maximo - minimo + 1) + minimo;
		}
	}
	private static void imprimirVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + (i < vetor.length - 1 ? " " : "\n"));
		}
	}
}
