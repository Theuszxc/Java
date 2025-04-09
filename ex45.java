
import java.util.Scanner;

public class ex45 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int opcao = 0, qsand, qqueijo, qpresunto, qcarne, x = 1000;


        System.out.println("Entre com a quantidade de sanduíches que deseja fazer:");
        qsand = ler.nextInt();



        while (opcao != 5){

        System.out.println("\nEntre com uma opção:\n1)Checar a quantidade de queijo nescessária;\n2)Cehcar a quantidade de presunto nescessária;\n3)Checar a quantidade de carne nescessária;\n4) Sair.");
        opcao = ler.nextInt();

        switch(opcao) {
            case 1:
                qqueijo = 50*qsand;
                if(qqueijo >= x) {
                    x = qqueijo / 1000;
                    qqueijo = x;
                    System.out.println("\nPara preparar " + qsand + " sanduíches será nescessário " + qqueijo + " KG de queijo.");
                } else
                    System.out.println("\nPara preparar " + qsand + " sanduíches será nescessário " + qqueijo + " gramas de queijo.");
                break;

            case 2:
                qpresunto = 50*qsand;
                if(qpresunto >= x) {
                    x = qpresunto / 1000;
                    qpresunto = x;
                    System.out.println("\nPara preparar " + qsand + " sanduíches será nescessário " + qpresunto + " KG de presunto.");
                } else
                    System.out.println("\nPara preparar " + qsand + " sanduíches será nescessário " + qpresunto + " gramas de presunto.");
                break;

            case 3:
                qcarne = 100*qsand;
                if(qcarne >= x) {
                    x = qcarne / 1000;
                    qcarne = x;
                    System.out.println("\nPara preparar " + qsand + " sanduíches será nescessário " + qcarne + " KG de carne.");
                } else
                    System.out.println("\nPara preparar " + qsand + " sanduíches será nescessário " + qcarne + " gramas de carne.");
                break;

                case 4:
                System.out.println("\nAté mais!");
                break;
            default:
                System.out.println("\nERRO.");
                break;


            }
        }
    }
}