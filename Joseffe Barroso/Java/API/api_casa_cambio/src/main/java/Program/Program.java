package Program;

import java.io.IOException;
import java.util.Scanner;

import org.apache.http.client.ClientProtocolException;

import Model.Cotacao;
import Service.MoedaService;

public class Program {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
	       
        float valorReal, valorConvertido, valorCotacao;
       
        System.out.print("Digite um valor em R$ para ser convertido em Dólar: ");
        valorReal = ler.nextFloat();
       
        MoedaService convService = new MoedaService();
        valorCotacao = convService.getConversao("USD-BRL");
       
        valorConvertido = valorReal / valorCotacao;
       
        System.out.print("Resultado em US$: " + valorConvertido);
	}

}
