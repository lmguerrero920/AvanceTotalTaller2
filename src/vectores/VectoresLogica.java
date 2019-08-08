package vectores;


import vectores.enteros.VectorEntero;
import vectores.strings.VectoresStrings;

import javax.swing.*;




public class VectoresLogica  extends VectorEntero {


    private int[] array;


    public void cargar()
    {
       String vecNumero= JOptionPane.showInputDialog(null,(VectoresStrings.VECTOR_SOLICITAR_NUMERO.getMensaje()));


       String[] nnumero= vecNumero.split(" + ");



        array=new int[nnumero.length];


        for(int f=0;f<array.length;f++) {

            this.setCant(Integer.parseInt(nnumero[this.getCant()]));

            array[f]=this.getCant();


        }


    }

    public void imprimir() {

        do{

        for(int f=0;f<array.length;f++) {



            if (array[f] > 0) {


                JOptionPane.showMessageDialog(null, VectoresStrings.POSITIVO.getMensaje());

            } else {
                JOptionPane.showMessageDialog(null, VectoresStrings.NEGATIVO.getMensaje());


            }
        }

        } while (this.getOpcion()!=0);

    }

    public static void main(String[] ar) {
        VectoresLogica pv=new VectoresLogica();
        pv.cargar();
        pv.imprimir();
    }

}
