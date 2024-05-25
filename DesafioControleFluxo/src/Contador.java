import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
        Boolean continuar = true;
        Scanner terminal = new Scanner(System.in);
        // Autonomizei o programa usando um loop while.
        while (continuar) {
            System.out.println("Deseja continuar? 'S' ou 'N' ");
            String Deseja = terminal.next();
            if (Deseja.equalsIgnoreCase("N" )){
                continuar = false;
                System.out.println("Programa finalizado");
            } 
            else if  (Deseja.equalsIgnoreCase("S") ){
                System.out.println("Digite o primeiro parâmetro");
                int parametroUm = terminal.nextInt();
                System.out.println("Digite o segundo parâmetro");
                int parametroDois = terminal.nextInt();
                
                try {
                    //chamando o método contendo a lógica de contagem
                    contar(parametroUm, parametroDois);

                
                }catch (ParametrosInvalidosException exception) {
                    System.out.println("O segundo parâmetro deve ser maior que o primeiro");
                    //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                }
            
            } 
            else {
                System.out.println("Responda com 'S' ou 'N'");

            }

        }
        terminal.close();
        
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("");
            
        }else{
            //realizar o for para imprimir os números com base na variável contagem
            int contagem = parametroDois - parametroUm;
            for(int i = 0 ; i <= contagem; i++ ){
                System.out.println("Imprimindo o número " + i);
            }

        }
		
	}
}