package zodiaco;


import zodiaco.entero.SingoEntrada;

import javax.swing.*;

import static zodiaco.strings.SignoStrings.*;

public class SignoLogica  extends SingoEntrada {


    public SignoLogica(int dia, int mes) {
        super(dia, mes);
    }

    public String signoZodiacal() {
        String signo = null;


        switch (getMes()) {

            case 1:
                // Enero
                if (getDia()<21)
                  signo= CAPRICORNIO.getMensaje();
                else if(getDia()>=21 &&getDia()<=31)
                     signo= ACUARIO.getMensaje();
                else
                  signo=  INVALIDO.getMensaje();
                break;

            case 2:
                // Febrero
                if (getDia()<21) {
                    signo = ACUARIO.getMensaje();
                }
                else if(getDia()>21 && getDia()<=31) {
                    signo = PISCIS.getMensaje();
                }
                else
                    signo=  INVALIDO.getMensaje();

                break;

                case 3:
                // Marzo
                if (getDia()<21) {
                    signo = PISCIS.getMensaje();
                }
                  else
                    signo = ARIES.getMensaje();
                break;

            default:
                JOptionPane.showMessageDialog(null,  INVALIDO.getMensaje());
                    break;

        }
        return signo;
    }



    /////////////



    public String signoZodiacal2() {
        String signo = null;


        switch (getMes()) {

            case 4:
                // Abril
                if (getDia()<21){
                    signo=ARIES.getMensaje();}
                else  if ((getDia()>=21 && getDia()<=31)){
                    signo = TAURO.getMensaje();
                }
                else
                    signo=  INVALIDO.getMensaje();

                break;

            case 5:
                // Mayo
                if (getDia()<22)
                {
                    signo=TAURO.getMensaje();
                }
                else {
                    signo = GEMINIS.getMensaje();
                }


                break;


            case 6:
                // Junio
                if (getDia()<22)
                {
                    signo=GEMINIS.getMensaje();
                }
                else if (getDia()>=22 && getDia()<=31)
                {
                    signo=TAURO.getMensaje();
                }
                else
                    signo=  INVALIDO.getMensaje();
                break;


            default:
                JOptionPane.showMessageDialog(null,  INVALIDO.getMensaje());
                break;


        }
        return signo;
    }

    public String signoZodiacal3() {
        String signo = null;


        switch (getMes()) {


            case 7:
                // Julio
                if (getDia()<23){
                    signo=CANCER.getMensaje();}
                else if (getDia()>=23 && getDia()<=31){
                    signo=LEO.getMensaje();}
                else
                    signo=  INVALIDO.getMensaje();
                break;


            case 8:
                // Agosto
                if (getDia()<23) {
                    signo = LEO.getMensaje();
                }
                else if (getDia()>=23 && getDia()<=31){

                    signo = VIRGO.getMensaje();
                }
                else
                    signo=  INVALIDO.getMensaje();

                break;

            case 9:
                // Septiembre
                if (getDia()<24)
                {signo=VIRGO.getMensaje();}
                else{
                    signo=LIBRA.getMensaje();}

                break;

            default:
                JOptionPane.showMessageDialog(null,  INVALIDO.getMensaje());
                break;


        }
        return signo;
    }

    public String signoZodiacal4() {
        String signo = null;


        switch (getMes()) {



            case 10:
                // Octubre
                if (getDia()<25){
                    signo=LIBRA.getMensaje();}
                else   {
                    signo=ESCORPIO.getMensaje();}



                break;

            case 11:
                // Marzo
                if (getDia()<23){
                    signo=ESCORPIO.getMensaje();}
                else if(getDia()>=23 && getDia()<=31){
                    signo=SAGITARIO.getMensaje();}
                else
                    signo=  INVALIDO.getMensaje();

                break;

            case 12:
                if (getDia() <22)
                {
                    signo = SAGITARIO.getMensaje();}

                else if (getDia()>22 &&getDia() <= 31){
                    signo = CAPRICORNIO.getMensaje();}
                else
                    signo=  INVALIDO.getMensaje();

                break;
            default:
                JOptionPane.showMessageDialog(null,  INVALIDO.getMensaje());
                break;


        }
        return signo;
    }




}