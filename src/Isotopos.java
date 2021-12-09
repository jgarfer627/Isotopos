import java.util.Scanner;

public class Isotopos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce el procentaje cuando desaparece el isotopo(Numero entero entre 1(1%) y 99(%)");
		Scanner sc=new Scanner(System.in);
		int porcentaje = sc.nextInt();
		float queda=1;
		int ciclos=0;
		long tiempo =System.currentTimeMillis();
		do{
			while(System.currentTimeMillis()-tiempo<26*60*1000);
			tiempo=System.currentTimeMillis();
			queda=queda*1/2;
			ciclos++;
		}	
		while(queda>(float)porcentaje/100);
	System.out.println("Programa terminado. Porcentaje que queda es: "+queda+" después de "+ ciclos*26 + "minutos");
	}
	

}
