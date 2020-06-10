
import java.text.Collator;
import java.util.Locale;
import java.util.Scanner;
 
public class questao2 {
    static Locale locale = new Locale("pt-BR");
    static Collator collator = Collator.getInstance(locale);
   
    public static NoArvore insertPor(NoArvore p, String por, String ing) {
        if (p == null) {
            p = new NoArvore();              
            p.por = por;
            p.ing = ing;
            p.L = null;                      
            p.R = null;                      
            return p;          
        }
        else {
            if(collator.compare(por, p.por) > 0) {
                p.R = insertPor(p.R, por, ing);
            }
            else {
                p.L = insertPor(p.L, por, ing);
            }
            return p;
        }      
       
    }
    public static NoArvore insertIng(NoArvore p, String por, String ing) {
        if (p == null) {
            p = new NoArvore();              
            p.por = por;
            p.ing = ing;
            p.L = null;                      
            p.R = null;                      
            return p;          
        }
        else {
            if(collator.compare(ing, p.ing) > 0) {
                p.R = insertIng(p.R, por, ing);
            }
            else {
                p.L = insertIng(p.L, por, ing);
            }
            return p;
        }      
       
    }
 
    public static void Ler_Por (NoArvore p){
        NoArvore aux = p;
       
        if(aux != null) {
            Ler_Por(p.L);
            System.out.print("[ "+aux.por + " - " + aux.ing+" ]");
            System.out.println();
            Ler_Por(p.R);
           
        }    
 
    }
    public static void Ler_Ing (NoArvore p){
        NoArvore aux = p;
               
        if(aux != null) {                              
            Ler_Ing(p.L);                                      
            System.out.print("[ "+aux.ing + " - " + aux.por+" ]");
            System.out.println();
            Ler_Ing(p.R);  
           
        }  
    }
   
    public static void main(String[]args) {
         Scanner scan = new Scanner(System.in);
         String [][] dic = {
                    { "camelo", "camel" },
                    { "gato", "cat" } ,
                    { "rio", "river" },
                    { "álcool", "alcohol" },
                    { "zangado", "angry" },
                    { "taco", "bat" },
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
   
    boolean flag = true;
    byte check = -1;
   
    while (flag) {
       
        System.out.printf("Digite a língua que deseja utilizar:%n"
                        + "(1- Português.)%n"
                        + "(2 - Inglês.)%n"
                        + "(0 - Sair.)%n");
        check = scan.nextByte();
        if(check < 0 || check > 2) {
            System.out.println("Seleção inválida! Tente novamente: ");
            check = scan.nextByte();
        }
            switch (check) {
                case 1 :
                    NoArvore aP;       
                    aP = null;
               
                    System.out.println("Você selecionou Português: ");
                    for (int i = 0; i < dic.length; i++) { 
                        aP = insertPor(aP, dic[i][0], dic[i][1]);
                    }
               
                    System.out.print("Ordenação por Português:  ");
                    System.out.println();
                    Ler_Por(aP);
                    System.out.println();
                    continue;
           
                case 2:
                    NoArvore aI;
                    aI = null;
               
                    System.out.println("Você selecionou Inglês");
                    for (int i = 0; i < dic.length; i++) { 
                        aI = insertIng(aI, dic[i][0], dic[i][1]);
                    }
               
                    System.out.println("Ordenação por Inglês:  ");
                    System.out.println();
                    Ler_Ing(aI);                   
                    System.out.println();
                    continue;
               
                case 0:
                    System.out.println("Até logo!");
                    flag = false;
            }      
    }  
     
  }
           
}
