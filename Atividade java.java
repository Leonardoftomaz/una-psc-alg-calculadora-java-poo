import java.util.Scanner;

class Calculadora {
    double numeroUm;
    double numeroDois;

    Calculadora(double num1, double num2) {
        this.numeroUm = num1;
        this.numeroDois = num2;
    }

    double somar() {
        return numeroUm + numeroDois;
    }

    double subtrair() {
        return numeroUm - numeroDois;
    }

    double multiplicar() {
        return numeroUm * numeroDois;
    }

    double dividir() {
        if (numeroDois == 0) {
            System.out.println("Impossível realizar uma divisão por zero.");
            return -1;
        }
        return numeroUm / numeroDois;
    }

    double potencia() {
        return Math.pow(numeroUm, numeroDois);
    }

    double raizQuadrada() {
        if (numeroUm < 0) {
            System.out.println("Não existe raiz de número negativo.");
            return -1;
        }
        return Math.sqrt(numeroUm);
    }
}

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Digite dois números (Q para sair):");
            double num1 = scanner.nextDouble();
            if (num1 == 'Q' || num1 == 'q') {
                break;
            }
            double num2 = scanner.nextDouble();
            Calculadora calc = new Calculadora(num1, num2);
            System.out.println("Adição: " + calc.somar());
            System.out.println("Subtração: " + calc.subtrair());
            System.out.println("Multiplicação: " + calc.multiplicar());
            double divisao = calc.dividir();
            if (divisao != -1) {
                System.out.println("Divisão: " + divisao);
            }
            System.out.println("Potência: " + calc.potencia());
            double raizQuadrada = calc.raizQuadrada();
            if (raizQuadrada != -1) {
                System.out.println("Raiz Quadrada: " + raizQuadrada);
            }
        }
        scanner.close();
    }
}
