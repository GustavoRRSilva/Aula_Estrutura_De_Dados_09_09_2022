package aulaed;
import java.util.Scanner;
import java.util.Random;
public class AulaED {
    static void inserir (){
        
    }
    static void Deletar(){
        
    }
    static void Pesquisar(){
        
    }
    static void Listar(){
    
    }
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
    int opcoes = 0;
       do{
           System.out.println("Digite 1 caso queira inserir um valor "); 
           System.out.println("Digite 2 caso queira deletar um valor ");
           System.out.println("Digite 3 caso queira pesquisar um valor ");
           System.out.println("Digite 4 caso queira listar um valor ");
           System.out.println("Digite 5 caso queira sair");
           opcoes = ler.nextInt();
       }while(opcoes != 5);
        
        }
    }
