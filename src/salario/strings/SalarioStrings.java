package salario.strings;

public enum SalarioStrings {

    MENSAJE_CANTIDAD_SALARIO("Ingrese un tañano para el vector \n ¿Cuantos Salarios deseas ingresar?") ,

    MENSAJE_SALARIO_MAYOR("El salario de mayor valor es "),
    MENSAJE_REQUERIMIENTO("Señor usuario por favor ingrese el val.Salario como un valor ENTERO "),

    SALARIO_MENOR("el salario mas Bajo es "),
    PROMEDIO("EL PROMEDIO ES "),
    INGRESE_SALARIO("Ingrese un salario para la posicion [ "),
    INGRESE_SALARIO2(" ] "),
    TOTAL_SALARIO("TOTAL SALARIOS A PAGAR ");


    SalarioStrings(String ss) {
        this.mensaje = ss;
    }

    public String getMensaje() {
        return mensaje;
    }



    private String mensaje;
}
