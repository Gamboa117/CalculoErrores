/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesús
 */
public class ErroresProg {
    private double valorReal;
    private double valorAproximado;
    
    public ErroresProg(double A, double B){
        this.valorReal = A;
        this.valorAproximado = B;
    }
    
    double errorAbsoluto(){
        double Absoluto = Math.abs(valorAproximado - valorReal);
        return Absoluto;
    }
    
    double errorRelativo(){
        double Relativo = (errorAbsoluto())/valorReal;
        return Relativo;
    }
    
    double errorRePorcentual(){
        double RPorcentual = (errorRelativo()) * 100;
        return RPorcentual;
    }
}
