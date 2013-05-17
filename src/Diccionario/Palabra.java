package Diccionario;

import java.util.ArrayList;
import java.util.HashMap;

public class Palabra {
  private String palabra;
  private HashMap<String,String> traducciones;
  private int contador;

  public Palabra(String palabra, HashMap<String, String> traducciones, int contador) {
    this.palabra = palabra;
    this.traducciones = traducciones;
    this.contador = contador;
  }

  public String getPalabra() {
    return palabra;
  }

  public void setPalabra(String palabra) {
    this.palabra = palabra;
  }

  public HashMap<String, String> getTraducciones() {
    return traducciones;
  }

  public void setTraducciones(HashMap<String, String> traducciones) {
    this.traducciones = traducciones;
  }

  public int getContador() {
    return contador;
  }

  public void setContador(int contador) {
    this.contador = contador;
  }
  
  public void sumarContador(){
    this.contador++;
  }  
}
