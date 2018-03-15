/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dangnhap;

import javax.swing.JTable;

/**
 *
 * @author Hoangdv
 */
public class Tinhlechtang {

    private int Sotang, Sodiemdo;

    public int getSotang() {
        return Sotang;
    }

    public void setSotang(int Sotang) {
        this.Sotang = Sotang;
    }

    public int getSodiemdo() {
        return Sodiemdo;
    }

    public void setSodiemdo(int Sodiemdo) {
        this.Sodiemdo = Sodiemdo;
    }
    public double[] mangTong, mangHieu, mangLech, Lechtang;

    public Tinhlechtang() {
    }

    public Tinhlechtang(int Sotang, int Sodiemdo) {
        this.Sotang = Sotang;
        this.Sodiemdo = Sodiemdo;
    }

    public double[] Tong(JTable table) {
        mangTong = new double[Sotang * 3 - 1];
        for (int i = 0; i < (Sotang * 3 - 1); i++) {
            double tong = 0;
            for (int j = 0; j < Sodiemdo; j++) {
                tong += Double.parseDouble(table.getValueAt(j, i).toString());
            }
            mangTong[i] = tong;
            //ok
        }
        return mangTong;
    }

    public double[] Hieu() {
        mangHieu = new double[Sotang * 3 - 1];
        for (int i = 2; i < (Sotang * 3 - 1); i++) {
            double tang1 = mangTong[1];
            double tangi = mangTong[i];
            mangHieu[i] = 2 * (tangi - tang1) / Sodiemdo;
        }
        return mangHieu;
    }

    public double[] Lech() {
        mangLech = new double[Sotang * 3 - 1];
        for (int i = 2; i < (Sotang * 3 - 1); i = i + 3) {
            double d1 = mangHieu[i];
            double d2 = mangHieu[i + 1];
            double d3 = mangHieu[i + 2];
            mangLech[i + 1] = (d1 + 2 * d2 + d3) / 4000;
        }
        return mangLech;
    }

    public double[] KqLech() {
        Lechtang = new double[Sotang];
        for (int j = 0; j < Lechtang.length; j++) {
            Lechtang[j] = mangLech[j * 3];
        }
        return Lechtang;
    }

    public static void main(String[] args) {
        Tinhlechtang lech = new Tinhlechtang(3, 10);
//        System.out.println(Arrays.toString(lech.Mangtong()));
    }
}
