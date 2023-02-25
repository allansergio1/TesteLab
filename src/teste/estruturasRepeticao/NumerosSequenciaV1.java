package teste.estruturasRepeticao;

public class NumerosSequenciaV1 {
	
	public int calcularTermo(int n) {
        int termo = 2;
        int constante = 1;

        for (int i = 2; i <= n; i++) {
            termo += i + constante;
            constante++;
        }

        return termo;
    }
}
