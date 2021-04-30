import java.awt.event.*;
import javax.swing.*; 
import java.awt.*; 
import javax.swing.Timer;

public class Gameplay extends JPanel implements KeyListener, ActionListener {
	private boolean play = false;
	private int score = 0;
	private int totalBricks;
	private Timer timer;
	private int delay=8;
	private int playerX = 310;
	private int ballposX = 120;
	private int ballposY = 350;
	private int ballXdir = 1;
	private int ballYdir = -2;
	
	private MapGenerator map;
	
	public Gameplay() {		
		int x,y;
		x = (int) (Math.random()*25 + 1);
		y = (int) (Math.random()*15 + 5);
		totalBricks = x*y;
		map = new MapGenerator(x,y);
		addKeyListener(this); 
		setFocusable(true);
        timer=new Timer(delay,this);
		timer.start();
	}
	
	public void paint(Graphics g) {    		
		// tło
		g.setColor(Color.black);
		g.fillRect(1, 1, 692, 592);
		
		map.draw((Graphics2D) g);
		
		// krawedzie
		g.setColor(Color.red);
		g.fillRect(0, 0, 3, 592); // lewo
		g.fillRect(0, 0, 690, 3); // gora
		g.fillRect(681, 0, 3, 592); // prawo
		
		// wynik		
		g.setColor(Color.green);
		g.setFont(new Font("serif",Font.BOLD, 25));
		g.drawString(""+score, 590,30);
		
		// gracz
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(playerX, 550, 100, 8);
		
		// pilka
		g.setColor(Color.red);
		g.fillOval(ballposX, ballposY, 20, 20);
	
		// wygranie gry
		if(totalBricks <= 0) {
			 play = false;
             ballXdir = 0;
     		 ballYdir = 0;
             g.setColor(Color.yellow);
             g.setFont(new Font("serif",Font.BOLD, 30));
             g.drawString("Wygrałeś!!! Twój wynik: "+score, 200,300);
             
             g.setColor(Color.white);
             g.setFont(new Font("serif",Font.BOLD, 20));           
             g.drawString("Wciśnij ENTER jeśli chcesz zagrać jeszcze raz.", 165,350);  
		}
		
		// przegranie gry
		if(ballposY > 570) {
			 play = false;
             ballXdir = 0;
     		 ballYdir = 0;
             g.setColor(Color.RED);
             g.setFont(new Font("serif",Font.BOLD, 30));
             g.drawString("Przegrałeś :( Twój wynik: "+score, 195,300);
             
             g.setColor(Color.white);
             g.setFont(new Font("serif",Font.BOLD, 20));           
             g.drawString("Wciśnij ENTER jeśli chcesz zagrać jeszcze raz.", 165,350);        
        }
		
		g.dispose();
	}	

	public void keyPressed(KeyEvent e) {
		// zczytanie wcisnietego przycisku
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {        
			if(playerX >= 600) {
				playerX = 600;
			}
			else {
				moveRight();
			}
        }
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {          
			if(playerX < 10) {
				playerX = 10;
			}
			else {
				moveLeft();
			}
        }		
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {          
			if(!play) {
				//ponowna gra
				int x,y;
				x = (int) (Math.random()*25 + 1);
				y = (int) (Math.random()*15 + 5);
				play = true;
				ballposX = 120;
				ballposY = 350;
				ballXdir = 1;
				ballYdir = -2;
				playerX = 310;
				score = 0;
				totalBricks = x*y;
				map = new MapGenerator(x, y);
				
				repaint();
			}
        }		
	}

	// poruszanie graczem w prawo
	public void moveRight() {
		play = true;
		playerX+=20;	
	}
	// poruszanie graczem w lewo
	public void moveLeft() {
		play = true;
		playerX-=20;	 	
	}
	// rozgrywka
	public void actionPerformed(ActionEvent e) {
		
		if(play) {	
			// odbicie pilki od paska gracza
			//odbicie od lewej		
			if(new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerX, 550, 30, 8))) {
				ballYdir = -ballYdir;
				ballXdir = -2;
			}
			// odbicie od prawej
			else if(new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerX + 70, 550, 30, 8))) {
				ballYdir = -ballYdir;
				ballXdir = ballXdir + 1;
			}
			//odbicie od srodka
			else if(new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerX + 30, 550, 40, 8))) {
				ballYdir = -ballYdir;
			}
			
					
			A: for(int i = 0; i<map.map.length; i++) {
				for(int j =0; j<map.map[0].length; j++) {				
					if(map.map[i][j] > 0) {
						
						int brickX = j * map.brickWidth + 80;
						int brickY = i * map.brickHeight + 50;
						int brickWidth = map.brickWidth;
						int brickHeight = map.brickHeight;
						
						Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);					
						Rectangle ballRect = new Rectangle(ballposX, ballposY, 20, 20);
						Rectangle brickRect = rect;
						//zliczanie punktow
						if(ballRect.intersects(brickRect)) {					
							map.setBrickValue(0, i, j);
							score+=5;	
							totalBricks--;
							
							// odbicie pilki od bokow bloczkow
							if(ballposX + 19 <= brickRect.x || ballposX + 1 >= brickRect.x + brickRect.width) {
								ballXdir = -ballXdir;
							}
							// odbicie pilki od gory lub dolu bloczka
							else {
								ballYdir = -ballYdir;				
							}
							
							break A;
						}
					}
				}
			}
			// poruszanie sie pilki
			ballposX += ballXdir;
			ballposY += ballYdir;
			
			// odbicie pilki od krawedzi mapy
			if(ballposX < 0) {
				ballXdir = -ballXdir;
			}
			if(ballposY < 0) {
				ballYdir = -ballYdir;
			}
			if(ballposX > 670) {
				ballXdir = -ballXdir;
			}		
			
			repaint();		
		}
	}
}
