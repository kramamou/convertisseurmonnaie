/**
 * Created by Kevn on 02/12/2015.
 */
import javax.swing.*;
import java.awt.*;


public class fenetre extends JFrame {
    JPanel ContentPane;
    BorderLayout borderLayout1 = new BorderLayout();
    JMenuBar jMenuBar1 = new JMenuBar();
    JMenu jMenu1 = new JMenu();
    JMenuItem JMenuItem1 = new JMenuItem();



public fenetre() {
    this.setTitle("Convertisseur de monnaie");
    this.setSize(new Dimension(200,200));
    this.setJMenuBar(jMenuBar1);
    jMenu1.setText("?");
    JMenuItem1.setText("A1");
    jMenuBar1.add(jMenu1);
    jMenu1.add(JMenuItem1);

}

public static void main (String[] args){

    new convertisseur().setVisible(true);
}}