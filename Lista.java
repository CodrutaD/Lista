import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Lista extends JFrame {
    private JButton ButonRezultat;
    private JPanel panel;
    private JTextField TfOptiune;
    private JLabel Label1;
    private JLabel Label2;
    private JLabel Label3;
    private JButton Seriale;
    private JButton Jocuri;
    private String StringText;
    private String StringLabel1;
    private String StringLabel2;
    private String StringLabel3;
    private static final Color color = Color.lightGray;
    private boolean gen=false;
    private String denumire;
    private int w,h;
    ArrayList<String> detalii=new ArrayList<String>();

    StringBuffer s=new StringBuffer("Afisare Detalii: ");

    @Override
    public String toString(){
        return s.toString();
    }

    public String getDenumire(){
        return denumire;
    }

    public void setDenumire(String newDenumire){
        this.denumire=newDenumire;
    }

    public Dimension iaDimensiune(){
        Dimension d1= new Dimension(w,h);
        return d1;

    }

    public Lista(int w,int h){
        this.w=w;
        this.h=h;
        Dimension d1=new Dimension(w,h);
    }


    public Lista() {
        Seriale.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label1.setText("Squid Game");
                Label2.setText("Peaky Blinders");
                Label3.setText("Punisher");
                Label1.setVisible(true);
                Label2.setVisible(true);
                Label3.setVisible(true);
                panel.setBackground(Color.PINK);
                gen=false;
            }
        });
        Seriale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Seriale.setBackground(color);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                Seriale.setBackground(Color.GREEN);
            }
        });
        Jocuri.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label1.setText("Mortal Kombat 11");
                Label2.setText("Cyberpunk 2077");
                Label3.setText("Need for speed:Heat");
                panel.setBackground(color);
                gen=true;
            }
        });
        Jocuri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Jocuri.setBackground(color);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                Jocuri.setBackground(Color.GREEN);
            }
        });
        ButonRezultat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringText = TfOptiune.getText();
                StringLabel1 = Label1.getText();
                StringLabel2 = Label2.getText();
                StringLabel3 = Label3.getText();
                if (gen == false) {
                    if (StringText.equals(StringLabel1)) {
                        s.append(StringLabel1);
                        ButonRezultat.setText(s.toString());
                        detalii.clear();
                        detalii.add("Rating:10");
                        detalii.add("Gen:Drama");
                        detalii.add("Numar episoade:9.");
                        JOptionPane.showMessageDialog(null, detalii);
                    } else {
                        if (StringText.equals(StringLabel2)) {
                            s.append(StringLabel2);
                            ButonRezultat.setText(s.toString());
                            detalii.clear();
                            detalii.add("Rating:8");
                            detalii.add("Gen:Drama");
                            detalii.add("Numar episoade:30.");
                            JOptionPane.showMessageDialog(null,  detalii);
                        } else {
                            if (StringText.equals(StringLabel3)) {
                                s.append(StringLabel3);
                                ButonRezultat.setText(s.toString());
                                detalii.clear();
                                detalii.add("Rating:9");
                                detalii.add("Gen:Actiune");
                                detalii.add("Numar episoade:26.");
                                JOptionPane.showMessageDialog(null, detalii);

                            } else {
                                s.append("Optiune incorecta");
                                ButonRezultat.setText(s.toString());
                                JOptionPane.showMessageDialog(null, "Nu se afla in lista", "Warning", JOptionPane.WARNING_MESSAGE);
                            }
                        }
                    }
                }
                else{

                    if (StringText.equals(StringLabel1)) {
                        s.append(StringLabel1);
                        ButonRezultat.setText(s.toString());
                        detalii.clear();
                        detalii.add("Rating:9");
                        detalii.add("Categorie: Fighting");
                        detalii.add("Pret: 224 lei.");
                        JOptionPane.showMessageDialog(null, detalii);
                    } else {
                        if (StringText.equals(StringLabel2)) {
                            s.append(StringLabel1);
                            ButonRezultat.setText(s.toString());
                            detalii.clear();
                            detalii.add("Rating:8");
                            detalii.add("Categorie: Actiune");
                            detalii.add("Pret: 259 lei.");
                            JOptionPane.showMessageDialog(null, detalii);

                        } else {
                            if (StringText.equals(StringLabel3)) {
                                s.append(StringLabel1);
                                ButonRezultat.setText(s.toString());
                                detalii.clear();
                                detalii.add("Rating:9");
                                detalii.add("Categorie: Racing");
                                detalii.add("Pret: 189 lei.");
                                JOptionPane.showMessageDialog(null, detalii);
                            } else {
                                s.append("Optiune incorecta");
                                ButonRezultat.setText(s.toString());
                                JOptionPane.showMessageDialog(null, "Nu se afla in lista", "Warning", JOptionPane.WARNING_MESSAGE);
                            }
                        }
                    }
                }
            }
        });
    }



    public static void main(String[] args) {

        Lista obiect1=new Lista();
        obiect1.setDenumire("Lista");

        Lista obiectConstructor2=new Lista(700,300);
        JFrame frame = new JFrame(obiect1.getDenumire());
        frame.setPreferredSize(obiectConstructor2.iaDimensiune());
        frame.setContentPane(new Lista().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


