import java.util.Scanner;

public class NumeroParImpar
{
    public static void main( String[] args )
    {
        int numero;
        Scanner teclado = new Scanner( System.in );

        System.out.printf( "Introduzca un n�mero entero: " );
        numero = teclado.nextInt();

        /*if ( numero % 2 == 0 )
        {
            System.out.printf( "ES PAR" );
        }
        else
        {
            System.out.printf( "ES IMPAR" );
        }*/
        

		
		String resultado = (numero % 2 == 0) ? "El n�mero es par" : "El n�mero es impar";
		System.out.println(resultado);
    }
}

