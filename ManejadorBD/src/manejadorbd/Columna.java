/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadorbd;

import java.util.ArrayList;

/**
 *
 * @author Álvaro
 */
public class Columna {
    private String nombre;
    private String tipo; 
    private ArrayList valores;
    private int charCant ; 

    public int getCharCant() {
		return charCant;
	}


	public void setCharCant(int charCant) {
		this.charCant = charCant;
	}


	public Columna(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        valores= new ArrayList();
    }


    public Columna() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList getValores() {
        return valores;
    }

   
    public void setValor( Object valor) {
        valores.add(valor);
    }
//Cambio en columnas
    public int getTamanio() {
        return valores.size();
    }
    
    
    
    

}
