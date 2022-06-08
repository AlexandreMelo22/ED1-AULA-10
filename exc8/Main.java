import java.util.Random;

public class exc8 {
    public static void main(String[] args) {
        TestaPilha pilha = new TestaPilha();
        Random rdm = new Random();
        
        for(int i=0; i<1000; i++){
            pilha.validar(rdm.nextInt(-100, 100));
        }
    }

}
