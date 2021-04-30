import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.event.*;
import java.util.*;

import java.awt.*;

class MainFrame extends JFrame
{
    private StartPanel startPanel;
    private RevenuesPanel revenuesPanel = new RevenuesPanel();
    private ExpensesPanel expensesPanel = new ExpensesPanel();
    private Start start = new Start();
    private Exp exp = new Exp();
    MainFrame() throws IOException
    {
        super("Gdzie wyciekają pieniążki ...");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startPanel = new StartPanel();
        BorderLayout manager = new BorderLayout();
        setLayout(manager);
        setJMenuBar(createMenuBar());
        add(startPanel, manager.CENTER);
        add(revenuesPanel, manager.WEST);
        add(expensesPanel, manager.EAST);
        add(exp,manager.EAST);
        add(start,BorderLayout.PAGE_END);
        setVisible(true);
    }

    private JMenuBar createMenuBar()
    {
        JMenuBar menuBar = new JMenuBar();
        JMenu przychodyMenu = new JMenu("Przychody");
        JMenuItem openRevenuesItem = new JMenuItem("Otwórz DOCHODY");
        openRevenuesItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                startPanel.setVisible(false);
                revenuesPanel.setVisible(true);
                exp.setVisible(true);
                expensesPanel.setVisible(false);
            }
        });
        JMenuItem closeRevenuesItem = new JMenuItem("Zamknij");
        closeRevenuesItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                startPanel.setVisible(true);
                revenuesPanel.setVisible(false);
                expensesPanel.setVisible(false);
                exp.setVisible(false);
            }
        });
        przychodyMenu.add(openRevenuesItem);
        przychodyMenu.add(closeRevenuesItem);
        JMenu wydatkiMenu = new JMenu("Wydatki");
        JMenuItem openExpItem = new JMenuItem("Otwórz WYDATKI");
        openExpItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                startPanel.setVisible(false);
                revenuesPanel.setVisible(false);
                expensesPanel.setVisible(true);
                exp.setVisible(true);
            }
        });
        JMenuItem closeExpItem = new JMenuItem("ZAMKIJ");
        closeExpItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                startPanel.setVisible(true);
                revenuesPanel.setVisible(false);
                expensesPanel.setVisible(false);
                exp.setVisible(false);
            }
        });
        wydatkiMenu.add(openExpItem);
        wydatkiMenu.add(closeExpItem);
        menuBar.add(przychodyMenu);
        menuBar.add(wydatkiMenu);
        return menuBar;

    }
}


class StartPanel extends JPanel
{
    private BufferedImage image;
    StartPanel() throws IOException
    {
        JTextField tekst = new JTextField(15);
        setBorder(BorderFactory.createTitledBorder("Panel powitalny"));
        FlowLayout manager = new FlowLayout();
        setLayout(manager);
        add(tekst, BorderLayout.WEST);
        image= ImageIO.read(new File("swinka.jpg"));
        setVisible(true);
    }

@Override
protected void paintComponent(Graphics g)
{
    super.paintComponent(g);
    g.drawImage(image,0,0,this);
}


}

class RevenuesPanel extends JPanel
{
    RevenuesPanel()
    {
        JTextField tekst = new JTextField(10);
        setBorder(BorderFactory.createTitledBorder("Przychody"));
        FlowLayout manager = new FlowLayout();
        setLayout(manager);
        add(tekst, BorderLayout.WEST);
        setVisible(false);
    }
}

class ExpensesPanel extends JPanel
{
    ExpensesPanel()
    {
        JTextField tekst = new JTextField(15);
        setBorder(BorderFactory.createTitledBorder("Wydatki"));
        FlowLayout manager = new FlowLayout();
        setLayout(manager);
        add(tekst, BorderLayout.WEST);
        setVisible(false);
    }
}

class Start extends JPanel
{
    Start()
    {
        FlowLayout manager = new FlowLayout();
        setLayout(manager);
        JLabel start = new JLabel("Rozpocznij...");
        add(start, BorderLayout.CENTER);
        
    }
}

class Exp extends JPanel
{
    Exp()
    {
        setBorder(BorderFactory.createTitledBorder("Wyniki"));
        JTextArea tekst = new JTextArea(5,20);
        setVisible(false);
    }
}


class Centus
{
    public static void main(String[] args) throws IOException
    {
        MainFrame Ramka = new MainFrame();
    }
}