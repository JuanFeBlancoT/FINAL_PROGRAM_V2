import processing.core.PApplet;
import processing.core.PImage;

public class Player {
	//Atributes
	private int lifes;
	private int row, col, xP, yP;
	private boolean vulnerable=true;
	
	//Relations
	Tile actualTile;
	MapZone refMap;
	Bomb mainBomb;
	private PImage ani1;
	private PImage ani2;
	private PImage ani3;
	private PImage ani4;
	private int dir=2;
	private PImage s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18;
	
	public Player(int row, int col, MapZone refMap) {
		
		this.row=row;
		this.col=col;
		xP=75+(50*row);
		yP=75+(50*col);
		//actualTile=tile;
		this.refMap=refMap;
		mainBomb=new Bomb(row,col, xP, yP, refMap);
		lifes=5;
	}
	public void IPlayerLoad (PApplet app) {
		ani1 = app.loadImage("anakin-01.png");
		ani2 = app.loadImage("anakin-02.png");
		ani3 = app.loadImage("anakin-03.png");
		ani4 = app.loadImage("anakin-04.png");
		s1 = app.loadImage("sable-1.png");
		s2 = app.loadImage("sable-2.png");
		s3 = app.loadImage("sable-3.png");
		s4 = app.loadImage("sable-4.png");
		s5 = app.loadImage("sable-5.png");
		s6 = app.loadImage("sable-6.png");
		s7 = app.loadImage("sable-7.png");
		s8 = app.loadImage("sable-8.png");
		s9 = app.loadImage("sable-9.png");
		s10 = app.loadImage("sable-10.png");
		s11 = app.loadImage("sable-11.png");
		s12 = app.loadImage("sable-12.png");
		s13 = app.loadImage("sable-13.png");
		s14 = app.loadImage("sable-14.png");
		s15 = app.loadImage("sable-15.png");
		s16 = app.loadImage("sable-16.png");
		s17 = app.loadImage("sable-17.png");
		s18 = app.loadImage("sable-18.png");
		
		
	}
	
	
	
	public int getRow() {
		return row;
	}
	
	public int getCol() {
		return col;
	}
	
	public int getX() {
		return xP;
	}
	
	public int getY() {
		return yP;
	}
	
	public Tile getTile() {
		return actualTile;
	}
	
	public void setRow(int x) {
		row=x;
	}
	
	public void setCol(int y) {
		col=y;;
	}
	
	public void setTile(Tile tile) {
		actualTile=tile;
	}
	
	//direccion de imagen
	public void setDir(int dir) {
		this.dir = dir;
	}
	
public void sableStroke(PApplet app) {
	if(app.frameCount>=1&&app.frameCount<4) {
		app.image(s1,xP-25,yP-25,50,50);}
	
	if(app.frameCount>=4&&app.frameCount<7) {
		app.image(s2,xP-25,yP-25,50,50);}
	
	if(app.frameCount>=7 && app.frameCount<10) {
		app.image(s3,xP-25,yP-25,50,50);}
	
	if(app.frameCount>=10 && app.frameCount<13) {
		app.image(s4,xP-25,yP-25,50,50);}
	
	if(app.frameCount>=13 && app.frameCount<16) {
		app.image(s5,xP-25,yP-25,50,50);}
	
	if(app.frameCount>=16 && app.frameCount<19) {
		app.image(s6,xP+25,yP-25,50,50);}
	
	if(app.frameCount>=19 && app.frameCount<21) {
		app.image(s6,xP+25,yP-25,50,50);}
	
	if(app.frameCount>=21 && app.frameCount<24) {
		app.image(s7,xP+25,yP-25,50,50);}
	
	if(app.frameCount>=24 && app.frameCount<27) {
		app.image(s8,xP+25,yP-25,50,50);}
	
	if(app.frameCount>=27 && app.frameCount<30) {
		app.image(s9,xP+25,yP-25,50,50);}
	
	if(app.frameCount>=30 && app.frameCount<33) {
		app.image(s18,xP+25,yP-25,50,50);}
	
	if(app.frameCount>=33 && app.frameCount<36) {
		app.image(s10,xP+25,yP-25,50,50);}
	
	if(app.frameCount>=36 && app.frameCount<39) {
		app.image(s11,xP+25,yP-25,50,50);}
	
	if(app.frameCount>=39 && app.frameCount<42) {
		app.image(s12,xP+25,yP-25,50,50);}
	
	if(app.frameCount>=42 && app.frameCount<45) {
		app.image(s13,xP+25,yP-25,50,50);}
	
	if(app.frameCount>=45 && app.frameCount<48) {
		app.image(s14,xP-25,yP-25,50,50);}
	
	if(app.frameCount>=48 && app.frameCount<51) {
		app.image(s15,xP-25,yP-25,50,50);}
	
	if(app.frameCount>=51 && app.frameCount<55) {
		app.image(s16,xP-25,yP-25,50,50);}
	
	if(app.frameCount>=55 && app.frameCount<60) {
		app.image(s17,xP-25,yP-25,50,50);}
	
	if(app.frameCount  >60) {
		app.frameCount = 0;
	}
		
	}
	
	
	public void pintar(PApplet app) {
		app.fill(0,120,0);
		app.textSize(40);
		app.fill(255);
		app.text("Lifes: "+lifes, 15, 40);
		if(dir== 1) {
		app.image(ani1, xP, yP,50,50);
		}
		if(dir== 2) {
			app.image(ani2, xP, yP,50,50);
			}
		if(dir== 3) {
			app.image(ani4, xP, yP,50,50);
			}
		if(dir== 4) {
			app.image(ani3, xP, yP,50,50);
			}
		
		
	}
	
	public void mover(int direction) {
		int typeT=-1;
		switch(direction) {
		case 1:
			
			if(col!=21) {
				typeT=refMap.getTileType(row,col+1);
				
				dir = 4;
				
				if(typeT==0) {
					col=col+1;
					xP=75+(50*col);
					mainBomb.setCol(col);
				}
			}
			
			
			break;
		case 2:
			
			if(col!=0) {
				typeT=refMap.getTileType(row,col-1);
				
				dir = 3;
				
				if(typeT==0) {
					col=col-1;
					xP=75+(50*col);
					mainBomb.setCol(col);
				}
			}
			
			break;
		case 3:
			
			if(row!=10) {
				typeT=refMap.getTileType(row+1,col);
				
				dir = 1;
				
				if(typeT==0) {
					row=row+1;
					yP=75+(50*row);
					mainBomb.setRow(row);
					
				}
			}
			
				break;
			
			
		case 4:
			
			if(row!=0) {
				typeT=refMap.getTileType(row-1,col);
				
				
				dir = 2;
				if(typeT==0){
					row=row-1;
					yP=75+(50*row);
					mainBomb.setRow(row);
					
				}
				
			}
			
			break;
		}
	}

	public void confirmDamage(int row, int col) {
		
		if((this.row==row-1 && this.col==col)  || (this.row==row+1 && this.col==col) || (this.col==col-1 && this.row==row) || 
			 (this.col==col+1 && this.row==row || (this.row==row && this.col==col))) {
			lifes--;
			
		}
		
	}
	


	public int getLifes() {
		
		return lifes;
	}
	
	public void setLifes(int lifes) {
		this.lifes=lifes;
	}

	public boolean getVulnerable() {
		return vulnerable;
	}
	
	public void setVulnerable(boolean b) {
		vulnerable=b;
		
	}
	
	public void reduceLife(){
		
		if(vulnerable) {
			lifes-=1;
			vulnerable=false;
			
		}
		
	}
	
	
}
