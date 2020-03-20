import mx.sahuayo.commons.util.Tools;

public class CalculaMontos {
	
	public static void main(String[] args) {
		
		String cadenaOriginal = "Hola como estas|aqui va la otra|adios bye";
		String []arreglo = cadenaOriginal.split("\\|");
		
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
	}

}
