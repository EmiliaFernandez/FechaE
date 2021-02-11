/**
 * 
 */
package fecha;

/**
 * @author Emilia
 *
 */
public class FechaOriginal {
	

		public int d;
		public int m;
		public int a;

		public FechaOriginal(int d, int m, int a) {
			this.d = d;
			this.m = m;
			this.a = a;
		}

		{

			if (d < 1 || d > 31)
				System.out. println ("Fecha incorrecta");
			if (m < 1 || m > 12)
				System.out. println ("Fecha incorrecta");

			// Determinamos la cantidad de días del mes:
			int diasMes = 0;
			switch (m) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					diasMes = 31;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					diasMes = 30;
					break;
				case 2: // Verificamos si el año es bisiesto
					if ((a % 400 == 0) || ((a % 4 == 0) && (a % 100 != 0)))
						diasMes = 29;
					else
						diasMes = 28;
					break;

			}

			if (d > diasMes)
				System.out. println ("Fecha incorrecta");
			else
				System.out. println ("Fecha incorrecta");

		}

	}

