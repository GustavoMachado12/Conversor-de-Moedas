package Funcoes;

import Classe.Moeda;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Consulta {
    Moeda moeda = new Moeda();
    Menu menu = new Menu();
    Scanner ler = new Scanner(System.in);
    int opContinua;

    public Moeda consultaCover(String base_code, String target_code, Double valorDigitado){

        URI url = URI.create("https://v6.exchangerate-api.com/v6/03c467c4b4eecf28018be365/pair/"
                + base_code + "/" + target_code + "/" + valorDigitado);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Moeda moeda = new Gson().fromJson(response.body(), Moeda.class);
            System.out.println("\n---|RESULTADO|---");
            System.out.println(moeda);

            System.out.println("\nDeseja continuar?");
            System.out.println("1) Sim \n2) Não");
            System.out.println("\nDigite uma opção: ");
            opContinua = ler.nextInt();
            while(opContinua != 1 && opContinua != 2){
                System.out.println("Opção digitada incorretamente.\nDigite Novamente");
                opContinua = ler.nextInt();
            }
            if(opContinua == 1){
                menu.mostraMenu();
            }
            else{
                System.exit(0);
            }
        }
        catch (Exception e){
            System.out.println("Erro: " + e);
        }
        return null;
    }
}
