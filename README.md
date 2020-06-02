# Estrutura-de-Dados-Projeto-2
Repositório com os códigos do trabalho da disciplina de Estruturas de Dados do 3º Período da Uninassau.

- - - - 
# Projeto - Unidade 2 #

Considere uma estrutura de dados matriz para representar as palavras em português (coluna [0]) e inglês (coluna [1]).  Essa estrutura será usada para entrada de dados. Veja exemplo abaixo:

String [ ][ ] dic = { {"cachorro","dog"}, {"gato", "cat"}, {"água", "water”},  ... }; 
 
 - [X] __1 -Implementar um dos métodos de ordenação para ordenar a estrutura com duas palavras (String), tipo um dicionário com a palavra e a tradução (Português/Inglês). Usar a linguagem JAVA para essa tarefa. Colocar no teste a opção de ordenar por qualquer uma das línguas.__

- - - - 

- [X] __2 - Utilizar uma árvore binária de busca para fazer a ordenação da estrutura com duas palavras (String), tipo um dicionário com a palavra e a tradução (Português/Inglês). Enviar os dados para a árvore e depois gerar uma estrutura de volta com os dados ordenados. Considere a classe NoArvore abaixo para armazenar as palavras (português/Inglês) na árvore. Usar a linguagem JAVA para essa tarefa. Colocar no teste a opção de ordenar por qualquer uma das línguas.__

- - - - 

- [X] __3 - Implementar em JAVA uma busca binária em vetor ordenado. Essa busca deve procurar por uma palavra no vetor de palavras (português/Inglês) usado na questão 1. Usar o método de ordenação da questão 1 para gerar o vetor ordenado. Fazer uma cópia do vetor para que possa ser ordenado nos dois idiomas. No programa deve ser escolhido qual o idioma da busca (Português=>Inglês ou Inglês=>Português), assim como solicitar a palavra para ser traduzida.__

- - - - 

- [ ] __4 - Implementar em JAVA uma árvore binária de busca para inserir e procurar palavras (português/Inglês) nessa árvore na forma de um dicionário. A busca deve procurar por uma palavra na árvore de palavras (português/Inglês). Usar as mesmas palavras da questão 4. No programa deve ser feita a tradução de Inglês=>Português. Solicitar a palavra para ser traduzida. Usar a estrutura de matriz de palavras para entrar com os dados na árvore. Considere a classe NoArvore abaixo para armazenar as palavras (português/Inglês) na árvore.__

public class NoArvore {   
  public String por, ing ;  
  public NoArvore L, R;   
 
  public NoArvore ( String p, String i ){   
    por = p;   
    ing = i;   
    L = null;   
    R = null;  
  } 
 
  public NoArvore (){   
    L = null;   
    R = null;  
  } 
}

__OBS:__  
- Use programas de teste para verificar o funcionamento das estruturas. 
- Entregar em formato digital (código fonte). 
- Trabalho em grupo de até 05 alunos ou individual. 
- Na apresentação serão solicitadas algumas mudanças no exercício para avaliação do aprendizado, por um integrante do grupo indicado pelo professor. 
- Todos os integrantes devem apresentar o trabalho. 
- O trabalho deve ser ORIGINAL. 
 
Esse trabalho corresponde a 50% da avaliação da 2ª unidade.  
  __Data de entrega e apresentação: Aula após a prova.__
