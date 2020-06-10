import java.text.Collator;
import java.util.Locale;
import java.util.Scanner;

public class questao3 {
	static Locale locale = new Locale("pt-BR");
    static Collator collator = Collator.getInstance(locale);
	public static void main(String[] args) {
		String [][] dic = {
				 { "camelo", "camel" },
                 { "gato", "cat" } ,
                 { "rio", "river" },
                 { "álcool", "alcohol" },
                 { "zangado", "angry" },
                 { "taco", "bat" },
                 { "abacate", "avocado" },
                 { "cachorro", "dog" },
                 { "água", "water" },
                 { "sala", "room" },
                 { "poço", "pit" },
                 { "bola", "ball" },
                 { "peixe", "fish" },
                 { "vida", "life" },
                 { "baleia", "whale" },
                 { "papagaio", "parrot" },
                 { "formiga", "ant" },
                 { "navalha", "razor" },
                 { "amarelo", "yellow" },
                 { "verde", "green" },
                 { "alma", "soul" },
                 { "doce", "sweet" },
                 { "março", "march" },
                 { "uva", "grapes" },
                 { "estado", "state" },                            
                 { "kafkaesco", "kafkaesque" },
                 { "hora", "hour" },
                 { "xenofobia", "xenophobia" },
                 { "ingresso", "ticket" },
                 { "faca", "knife" },                                                
                 { "queimar", "burn" },                                
                 };
		String [][] dicPt = new String [dic.length][2];
		String [][] dicEng = new String [dic.length][2];
		String word;
		String hit;
				
		Scanner scan = new Scanner(System.in);
		byte check = -1;
	  	boolean flag = true;
	  	
	  	while(flag) { 
	  		System.out.printf("Digite a língua que deseja utilizar:%n"
							+ "(1- Português.)%n"
							+ "(2 - Inglês.)%n"
							+ "(0 - Sair.)%n");
	  		check = scan.nextByte();
	      
	  		if(check <= 0 || check > 2) {  
	  			System.out.println("Seleção inválida! Tente novamente: ");
	  			check = scan.nextByte();
	  		}
	  		switch(check) {
	  		case 1: 
	  				System.out.println("Ordenação em PT-BR");
	  				for(int lastUnsortedIndex = dic.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
	  					for(int i = 0; i < lastUnsortedIndex; i++) {
	  						int comparison = collator.compare(dic[i][0], dic[i+1][0]);
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
	  					hit = dicPt[buscaPt(dicPt, word)][1];
	  					System.out.printf("A palavra " + word + " está na posição: " + buscaPt(dicPt, word)+"%n"
	  									+ "A tradução de " + word +" é: "+ hit +"%n");
	  				} else {
	  					System.out.println("A palavra não foi encontrada. " + buscaPt(dicPt, word));
	  				}
	  				continue;
	  				
	  		case 2: 
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
	  					hit = dicEng[buscaEng(dicEng, word)][0];
	  					System.out.printf("A palavra " + word + " está na posição: " + buscaEng(dicEng, word)+"%n"
	  									+ "A tradução de " + word +" é: "+ hit+"%n");
	  				} else {
	  					System.out.println("A palavra não foi encontrada. " + buscaEng(dicEng, word));
	  				}
	  				continue;
	  				
	  		case 0:
	  			System.out.println("Até logo!");
	  			flag = false;
	  				  				      
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
	      			int res = collator.compare(elem, arr[meio][0]);
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
	      			int res = collator.compare(elem, arr[meio][1]);
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
