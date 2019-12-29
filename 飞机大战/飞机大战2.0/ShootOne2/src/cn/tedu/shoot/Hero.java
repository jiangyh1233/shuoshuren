package cn.tedu.shoot;

import java.awt.image.BufferedImage;

/*
 * Ӣ�ۻ��࣬ʵ����Ӣ�ۻ������������ƶ�
 * ���ݻ������䲻ͬ�������ӵ�
 */
public class Hero extends FlyingObject {

	//����ֵ
	private int doubleFire;
	
	Hero(){
		super(46,66,170,400);
		life = 3;
		doubleFire = 10000;
	}
	
	//��������x��y�ƶ�
	public void moveTo(int x,int y){
		this.x = x - this.width/2;
		this.y = y - this.height/2;
	}
	
	//���ݻ����������ϵ��ӵ�����
	public Bullet[] shoot(){
		int xStep = this.width/4;
		int yStep = -20;
		if(doubleFire>1000){
			Bullet[] b = new Bullet[5];
			for(int i=0;i<5;i++){
				b[i] = new Bullet(this.x+i*xStep,y + yStep,"up");
			}
			doubleFire -= 2;
			return b;
		}else if(doubleFire>0){
			Bullet[] b = new Bullet[3];
			for(int i=0;i<3;i++){
				b[i] = new Bullet(this.x+i*2*xStep,y + yStep,"up");
			}
			doubleFire -= 2;
			return b;
		}else{
			Bullet[] b = new Bullet[1];
			b[0] = new Bullet(this.x+2*xStep,this.y+yStep,"up");
			return b;
		}
	}
	
	//����������
	public int getLife(){
		return life;
	}
	
	//���ػ���ֵ
	public int getDoubleFire(){
		return doubleFire;
	}
	
	//��������50
	public void addDoubleFire(){
		doubleFire += 50;
	}
	
	//��������һ
	public void addLife(){
		life++;
	}
	
	//��ջ���ֵ
	public void clearDoubleFire(){
		doubleFire = 0;
	}
	
	public void step() {
	}

	//Ӣ�ۻ�����ʱÿ�η��ز�ͬ��ͼƬʵ��Ӣ�ۻ������
	private int index = 0;
	public BufferedImage getImage() {
		if(isLife()){
			return Images.heros[index++%2];
		}
		return null;
	}

	//Ӣ�ۻ�������Խ����Ϊ
	public boolean outBround() {
		return false;
	}
}
