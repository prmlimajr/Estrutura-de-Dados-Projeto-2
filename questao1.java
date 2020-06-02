import java.text.Collator;
import java.util.Locale;
import java.util.Scanner;
 
public class questao1 {
    static Locale locale = new Locale("pt-BR");
    static Collator collator = Collator.getInstance(locale);
 
      public static void main(String[] args) {
           
            String [][] dic = {
                    { "camelo", "camel" },
                    { "gato", "cat" } ,
                    { "álcool", "alcohol" },
                    { "cachorro", "dog" },
                    { "água", "water" },
                    { "bola", "ball" },
                    { "peixe", "fish" },
                    { "baleia", "whale" },
                    { "papagaio", "parrot" },
                    { "formiga", "ant" }
                    };
           
            Scanner scan = new Scanner(System.in);
            byte check = -1;
            boolean flag = true;
           
            while(flag) {
               
                System.out.printf("Digite a língua que deseja utilizar:%n"
                                + "(1- Português.)%n"
                                + "(2 - Inglês.)%n"
                                + "(0 - Sair.)%n");
                check = scan.nextByte();
                while(check < 0 || check > 2) {
                    System.out.println("Seleção inválida! Tente novamente: ");
                    check = scan.nextByte();
                }
                switch (check) {
                case 1:
                    System.out.println("BUBBLE - Ordenação em PT-BR");
                    for(int lastUnsortedIndex = dic.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
                        for(int i = 0; i < lastUnsortedIndex; i++) {
                            //int comparison = dic[i][0].compareToIgnoreCase(dic[i+1][0]);
                            int comparison = collator.compare(dic[i][0], dic[i+1][0]);
                            if(comparison > 0) {
                                swap(dic, i, i+1);
                            }
                        }
                    }
                    for(int i = 0; i < dic.length; i++) {
                        for(int j = 0; j < dic[i].length; j++) {
                            System.out.print(" - ");
                            System.out.print("["+dic[i][j] +"]");
                        }
                        System.out.println();
                    }
                    continue;
                case 2:
                        System.out.println();
                        System.out.println("BUBBLE - Ordenação em ENG");
                        for(int lastUnsortedIndex = dic.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
                            for(int i = 0; i < lastUnsortedIndex; i++) {
                                //int comparison = dic[i][1].compareToIgnoreCase(dic[i+1][1]);
                                int comparison = collator.compare(dic[i][1], dic[i+1][1]);
                                if(comparison > 0) {
                                    swap(dic, i, i+1);
                                }
                            }
                        }
                        for(int i = 0; i < dic.length; i++) {
                            for(int j = 0; j < dic[i].length; j++) {
                                System.out.print(" - ");
                                System.out.print("["+dic[i][j] +"]");                  
                            }    
                            System.out.println();
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
