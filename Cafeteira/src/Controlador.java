
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controlador {
	public Controlador() {
	}

	// Produções
	// estado [ok, not]
	// cafeteira [on, off]
	// copo [1, 2]
	// tamanho [copinho, grande]
	// tipo [amargo, medio, forte]
	// agua [completar, bom, demais]
	// aguatemp [fria, quente, vapor]
	// cafepo [completar, bom, demais]
	// cafegrao [completar, bom, demais]
	// acucar [completar, bom, demais]

	public String executaOps(String cafeteira,
			String copo, String tamanho, String tipo, String agua,
			String aguatemp, String cafepo, String cafegrao, String acucar) {

		try {

			FileWriter arquivoIni = new FileWriter("cafe.ini");

			String conteudoArq;

			conteudoArq = "(load .\\cafe.ops)";
			conteudoArq += System.getProperty("line.separator");
			conteudoArq += "(strategy lex)";
			conteudoArq += System.getProperty("line.separator");
			conteudoArq += "(make Contexto ^fase hibernacao ^estado ok)";
			conteudoArq += System.getProperty("line.separator");
			conteudoArq += "(make Equipamento ^cafeteira " + cafeteira + ")";
			conteudoArq += System.getProperty("line.separator");
			conteudoArq += "(make Dose ^copo " + copo + " ^tamanho " + tamanho
					+ ")";
			conteudoArq += System.getProperty("line.separator");
			conteudoArq += "(make Pedido ^tipo " + tipo + ")";
			conteudoArq += System.getProperty("line.separator");
			conteudoArq += "(make Ingrediente ^agua " + agua + " ^aguatemp "
					+ aguatemp + " ^cafepo " + cafepo + " ^cafegrao "
					+ cafegrao + " ^acucar " + acucar + ")";
			conteudoArq += System.getProperty("line.separator");
			conteudoArq += "(run)";
			conteudoArq += System.getProperty("line.separator");
			conteudoArq += "(exit)";

			arquivoIni.write(conteudoArq);

			arquivoIni.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Um objeto Runtime tem métodos para trabalhar com o SO
		Runtime r = Runtime.getRuntime();

		// Um processo aponta um processo rodando externamente
		Process p;
		String retorno = null;

		// Executa um batch file
		try {
			String[] cmd = new String[1];
			cmd[0] = "cafe.bat";

			p = r.exec(cmd);

			// getInputStream retorna Input stream que a saída do
			// processo p's está ligada. Usamos para a leitura de linhas.
			BufferedReader is = new BufferedReader(new InputStreamReader(p
					.getInputStream()));

			StringBuilder sb = new StringBuilder();
			String linha;

			while ((linha = is.readLine()) != null) {
				sb.append(linha + "\n");
			}

			is.close();

			retorno = sb.toString();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return retorno;
	}

}
