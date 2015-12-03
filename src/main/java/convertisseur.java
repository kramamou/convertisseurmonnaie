/**
 * Created by Kevn on 02/12/2015.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class convertisseur extends JFrame implements ActionListener {
    String[] unt1 = {"Euros", "Dollars", "Rupees"};
    JFrame f = new JFrame("Convertisseur de monnaie");
    JButton btcal = new JButton("Convertir");

    JButton bexit = new JButton("Quitter");
    JPanel p = new JPanel();
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JLabel lblmesu = new JLabel("Mesure");
    JLabel lblunite1 = new JLabel("Unite");
    JLabel lblunite2 = new JLabel("Unite");
    JLabel lblunite3 = new JLabel("Unite");
    JComboBox unite1 = new JComboBox();
    JComboBox unite2 = new JComboBox();
    JComboBox unite3 = new JComboBox();
    JTextField textun1 = new JTextField();
    JTextField textun2 = new JTextField();
    JTextField textun3 = new JTextField();
    JMenuBar jMenuBar1 = new JMenuBar();

    public convertisseur() {
        this.setTitle("Convertisseur");
        this.setSize(new Dimension(550, 350));
        this.setJMenuBar(jMenuBar1);

        this.add(p);
        p.setLayout(new GridLayout(7,1));
        p.add(lblmesu);
        p.add(p1);
        p1.setLayout(new GridLayout(1, 2));
        p1.add(lblunite1);
        p1.add(unite1);
        p.add(textun1);
        p.add(p2);
        p2.setLayout(new GridLayout(1, 2));
        p2.add(lblunite2);
        p2.add(unite2);
        p.add(textun2);
        p3.setLayout(new GridLayout(1, 2));
        p3.add(btcal);
        p3.add(bexit);
        p.add(p3);
        bexit.addActionListener(this);
        btcal.addActionListener(this);
        unite1.addActionListener(this);
        unite2.addActionListener(this);
    }

    WindowAdapter win = new WindowAdapter() {
        @Override
        public void windowClosed(WindowEvent e) {
            System.exit(0);
        }
    };

    {
        this.addWindowListener(win);
    }

    WindowAdapter win1 = new WindowAdapter() {
        public void windowOpened(WindowEvent e) {
            for (int i = 0; i < 3; i++) {
                unite1.addItem(unt1[i]);
                unite2.addItem(unt1[i]);
            }
            ;
        }
    };

    {
        this.addWindowListener(win1);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bexit)
            System.exit(0);
        if (e.getSource() == btcal) {
            double s = Double.valueOf(textun1.getText()).doubleValue();

            if (unite2.getSelectedIndex() == 0) {
                if (unite1.getSelectedIndex() == 1) {
                    s = s / 1.06186;
                    textun2.setText("" + s);
                }
                else if (unite1.getSelectedIndex() == 2) {
                    s = s / 70.6893;
                    textun2.setText("" + s);
                }
            } else if (unite2.getSelectedIndex() == 1) {
                if (unite1.getSelectedIndex() == 0) {
                    s = s * 1.06186;
                    textun2.setText("" + s);
                }
                else if (unite1.getSelectedIndex() == 2) {
                    s = s / 66.5607;
                    textun2.setText("" + s);
                }
            } else if (unite2.getSelectedIndex() == 2) {
                if (unite1.getSelectedIndex() == 0) {
                    s = s * 70.6893;
                    textun2.setText("" + s);
                }
                else if (unite1.getSelectedIndex() == 1) {
                    s = s * 66.5607;
                    textun2.setText("" + s);
                }
            }
        }
    }

}



