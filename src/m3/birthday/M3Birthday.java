/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package m3.birthday;

public class M3Birthday {

    
    public static void main(String[] args) {
        int day = 3, month = 6, year= 2001;
        String date = birthday(day, month, year);
        System.out.println("Dia de la semana: " + date);
    }
    
    private static String birthday(int day, int month, int year){
        String[] ArrayWeek = {"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
        int a, y, m, d;
        a = (14 - month) / 12;
        y = year - a;
        m = month + 12 * a - 2;
        d = (day + y + y / 4 - y / 100 + y / 400 + ( 31 * m ) / 12) % 7;
        return ArrayWeek[d];
    }

}
