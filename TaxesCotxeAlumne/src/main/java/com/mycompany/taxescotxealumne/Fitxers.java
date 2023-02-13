/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taxescotxealumne;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author pc
 */
public class Fitxers {
    public int columnes ;
    public String rxcvmtFitxer;
    
    public Fitxers(int cols, String rutaFitxer){
        this.columnes = cols;
        this.rxcvmtFitxer = rutaFitxer;
    }

    public int getColumnes() {
        return columnes;
    }

    public void setColumnes(int columnes) {
        this.columnes = columnes;
    }

    public String getRxcvFit() {
        return rxcvmtFitxer;
    }

    public void setRuatFitxer(String ruatFitxer) {
        this.rxcvmtFitxer = ruatFitxer;
    }
    
    private int getFiles() {
        //Retorna les files del fitxer 
        int comptaFiles = 0;
        try ( Scanner fila = new Scanner(new File(getRxcvFit()))) {
            while (fila.hasNextLine()) {
                fila.nextLine();
                comptaFiles++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return comptaFiles;
    }
    
    public String[][] llegirDataDesdeFitxerCSV () {
        //Retorna un array amb al info del fitxer
        int files = getFiles();
        int columns = getColumnes();
        String[][] dades = new String[files][columns];
        String linia;
        String separador = ",";
        int fila = 0;

        try ( Scanner scanner = new Scanner(new File(getRxcvFit()))) {
            while (scanner.hasNextLine()) {
                linia = scanner.nextLine(); //desa la info de cada linia del fitxer
                String[] camps = linia.split(separador); //separa la infor de la linia pel sepador ","
                //Cal implementar codi per omplir l'Array dades amb la informació
                //dels cotxes llegida del fitxer
                fila++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return dades;
    }
    
    public void escriuDataEnFitrxerCSV(String [][] data) {
        //String fileName = this.rutaFitxer;
        String fileName=getRxcvFit();
        String fila="";
              
        try (FileWriter writer = new FileWriter(fileName)) {
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < getColumnes(); j++) {
                    if (j!=getColumnes()-1) fila = fila + data[i][j]+",";
                    else fila = fila + data[i][j]+"\n";
                }
                writer.append(fila);
                fila="";                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
                   
    
}

