package ordenamiento_busqueda;

import javax.swing,.JOptionPane;
public class ordenamientoybusqueda 

{

	public static void main(String[] args);
	quickSort(int A[], int izq, int der)
	
{
		// TODO Auto-generated method stub
int arreglo[] = {3, 5, 6 ,12, 14, 11, 8, 10, 9, 2, 1, 7, 13, 15, 4};

int pivote = A[izq];
int i =izq;
int j =der;
int aux;

while( i <j) {
	while(A[i] <= pivote && i<j ) i++;
	while(A[j] > pivote) j--;
	if (i < j) {
		
		aux = A[i];
		A[i]=A[j];
		A[j] = aux;
		
	}
}
A[izq] =A[j];
A[j]= pivote;

if(izq < j-1)
      quickSort(A,izq, j-1);
if(j + 1 < der)

quickSort(a,j+1, der);
	



}
	
}
