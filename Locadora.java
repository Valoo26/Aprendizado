/*
 *Método está sempre segido por parenteses ex. Andar(); .
Método realiza atividade.
 *classe abstract é molde para outras classes ( ela tem atributos e  metodos( get e set))
classe interface apenas métodos
 */
package locadora;
package scan;
import java.util.Scanner;
/**
 *MPV = Mínimo Produto viável
 * @author luizv
 */
public class Locadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
         
         String NomeChefe;
         String CPFChefe;
         String TelefoneChefe;
         String EnderecoChefe;
         String Nome
         
         
         System.out.println("Qual é o nome do chefe ?");
         NomeChefe= entrada.nextLine();
         System.out.println("Qual o CPF do Chefe??");
         CPF= entrada.nextLine();
         System.out.println("Digite o telefone  ");
         Telefone = entrada.nextLine();
         System.out.println("Digite o endereço");
         Endereco = entrada.nextLine();
         
         
         
         
         
         Chefe Chefe1 = new Chefe(1,NomeChefe, CPFChefe,TelefoneChefe,EnderecoChefe);
         Atendente A1 = new Atendente(2 , "Luiz","000.000.000/00","00-0000-0000","0rua0");
        Cliente C1 = new Cliente("Camille", "111.111.111/11", "11-1111-1111", "1rua1");
        Filme F1= new Filme("Java","Ação");
        Filme F2= new Filme("TemperaturaMaxima", "Ação");
      
         Scanner entrada = new Scanner(System.in);
         
       
    
         
         
        
       
     
    }

    
    
}
