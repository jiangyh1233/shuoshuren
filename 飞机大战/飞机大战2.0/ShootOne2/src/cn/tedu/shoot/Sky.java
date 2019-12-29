package cn.tedu.shoot;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

/*
 * �̳�FlyingObject
 */
public class Sky extends FlyingObject {
	//�����ٶ����Ժ�y1���꣬��ΪҪ��֤����ƶ���������һ��ͼƬ���ˣ���һ�Ž�����Ҫ��Ȼ����ֿհ�
	private int speed;
	private int y1;
	
	/*
	 * ��յĹ��췽�����ڻ����������������Ͻǵĵ㣬�����������Ϊ�����ģ���������Ϊ��0��0��
	 * ��յĵĿ�߼ȴ��ڵĿ�ߣ�World.WIDTH��400����World.HEIGHT��700����World����ȷ��
	 */
	Sky(){
		super(World.WIDTH,World.HEIGHT,0,0);
		y1 = -this.height;
		speed = 1;
	}
	
	//��������ƶ���y��y1������speed��ֵ
	public void step() {
		y += speed;
		y1 += speed;
		//��֤��������ͼƬ�߳�������Ƶ����Ϸ�
		if(y>=World.HEIGHT){
			y = -this.height;
		}
		if(y1>=World.HEIGHT){
			y1 = -this.height;
		}
	}

	//���������ͼƬ��һ�������棬һ�������棬��֤����������
	public void paintObject(Graphics g){
		g.drawImage(getImage(), x, y, null);
		g.drawImage(getImage(), x, y1, null);
	}
	
	//��ȡͼƬ
	public BufferedImage getImage() {
		return Images.sky;
	}

	//���û��Խ����Ϊֱ�ӷ���false
	public boolean outBround() {
		return false;
	}

}
