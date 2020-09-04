
package poligono;

import java.util.Scanner;

/**
 * Instituição: Centro Universitário de Maringá
 * Diciplina: Programação II
 * Aluno: André Alves de Oliveira
 * RA: 19131743-5
 * @author aavls
 */
public class Retangulo extends Poligono{
    public double Base, Altura;
    public String Forma = "Retângulo";
    
    Scanner entrada = new Scanner(System.in);
    
    public Retangulo() {
        System.out.println("Quantos lados possui o Retângulo:");
        qtdLados = entrada.nextInt();
        System.out.println("Qual o valor da base do Retângulo:");
        Base = entrada.nextDouble();
        System.out.println("Qual o valor da altura do Retângulo:");
        Altura = entrada.nextDouble();
    }

    @Override
    public double calcularArea() {
        double areaRetangulo = Base * Altura;
        return areaRetangulo;
    }
    
    @Override
    public void imprimir(){
        System.out.println("Este Poligono é um " + Forma + " e possui " + qtdLados + " lados!");
        System.out.println("O comprimento de sua base é de " + Base + " e sua altura de " + Altura + ".");
        System.out.println("E a área do " + Forma + " é de " + calcularArea() + ".");
    }

}
