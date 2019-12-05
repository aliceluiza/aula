/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

/**
 *
 * @author Visitante7
 */
public class Exemplo {
private int X;
private int y;

    public Exemplo(int X, int y) {
        this.X = X;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Exemplo{" + "X=" + X + ", y=" + y + '}';
    }
    
    

    public int getX() {
        return X;
    }

    public int getY() {
        return y;
    }

    public void setX(int X) {
        this.X = X;
    }

    public void setY(int y) {
        this.y = y;
    }
}




