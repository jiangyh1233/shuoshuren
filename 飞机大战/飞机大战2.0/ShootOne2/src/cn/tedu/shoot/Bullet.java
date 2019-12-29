package cn.tedu.shoot;

import java.awt.image.BufferedImage;

/*
 * �ӵ��࣬ʵ���ӵ����ƶ�
 */
public class Bullet extends FlyingObject {

	//dirΪ��ͬ���ӵ�ͼƬ��ǣ�0Ϊ���ϣ�1Ϊ����
	private int speed;
	private int dir;
	
	Bullet(int x,int y,String direction){
		super(8,20,x,y);
		if(direction.equals("up")){
			speed = -2;
			dir = 0;
		}else if(direction.equals("down")){
			speed = 3;
			dir = 1;
		}
		
	}
	
	//�ӵ��ƶ�
	public void step() {
		y += speed;
	}
	
	/*
	 * �����ӵ�ͼƬ��Images.bullets[0]�����ϵģ�Images.bullets[1]�����µ�
	 * ��״̬ΪDEADʱ,�ı�״̬ΪREMOVE
	 */
	public BufferedImage getImage() {
		if(isLife()){
			return Images.bullets[dir];
		}else if(isDead()){
			state = REMOVE;
			return null;
		}
		return null;
	}

	//�ж��Ƿ�Խ��
	public boolean outBround() {
		return y<=0 || y>=World.HEIGHT;
	}

}
