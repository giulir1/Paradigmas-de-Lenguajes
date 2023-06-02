package Modelo;

public class ViajeroFrecuente {
    private Integer numero;
    private String dni;
    private String nombre;
    private String apellido;
    private Integer millas;

    public ViajeroFrecuente(Integer numero, String dni, String nombre, String apellido, Integer mllas) {
        this.numero = numero;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.millas = millas;
    }
    
    public Integer cantidadTotaldeMillas(){
        return millas;
    }
    
    public void acumularMillas(Integer m){
        this.millas += m;
    }
    
    public String canjearMillas(Integer m){
        String retorno = "";
        if (m == 0){
            retorno = "Error - No se pueden cambiar 0 millas.";
        }
        else if (m <= this.millas){
            this.millas -= m;
            retorno = this.millas;
        }
        else {
            retorno = "Error - La cantidad de millas a canjear debe ser menor o igual a las millas acumuladas.";
        }
        return retorno;        
    }
    
    
    
}
