package MetodosMatematicos;

import javax.swing.JOptionPane;

public class Exercicio09 {

	public static void main(String[] args) {
		/*
		 * Cálculo do Comprimento da Hipotenusa: Crie um programa que calcule o
		 * comprimento da hipotenusa de um triângulo retângulo dados os comprimentos dos
		 * dois catetos. Use o teorema de Pitágoras, que envolve a raiz quadrada.
		 */

		int catetoA, catetoB;
		int hipotenusa;

		while (true) {

			try {

				catetoA = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite a medida do cateboA : "));

				catetoB = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite a medida do cateboB : "));

				if (catetoA <= 0 || catetoB <= 0) {

					JOptionPane.showMessageDialog(null,
							"Ocorreu um ERRO inesperado \nVocê forneceu números negativos ou 0 (zero)");

				} else {

					hipotenusa = (int) Math.sqrt(catetoA * catetoA + catetoB * catetoB);

					JOptionPane.showMessageDialog(null, " Resultado final = " + hipotenusa);
					break;

				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,
						"Ocorreu um ERRO inesperado \nVocê forneceu algo diferente de um número");
			}

		}

	}

}
