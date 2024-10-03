package thirdChallenge;
import java.util.Scanner;

public class Main {

    // Função para verificar se o cliente contratou um combo completo
    public static String verificarComboCompleto(String[] servicosContratados) {
        // Variáveis booleanas para verificar a contratação de cada serviço
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        // TODO: Itere sobre os serviços contratados
        for (String servico : servicosContratados) {
          int i = 0;
          if(servicosContratados[i].trim().equals("movel")){
            movelContratado = true;
          } else if(servicosContratados[i].trim().equals("banda larga")){
            bandaLargaContratada = true;
          } else if(servicosContratados[i].trim().equals("tv")){
            tvContratada = true;
          }
          ++i;
        }

        // TODO: Verifique se todos os serviços foram contratados
        if (servicosContratados.length == 3) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de serviços contratados
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] servicosContratados = input.split(",");

        // Verificando se o cliente contratou um combo completo
        String resultado = verificarComboCompleto(servicosContratados);

        // Exibindo o resultado
        System.out.println(resultado);

        // Fechando o scanner
        scanner.close();
    }
}