import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

 class Calculators1_0  {
	public static void main(String[] args) {
		Frame frame =new Frame("������");
		Panel panel =new Panel();
		panel.add(new TextField(40));
		frame.add(panel,BorderLayout.NORTH);
		Panel gridPanel = new Panel(); //�������
		gridPanel.setLayout(new GridLayout(6,4,3,3)); //������Ϊ���񲼾�
		
		String name[] = {"%","����","ƽ��","1/x","CE","C","X","/","7","8","9","*","4","5","6","-","1","2","3","+","+/-","0",".","="}; 
		for(int i=0;i<name.length;i++)  //��ѭ��������ӵ������
		{
			gridPanel.add(new Button(name[i]));
		}
		
		frame.add(gridPanel,BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
		
		frame.addWindowListener(new WindowAdapter()
				{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
				});
		frame.setVisible(true);
	}
}
