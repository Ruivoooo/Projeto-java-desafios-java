package ManipularArquivosJava;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        ConsultaCep consulta = new ConsultaCep();
        Endereco novoEndereco = consulta.buscaEndereco("01001000");
        consulta.buscaEndereco("01001000");




    }

}
