/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareapalabrapalindromo;

/**
 *
 * @author marti
 */
public class TareaPalabraPalindromo {

    public boolean esPalindromo(String palabra) {
    // Primera llamada al método recursivo privado
    return comprobarPalindromo(palabra, 0, palabra.length() - 1);
    
    }
    
    private boolean comprobarPalindromo(String palabra, int inicio, int fin) {
        // 1. Caso base de éxito (se cruzaron o llegaron al medio)
        if (inicio >= fin) {
            return true;
        }   
    
        // 2. Caso base de fallo (las letras son diferentes)
        if (palabra.charAt(inicio) != palabra.charAt(fin)) {
            return false;
        }
    
        // 3. Paso recursivo (acercarnos al centro)
        return comprobarPalindromo(palabra, inicio + 1, fin - 1);
    }
    
}


