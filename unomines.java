/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buscamines;

import Teclat.Teclat;

/**
 *
 * @author sofia
 */
public class unomines {

    public static void main(String[] args) {
        char[][] Tvisible = creaTaulerVisible();
        mostrarTaulerVis(Tvisible);
        System.out.println("TAULER VISIBLE");
        int maxmines = (Tvisible.length-1)*(Tvisible[0].length-1);//Per ara deixarem que es puga posar mines a tot el tauler
        int qmines = Teclat.lligInt("Indica la quantitat de mines a posar al tauler: ", 1, maxmines);
        boolean[][] Tmines = creaTaulerMines(Tvisible, qmines);
        System.out.println("TAULER INVISIBLE");
        mostrarTaulerBol(Tmines);
        int posfil = Teclat.lligInt("Fila per a picar", 1, Tmines.length);
        int poscol = Teclat.lligInt("Columna per a picar", 1, Tmines[0].length);
//        boolean existmina = minada(Tmines, posfil, poscol);
    }
    static void mostrarTaulerVis(char [][]tauler){//L'he gastat per a fer probes amb el tauler visible
        for (int i = 0; i < tauler.length; i++) {
            System.out.println("");
            for (int j = 0; j < tauler[0].length; j++) {
                System.out.print(tauler[i][j]+" ");
            }
        }
    }
    static void mostrarTaulerBol(boolean [][]tauler){//L'he gastat per a fer probes amb el tauler invisible
        for (int i = 0; i < tauler.length; i++) {
            System.out.println("");
            for (int j = 0; j < tauler[0].length; j++) {
                System.out.print(tauler[i][j]+" ");
            }
        }
    }
    static char[][] creaTaulerVisible() {
        final int FIL = Teclat.lligInt("Indica la quantitat de files del tauler", 5, 10);//Hem indicat que el límit siga 10 per a poder fer proves
        final int COL = Teclat.lligInt("Indica la quantitat de columnes del tauler", 5, 10);
        char tauVis[][] = new char[FIL + 1][COL + 1];
        char TAPAT = 'X';
        for (int f = 1; f < tauVis.length; f++) {
            for (int c = 1; c < tauVis[0].length; c++) {
                tauVis[f][c] = TAPAT;
            }
        }
        return tauVis;
    }
    static boolean[][] creaTaulerMines(char[][] tauler, int nummines){
        boolean tauMin[][] = new boolean[tauler.length][tauler[0].length];
        for (int m = 1; m <= nummines; m++) {
            int fil = ((int)((Math.random()*(tauler.length)))+1);//Tenim un problema
            int col = ((int)((Math.random()*(tauler[0].length)))+1);
            tauMin[fil][col] = true;
        }
        return tauMin;
    }
//    static boolean minada(boolean[][] tauler,int fil, int col){
//        return tauler[][]
//    }
}
