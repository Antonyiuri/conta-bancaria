package Utilitario;

import java.text.DecimalFormat;
import java.text.NumberFormat;



public class Utilitario {
    
    static NumberFormat formatandoValores = new DecimalFormat("R$ #,##0.00");

    public static String douString(Double valor){
        return formatandoValores.format(valor);
    }
}
