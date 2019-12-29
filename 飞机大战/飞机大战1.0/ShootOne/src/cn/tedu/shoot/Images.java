package cn.tedu.shoot;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/*
 * ����ͼƬ���࣬ʵ���˽����������ͼƬ���ص�������������ÿ�ζ�Ҫȥ��ȡ
 */
public class Images {
	public static BufferedImage sky;
	public static BufferedImage[] bullets;
	public static BufferedImage[] heros;
	public static BufferedImage[] airplanes;
	
	static{
		
		//���ͼƬ�ļ���
		sky = readImage("background1.png");
		
		//Ӣ�ۻ�ͼƬ�ļ���
		heros = new BufferedImage[2];
		heros[0] = readImage("hero0.png");
		heros[1] = readImage("hero1.png");
		
		//�ӵ�ͼƬ�ļ���
		bullets = new BufferedImage[2];
		bullets[0] = readImage("bullet0.png");
		bullets[1] = readImage("bullet1.png");
		
		//С�л�ͼƬ�ļ���
		airplanes = new BufferedImage[5];
		airplanes[0] = readImage("airplane0.png");
		
		//����ͼƬ�ļ���
		for(int i=1;i<5;i++){
			airplanes[i] = readImage("bom"+i+".png");
		}
		
	}
	
	//��ȡͼƬ���ڴ�
	public static BufferedImage readImage(String fileName){
		try{
			BufferedImage img = ImageIO.read(FlyingObject.class.getResource(fileName));
			return img;
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
}
