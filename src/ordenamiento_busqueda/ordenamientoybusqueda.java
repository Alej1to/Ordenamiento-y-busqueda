package ordenamiento_busqueda;

import java.util.Scanner;
public class ordenamientoybusqueda 

{public static void quicksort(int A[], int izq, int der) {

	  int pivote=A[izq]; 
	  int i=izq;       
	  int j=der;         
	  int aux;
	  
	  while(i < j){                                                           
	     while(A[i] <= pivote && i < j) i++; 
	     while(A[j] > pivote) j--;           
	     if (i < j) {                                            
	         aux= A[i];                     
	         A[i]=A[j];
	         A[j]=aux;
	     }
	   }
	   
	   A[izq]=A[j];                                          
	   A[j]=pivote;      
	   
	   if(izq < j-1)
	      quicksort(A,izq,j-1);          
	   if(j+1 < der)
	      quicksort(A,j+1,der);  
}
public static Integer Binario(int[] data, int valor) {
    int li = 0;
    int ls = data.length;
    while (li <= ls) {
        int lm = (ls - li) / 2 + li;
        if (data[lm] < valor) {
            li = lm + 1;
        } else if (data[lm] > valor) {
            ls = lm - 1;
        } else {
            return lm;
        }
    }
    return null;
}
	public static void main(String[] args) {
	int dato;
	Scanner sc = new Scanner(System.in);
	/*System.out.print("ingrese el tamaño del arreglo: ");
	int n = sc.nextInt();
	*/
	
	
	int arreglo1[] = {2, 4, 5, 8, 12, 14, 15, 11, 10, 9, 7, 13, 6, 1, 3};
	/*
	if(n <= 0) {
		System.out.println("No puedes ingresar valores negativos");
	 return;
	}*/
	
	
	 /*
		int[] arreglo1 = new int[15];
		for(int i = 0; i < 15; i++) 
		{
	    arreglo[i] = sc.nextInt(); 
	
	}
		*/
	
	
	System.out.println("El arreglo ordenado es: " );
		quicksort(arreglo1, 0, 14);
		
	for(int i = 0; i<15;i++)
		{
			System.out.print(String.valueOf(arreglo1[i]) + " ");
		}
	
	
   
   
   System.out.print("Cual numero desea buscar?");   
  
   
  
 
   for(int i = 0; i< 14; i++) {
	     dato = sc.nextInt();
	  
         System.out.println("EL numero fue encontrado en la posicion:" + Binario(arreglo1, dato).toString());
   }
 
}
}