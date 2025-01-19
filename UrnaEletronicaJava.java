import java.util.Scanner;

public class UrnaEletronicaJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Urna urna = new Urna();

        System.out.println("Bem-vindo à Urna Eletrônica!");
        System.out.println("Candidatos:");
        System.out.println("01 - Ada Lovelace");
        System.out.println("02 - Alan Turing");
        System.out.println("03 - Marie Curie");
        System.out.println("04 - Albert Einstein");
        System.out.println("05 - Ludwig van Beethoven");

        int votosRecebidos = 0;
        while (votosRecebidos < 10) {
            System.out.print("Digite o número do candidato que deseja eleger: ");
            String numero = sc.nextLine();

            if (numero.matches("\\d{2}")) {
                urna.receberVoto(numero);
                votosRecebidos++;
            } else {
                System.out.println("Entrada inválida! Digite um número com dois dígitos, entre '01' e '06': ");
            }
        }

        urna.apurarResultados();
        sc.close();
    }
}