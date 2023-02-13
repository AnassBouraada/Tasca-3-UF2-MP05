/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taxescotxealumne;

/**
 *
 * @author pc
 */
public class Cotxe {
    
    private String matricula;
    private String combustible;
    private int any;
    private int potencia;
    
    
    public Cotxe(String matricula, String combustible, int any, int potencia){   
        this.matricula = matricula;
        this.combustible = combustible;
        this.any = any;
        this.potencia = potencia;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    

    public double calculImpost(double coeficient){
    // CAL IMPLEMENTAR EL CODI 
    //Aquest mètode calcula l'impost del cotxe fent el següent calcul:
    // impost = potencia * coeficient
    // Després aplica un augment o una reducció en funció de diversos paràmetres
    // Si el cotxe es anterior a 2001 no paga impost per ser un cotxe d'epoca
    // En cotxes de gasolina, si l'any de matricula es anterior 2008 augmetna un 25%
    //          en cas contrari augmenta un 15%
    // En cotxes de gasoil, si l'any de matricula és anterior a 2010 augmenta un 28%
    //          en cas contrari augmenta un 18%                
    // Si el cotxe és hibrid redueix un 25%
    // Si el cotxes és electric redueix un 75%
    // El mètode ha de retornar el impost que paga el cotxe

    return 0.0;
   
    }


    
    public boolean pasarITV(){
        // Aquest mètode retorna True si el cotxe ha de passar la ITV 
        // i false en cas contrari
        // Els cotxes que han de passar la ITV són els que tenen una antiguitat superior a 4 anys
     
        return false;
    }
    
}

