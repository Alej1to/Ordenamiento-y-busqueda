package ordenamiento_busqueda;

public class Busqueda {
	public static Integer Binario(Integer[] data, Integer valor) {
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
}


