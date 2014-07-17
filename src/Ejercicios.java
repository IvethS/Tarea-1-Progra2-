public class Ejercicios
{
	//deveulve true si "numero" es par y false de lo contrario
	//COMENTARIOS:
	//AQUI comparamos todos los numeros divididos en dos si es asi devolvera
	//verdadero si no devolvera Falso
	static boolean esPar(int numero)
	{
		 if(numero%2==0)
	           return true;
	        else
	            return false;
	}
	
	//devuelve "paquetillo" si lempiras es menor que 50
	//devuelve "paquetin" si lempiras es menor que 100
	//devuelve "paquetote" si lempiras es menor que 200
	//de lo contrario devuelve paqueton
	//nota: solo aceptan minusculas
	//COMENTARIOS:
	//En esta funcion lo que hacemos es comparar la variable de Lempiras y si es menor al numero 
	//ingresado entonces devolvera las palabras estipuladas y si no se ingreso nada devolvera paqueton
	static String churches(int lempiras)
	{
		 if (lempiras<50) 
			 return "paquetillo";
	         if (lempiras<100) 
	            return "paquetin";
	            if (lempiras<200) 
	                return "paquetote";
	            
	           return "paqueton";
		
	        

		
	}
	
	//devuelve el factorial de "num"
	//COMENTARIOS:
	//esta funcion lo que hace es hacer el proceso de una factorial
	//en este caso si el numero es menor que 2 entonces devolvera 1
	//de lo contrario realizara la funcion que es multiplicar numero por la factorial y luego restarlo
	static int factorial(int num)
	{
		int resultado;
		if (num<2) 
		{
			resultado = 1;
		}
		else
		{
			resultado= num* factorial(num-1);
		}
		return resultado;
	}
	
	//devuelve el elemento de "arr" en la posicion "pos"
	//COMENTARIOS:
	//un arreglo donde realiza la funcion de devolver pos.
	static int getElemento(int arr[],int pos)
	{
		return arr[pos];
	}
	
	//devuelve el elemento de "arr" en la posicion ["col"] ["fila"]
	//COMENTARIOS:
	//un arreglo bidemensional que devuelve col y fila.
	static int getElemento(int arr[][],int col,int fila)
	{
		return arr[col] [fila];
	}
	
	//devuelve el atributo "x" de "MiClase"
	//COMENTARIOS:
	//aqui solo devuelve la variable que se declaro en una diferente clase
	
	static int getX(MiClase mi_clase)
	{
		return mi_clase.x;
	}
	
	//implementar la funcion "getXPor2()" descrita en la clase "MiClase"
	//No modificar esta funcion
	//COMENTARIOS:
	//se realizo el proceso en mi clase donde se multiplica la varaible por 2
	static int implementarGetXPor2(MiClase mi_clase)
	{
		return mi_clase.getXPor2();
	}
	
	//implementar la funcion "getXPor2()" descrita en la clase "MiClase"
	//No modificar esta funcion
	//COMENTARIOS:
	//aqui solo se realizo el proceso de sumar una variable con la otra x+y
	static int implementarGetXMasY(MiClase mi_clase, int y)
	{
		return mi_clase.getXMasY(y);
	}
	
	//devuelve la funcion fibonacci de "num"
	//nota: puedes consultar la funcion en http://es.wikipedia.org/wiki/Sucesi%C3%B3n_de_Fibonacci
	//COMENTARIOS:
	//lo realize con la ayuda del link propuesto anteriormente
	//donde devuelve 0 si el numero es 0 y si es igual a 1 devuelve 1 de lo contrario hace la funcion
	static int fibonacci(int num)
	{
		if(num==0) return 0;
        else
             if(num==1)
                return 1;
             else
                  return fibonacci(num-1) + fibonacci(num-2);
	}
	
	//realizar la siguiente funcion recursiva:
	//funcionRecursiva(n) = funcionRecursiva(n-1)*2+1
	//donde: funcionRecursiva(0) = 0 y funcionRecursiva(1) = 2
	//COMENTARIOS:
	//aqui como explica la funcion si el numero igual 0 devolvera 0 y ahi terminara
	//de la misma forma para si es igual 1 devolvera 2 y termino
	//si no entonces hara la funcion recesiva que resta 1 del numero luego lo multiplica por 2+1
	static int funcionRecursiva(int num)
	{
		
		if (num == 0)
			return 0;
		
		if (num == 1)
				return 2;
		
		return funcionRecursiva(num -1)*2+1;
}
	
	
	public static void main(String[] args)
	{

	}

}
