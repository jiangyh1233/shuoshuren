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
	public static BufferedImage[] bossairplanes;
	public static BufferedImage[] heros;
	public static BufferedImage[] airplanes;
	public static BufferedImage[] bigairplanes;
	public static BufferedImage[] bees;
	
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
		
		//boss��ͼƬ�ļ���
		bossairplanes = new BufferedImage[5];
		bossairplanes[0] = readImage("boss.png");
		
		//С�л�ͼƬ�ļ���
		airplanes = new BufferedImage[5];
		airplanes[0] = readImage("airplane0.png");
		
		//��л��ļ���
		bigairplanes = new BufferedImage[5];
		bigairplanes[0] = readImage("bigairplane0.png");
		
		//����ͼƬ�ļ���
		bees = new BufferedImage[5];
		bees[0] = readImage("bee0.png");
		
		//����ͼƬ�ļ���
		for(int i=1;i<5;i++){
			bees[i] = readImage("bom"+i+".png");
			airplanes[i] = readImage("bom"+i+".png");
			bigairplanes[i] = readImage("bom"+i+".png");
			bossairplanes[i] = readImage("bom"+i+".png");
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
