import java.util.Scanner;

public class App {
    public static void main(String[] args) {
            
        Scanner scanner = new Scanner(System.in);
        
        long ra = 0;
        int idade=0, qtdAds = 0, qtdInfo = 0, qtdAgro = 0, qtdMulher = 0, maiorIdade = 0, menorIdade = 200, qtdAgroSexto = 0;
        String nomePessoaMaisVelha = null, cursoPessoaMaisNova = null, sexo ="";

        do {
            System.out.println("Insira o número do RA ou digite 0 para sair: ");
            ra = scanner.nextLong();

            if(ra == 0) {
                continue;
            }
            
            System.out.println("Digite o Primeiro nome: ");
            String nome = scanner.next();
            do{
            System.out.println("Digite a Idade: ");
            idade = scanner.nextInt();
            }while (idade < 0 || idade >110);
            if(idade > maiorIdade) {
                maiorIdade = idade;
                nomePessoaMaisVelha = nome;
            }

            do{
            System.out.println("Digite o Sexo (F-Feminino ou M-Masculino): ");
            sexo = scanner.next();
            }while(!sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("M"));


            if(sexo.equalsIgnoreCase("F")) {
                qtdMulher += 1;
            }

            scanner.nextLine();
            
            System.out.println("Digite o Curso (ADS- Análise e Desenvolvimento de Sistemas / AGRO - Agronegócio / INFO - Informática para Negócio)");
            String curso = scanner.nextLine();
            
            System.out.println("Digite o Período do curso: ");
            int periodo = scanner.nextInt();

            if(curso.equalsIgnoreCase("ADS")) {
                qtdAds++;
            } else if(curso.equalsIgnoreCase("AGRO")) {
                qtdAgro++;
                
            } else if(curso.equalsIgnoreCase("INFO")) {
                qtdInfo++;
            }

            if(curso.equalsIgnoreCase("AGRO") && periodo == 6) {
                qtdAgroSexto++;
            }

            if(idade < menorIdade) {
                menorIdade = idade;
                cursoPessoaMaisNova = curso;
                
            }

        } while (ra != 0);

        System.out.println("---Strings---");
        System.out.println("Quantidades de Alunos do ADS: "+ qtdAds);
        System.out.println("Quantidades de Alunos do INFO: "+ qtdInfo);
        System.out.println("Quantidades de Alunos do AGRO: "+ qtdAgro);

        System.out.println("A quantidade de pessoas do sexo Feminino é: "+qtdMulher);
        System.out.println("A pessoa mais velha possui "+maiorIdade+" anos, e se chama "+nomePessoaMaisVelha);

        System.out.println("O curso da pessoa mais nova é "+ cursoPessoaMaisNova.toUpperCase() +", e sua idade é "+menorIdade);

        System.out.println(qtdAgroSexto+" pessoas estão no 6o Período.");
        
        scanner.close();
    }
}
