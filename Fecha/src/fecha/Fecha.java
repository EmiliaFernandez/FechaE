/**
 * 
 */
package fecha;

/**
 * @author Emilia
 *
 */
public class Fecha {
	
		
		public int dia;
		public int mes;
		public int año;

		public Fecha(int dia, int m, int a) {
			this.dia = dia;
			this.mes = m;
			this.año = a;
		}
		
		{

			validarFecha();

		}

		/**
		 * @deprecated Use {@link #validarFecha()} instead
		 * 
		 */
		public void validar() {
			validarFecha();
		}

		/**
		 * 
		 */
		public void validarFecha() {
			if (dia < 1 || dia > 31)
				System.out. println ("Fecha incorrecta");
			if (mes < 1 || mes > 12)
				System.out. println ("Fecha incorrecta");
			// Determinamos la cantidad de días del mes:
			int diasMes = 0;
			switch (mes) {
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
				diasMes = bisisesto();
					break;

			}

			if (dia > diasMes)
				System.out. println ("Fecha incorrecta");
			else
				System.out. println ("Fecha incorrecta");
		}

		/**
		 * @return
		 */
		public int bisisesto() {
			int diasMes;
			if ((año % 400 == 0) || ((año % 4 == 0) && (año % 100 != 0)))
				diasMes = 29;
			else
				diasMes = 28;
			return diasMes;
		}

	}

