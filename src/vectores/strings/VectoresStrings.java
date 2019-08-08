package vectores.strings;

public enum VectoresStrings {
     VECTOR_SOLICITAR_CANTIDAD("Por favor ingrese una cantidad de numeros"),
     VECTOR_SOLICITAR_NUMERO("Ingrese un numero"),
     VECTOR_CANTIDAD("Los numeros son"),
    POSITIVO(" \nEl numero es Positivo \n"),
    NEGATIVO("\n El numero es Negativo \n"),
    MSJ_LA_CANTIDAD("\n La cantidad de elementos en el arreglo son : \n")
    ;


    VectoresStrings(String s) {
        this.mensaje = s;
    }

    public String getMensaje() {
        return mensaje;
    }

    private String mensaje;


}
