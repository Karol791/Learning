import javax.swing.*;
import java.awt.BorderLayout;

class MainFrame2 extends JFrame
{
    private StartPanel2 startPanel2;
    MainFrame2()
    {
        super("Pojazdy");
        setSize(500,330);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout manager = new BorderLayout();
        setLayout(manager);
        startPanel2 = new StartPanel2();
        add(startPanel2, BorderLayout.CENTER);
        setVisible(true);
    }
}

class StartPanel2 extends JPanel
{
    StartPanel2()
    {
        JLabel typPojazdu = new JLabel("Typ pojazdu");
        JTextField tekst = new JTextField(10);
        add(typPojazdu);
        add(tekst);
    }
}


class Service{


    public static void main(String[] args)
    {
        MainFrame2 okienko = new MainFrame2();
    }
}