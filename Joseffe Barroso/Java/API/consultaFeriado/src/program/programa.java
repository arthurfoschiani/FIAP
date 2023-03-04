package program;

public class programa {
	API_Feriado api_Feriado = new API_Feriado();
	try {
		api_Feriado.VerifyFeriado();
	} catch (ClientProtocolException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
