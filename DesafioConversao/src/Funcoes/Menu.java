package Funcoes;

import Classe.Moeda;

import java.util.Scanner;

public class Menu {

    public void mostraMenu(){
        Scanner ler = new Scanner(System.in);
        int opConvert = 1;
        Double valorDigitado;
        String moedaBase, moedaRetorno;


        while(opConvert >= 1 && opConvert <= 7){
            Consulta consulta = new Consulta();
            Moeda moeda;

            System.out.println("---|CONVERSOR DE MOEDAS|---");
            System.out.println("1) Dólar > Peso Argentino");
            System.out.println("2) Peso Argentino > Dólar");
            System.out.println("3) Dólar > Real Brasileiro");
            System.out.println("4) Real Brasileiro > Dólar");
            System.out.println("5) Dólar > Peso Colombiano");
            System.out.println("6) Peso Colombiano > Dólar");
            System.out.println("7) Sair");
            System.out.println("\nDigite uma opção: ");
            opConvert = ler.nextInt();
            moeda = verificaOpcao(opConvert);
            System.out.println("Digite o valor: ");
            valorDigitado = ler.nextDouble();

            consulta.consultaCover(moeda.getBase_code(), moeda.getTarget_code(), valorDigitado);
        }
    }

    public Moeda verificaOpcao(int opcao){
        String moedaBase = "";
        String moedaRetorno = "";

        switch (opcao){
            case 1:
                moedaBase = "USD";
                moedaRetorno = "ARG";
                break;
            case 2:
                moedaBase = "ARG";
                moedaRetorno = "USD";
                break;
            case 3:
                moedaBase = "USD";
                moedaRetorno = "BRL";
                break;
            case 4:
                moedaBase = "BRL";
                moedaRetorno = "USD";
                break;
            case 5:
                moedaBase = "USD";
                moedaRetorno = "COP";
                break;
            case 6:
                moedaBase = "COP";
                moedaRetorno = "USD";
                break;
            case 7:

                break;

        }
        return new Moeda(moedaBase, moedaRetorno);
    }


}
