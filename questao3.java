import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		byte check;
		String [][] dic = {
				{ "camelo", "camel" },
				{ "gato", "cat" } ,
				{ "alcol", "alcohol" },
				{ "cachorro", "dog" },
				{ "agua", "water" },
				{ "bola", "ball" },
				{ "peixe", "fish" },
				{ "baleia", "whale" },
				{ "papagaio", "parrot" },
				{ "formiga", "ant" }
				};
		String [][] dicPt = new String [dic.length][2];
		String [][] dicEng = new String [dic.length][2];
		String word;
		
		Scanner scan = new Scanner(System.in);
	      
		System.out.println("Digite o tipo de ordem que deseja utilizar: (1. PT-ENG, 2. ENG-PT)");  
		check = scan.nextByte();
	      
		while(check <= 0 || check > 2) {  
			System.out.println("Seleção inválida! Tente novamente: ");
			check = scan.nextByte();
		}
			if(check == 1) {
				System.out.println("Ordenação em PT-BR");
				for(int lastUnsortedIndex = dic.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
					for(int i = 0; i < lastUnsortedIndex; i++) {
						int comparison = dic[i][0].compareToIgnoreCase(dic[i+1][0]);
						if(comparison > 0) {
							swap(dic, i, i+1);
						}
					}
				}
				for(int i = 0; i < dic.length; i++) {
					for(int j = 0; j < dic[i].length; j++) {
						dicPt[i][j] = dic[i][j];
					}
				}
		      
				System.out.println("Escolha a palavra para ser traduzida: ");
				word = scan.next();
		      
				if (buscaPt(dicPt, word) != -1) {
					System.out.println("A palavra " + word + " está na posição: " + buscaPt(dicPt, word));
				} else {
					System.out.println("A palavra não foi encontrada. " + buscaPt(dicPt, word));
				}

			}
			else {
				System.out.println();
				System.out.println("Ordenação em ENG");
				for(int lastUnsortedIndex = dic.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
					for(int i = 0; i < lastUnsortedIndex; i++) {
						int comparison = dic[i][1].compareToIgnoreCase(dic[i+1][1]);
						if(comparison > 0) {
							swap(dic, i, i+1);
						}
					}
				}
				for(int i = 0; i < dic.length; i++) {
					for(int j = 0; j < dic[i].length; j++) {
						dicEng[i][j] = dic[i][j];
					}
				}
	          
				System.out.println("Escolha a palavra para ser traduzida: ");
				word = scan.next();
		      
				if (buscaEng(dicEng, word) != -1) {
					System.out.println("A palavra " + word + " está na posição: " + buscaEng(dicEng, word));
				} else {
					System.out.println("A palavra não foi encontrada. " + buscaEng(dicEng, word));
				}
	             
			}	      
		
		}
	      
	      	public static void swap(String[][] arr, int i, int j) {
	      		if(i == j) {
	      			return;
	      		}
	      		String tempPtBR = arr[i][0];
	      		String tempEng = arr[i][1];
	      		arr[i][0] = arr[j][0];
	      		arr[i][1] = arr[j][1];
	      		arr[j][0] = tempPtBR;
	      		arr[j][1] = tempEng;
	      	}
	      
	      	public static int buscaPt (String [][] arr, String elem) {
	      		int ini = 0;
	      		int fim = arr.length - 1;
	      		while(ini <= fim) {
	      			int meio = (ini + fim) / 2;
	      			int res = elem.compareToIgnoreCase(arr[meio][0]);
	      			if(res == 0) {
	      				return meio;
	      			} else if (res > 0){
	      				ini = meio + 1;
	      			} else {
	      				fim = meio - 1;
	      			}
	      		}
	      		return -1;
	      	}

	      	public static int buscaEng (String [][] arr, String elem) {
	      		int ini = 0;
	      		int fim = arr.length - 1;
	      		while(ini <= fim) {
	      			int meio = (ini + fim) / 2;
	      			int res = elem.compareToIgnoreCase(arr[meio][1]);
	      			if(res == 0) {
	      				return meio;
	      			} else if (res > 0){
	      				ini = meio + 1;
	      			} else {
	      				fim = meio - 1;
	      			}
	      		}
	      		return -1;
	      	}
	  }
