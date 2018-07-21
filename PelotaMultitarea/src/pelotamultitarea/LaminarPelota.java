/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelotamultitarea;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.*;
import javax.swing.JPanel;
/**
 *
 * @author dalejwtf
 */
public class LaminarPelota extends JPanel{
    private ArrayList<Pelota>pelotas= new ArrayList<>();
    public void add(Pelota b){
        pelotas.add(b);
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2= (Graphics2D) g;
        for (Pelota pelota : pelotas) {
            g2.fill(pelota.getShape());
        }
    }
}
