import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
                
        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = entradaDados.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = entradaDados.nextInt();
        
        try {
            String validadorInformacoes = contar(parametroUm, parametroDois); // Para rodar o controle de exceção
                        
            int indice = parametroDois - parametroUm; // Para estabelecer o limite de iterações no laço for
            for (int i = 0; i < indice; i++){
                System.out.println("Imprimento o número " + (i+1));
            }
            
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static String contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
        return null;
        }
}
