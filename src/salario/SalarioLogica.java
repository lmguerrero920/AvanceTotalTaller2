package salario;

import salario.strings.SalarioStrings;

import javax.swing.*;

public class SalarioLogica  {

    private  static int[]v;
    private  static  int mayor = 0;
    private  static int menor = 99999999;



    public void cargar(){
         int tam;

        tam=(Integer.parseInt(JOptionPane.showInputDialog(null,
                SalarioStrings.MENSAJE_CANTIDAD_SALARIO.getMensaje())));

        JOptionPane.showMessageDialog(null,SalarioStrings.MENSAJE_REQUERIMIENTO.getMensaje());
        v = new int[tam];

        // Llenar Vector
        for(int i = 0; i < v.length; i++)

            v[i] = Integer.parseInt(JOptionPane.showInputDialog(SalarioStrings.INGRESE_SALARIO.getMensaje()+i+SalarioStrings.INGRESE_SALARIO2.getMensaje()));
    }

    // Numero Menor
    public static int   nMenor(){
        for(int i = 0; i < v.length; i++){
            if ( v[i] < menor){
                menor = v[i];
            }
        }
return menor;
    }

    // Numero Mayor
   public static int nMayor(){
        for(int i = 0; i < v.length; i++){
            if ( v[i] > mayor){
                mayor = v[i];
            }
        }
return mayor;
    }
// Sumatoria vectore
    public static int sumaMax()
    {
        int maxSuma = 0;
        for (int i = 0; i < v.length; i++)
        {
            maxSuma+=v[i];
        }
        return maxSuma;
    }

    public static double promSalario()
    {
        int maxSuma = 0;
        for (int i = 0; i < v.length; i++)
        {
            maxSuma+=v[i];
        }
       return ( maxSuma/v.length) ;

    }




    public static void main(String[] args) {
    SalarioLogica sl= new SalarioLogica();
       sl.cargar();

    }

}
