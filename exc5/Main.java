import java.util.Random;
import java.util.Stack;

public class exc5 {
    public static void main(String[] args) {
        Stack<Integer> pilhaP = new Stack<>();
        Fila filaF = new Fila();
        
        Random rdm = new Random();
        
        int i = 0;
        while(i<1000){
            int numAleatorio = rdm.nextInt();
            if(!filaF.procurarNaFila(numAleatorio)){
                filaF.push(numAleatorio);
            }
            else{
                pilhaP.push(numAleatorio);
                                                  
            }
            
            i++;
        }
        
        i=0;
        System.out.println("FILA F:");
        while(!filaF.empty()){
            System.out.println(i + ". " + filaF.pop());
            i++;
        }
        
        i=0;
        System.out.println("\nPILHA P:");
        while(!pilhaP.empty()){
            System.out.println(i + ". " + pilhaP.pop());
            i++;
        }
    }

}
