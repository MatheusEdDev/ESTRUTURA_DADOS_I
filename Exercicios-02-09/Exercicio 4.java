public class Main
{
	public static void main(String[] args) {
	//	System.out.println("Hello World");
	double[] precos = {1.50, 2.75, 5.00, 3.25};
	double resultado = 0;
	int i;
	for(i=0;i<4;i++){
	    resultado += precos[i];
	}
	System.out.println("Soma = "+resultado);
	}
}
