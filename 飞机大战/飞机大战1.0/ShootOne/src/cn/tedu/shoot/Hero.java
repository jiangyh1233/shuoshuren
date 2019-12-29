package cn.tedu.shoot;

import java.awt.image.BufferedImage;

/*
 * Ӣ�ۻ��࣬ʵ����Ӣ�ۻ������������ƶ�
 * ���ݻ������䲻ͬ�������ӵ�
 */
public class Hero extends FlyingObject {

	Hero(){
		super(46,66,170,400);
		life = 3;
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
			Bullet[] b = new Bullet[1];
			b[0] = new Bullet(this.x+2*xStep,this.y+yStep,"up");
			return b;
	}
	
	//����������
	public int getLife(){
		return life;
	}
	
	//��������һ
	public void addLife(){
		life++;
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
