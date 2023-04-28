/**
 * @author Joan
 *
 */

public class Variables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Declaració i inicialització de dues variables
		
		//Declaració d'una variable
		int enter;

		//Inicialització d'una variable
		enter = 7;

		//Declaració d'una variable
		char lletra;
		
		// Inicialització d'una variable
		lletra = 'a';
		
		// Declaración i inicializació d'una constant
		final int QTAT_HORES = 8;
		
		//Impresió per consola dels 3 valors

		System.out.println(enter);
		
		System.out.println(lletra);
		
		System.out.println(QTAT_HORES);
		
		int unAltreNumeroMesQueEscrivimAmbNotacioCamelCase = 1;
		
		System.out.println(unAltreNumeroMesQueEscrivimAmbNotacioCamelCase);

		
		/*
		 * Literal
		 */
		
		// Valor boleà  CERT - TRUE
		boolean resultatBolea = true;
		System.out.println("resultatBolea = " + resultatBolea);

		// Lletra C (char)
		char lletraMajuscula = 'C';
		System.out.println("lletraMajuscula = " + lletraMajuscula);
		
		//Numero enter 100
		byte enterByte = 100;
		System.out.println("enterByte = " + enterByte);
		
		// Nombre 1000
		short enterShort = 1000;
		System.out.println("enterShort = " + enterShort);

		// Nombre 1000000
		int enterInteger = 1000000;
		System.out.println("enterInteger = " + enterInteger);
		
		// Número 26 en decimal
		int valor26EnDecimal = 26;
		System.out.println("valor26Endecimal = " + valor26EnDecimal);
		
		// Número 26 en hexadecimal
		int valor26EnHexdecimal = 0x1a;
		System.out.println("valor26EnHexdecimal = " + valor26EnHexdecimal);
		
		// Número 26 en binari
		int valor26EnBinari = 0b11010;
		System.out.println("valor26EnBinari = " + valor26EnBinari);
		
		String cadena = "Hola Mundo";
		System.out.println("cadena = " + cadena);
		
		/**
		 * @auhtor Joan
		 * Tipus de dades numèrics
		 */
		
		// Tipus de deads ENTERS
		// byte => 1 byte => des de -128 fins a 127
		byte enterByte2 = 28;
		System.out.println("enterByte2 = " + enterByte2);
		
		// short => 2 bytes => des de -32768 fins a 32767
		short enterShort2 = 3458;
		System.out.println("enterShort2 = " + enterShort2);
		
		// int => 4 bytes => des de -2^31 fins a 2^31-1
		int enterInteger2 = 33456;
		System.out.println("enterInteger2 = " + enterInteger2);
		
		// long => 8 bytes => des de -2^63 fins a 2^63-1
		long enterLong = 3_000_000_000L;
		System.out.println("enterLong = " + enterLong);
		
		// Tipus de dades Reals
		// Precisió simple
		
		float realFloatSimple = 0.25f;
		System.out.println("realFloatSimple = " + realFloatSimple);
		
		// Precisió doble
		double Pi = Math.PI;
		System.out.println("realFloatdouble Pi = " + Pi);
		
		// Operadors Numèrics
		int primerOperador = 7;
		int segonOperador = 5;
		
		// Suma
		int resultatSuma = primerOperador + segonOperador;
		System.out.print("Suma ");
		System.out.println(resultatSuma);
		
		// Resta
		int resultatResta = primerOperador - segonOperador;
		System.out.print("Resta ");
		System.out.println(resultatResta);
		
		// Multiplicació o Producte
		int resultatProducte = primerOperador * segonOperador;
		System.out.print("Multipliació o producte ");		
		System.out.println(resultatProducte);
		
		// Divisió (sencera, sernse decimals!)
		int resultatDivisio = primerOperador / segonOperador;
		System.out.print("Divisió sencera ");
		System.out.println(resultatDivisio);
		
		//Divisió (no sencera amb decimals)
		double resultatDivisioNoSencera = Pi/realFloatSimple;
		System.out.println("Divisió amb decimals, no entera ");
		System.out.println(resultatDivisioNoSencera);
				
		// Mòdul o Resta
		int resultatModul = primerOperador % segonOperador;
		System.out.print("Mòdulo o resta ");		
		System.out.println(resultatModul);
		
		// Increment
		int valorEnter = primerOperador++;
		System.out.print("Increment ");		
		System.out.println(valorEnter);
		System.out.println(primerOperador);
		
		//Operadors a nivell de bits
		int bitMask = 0b0011; 
		int valorBinari = 0b1111; 
		
		//0011
		int resultatBinari = valorBinari & bitMask;
		System.out.print("AND ");
		System.out.println(Integer.toBinaryString(resultatBinari));
		
		//1100
		resultatBinari = valorBinari ^ bitMask;
		System.out.print("OR exclusiu");		
		System.out.println(Integer.toBinaryString(resultatBinari));
				
		//1111
		resultatBinari = valorBinari | bitMask;
		System.out.print("OR inclusiu ");
		/** La classe Integer evnolta (wraps) un valor de tipus primitiu int com un objecte.
		* Un objecte de tipus Integer conté un únic camp el tipus del qual és int.
		*/
		System.out.println(Integer.toBinaryString(resultatBinari));
		
		// 0b1111
		resultatBinari = valorBinari << 1; //11110
		System.out.print("left shift ");		
		System.out.println(Integer.toBinaryString(resultatBinari));
				
		//0011
		resultatBinari = valorBinari >> 2;
		System.out.print("Signed rigth shift ");		
		System.out.println(Integer.toBinaryString(resultatBinari));
		
		//11111111111111111111111111111100
		resultatBinari = (-valorBinari) >> 2;
		System.out.print("Signed rigth shift ");		
		System.out.println(Integer.toBinaryString(resultatBinari));
				
		//111
		resultatBinari = valorBinari >>> 1;
		System.out.print("Unsigned rigth shift ");		
		System.out.println(Integer.toBinaryString(resultatBinari));
		
		//11111111111111111111111111110000
		resultatBinari = ~valorBinari;
		System.out.print("Inverso o complementario ");
		System.out.println(Integer.toBinaryString(resultatBinari));
	}
}