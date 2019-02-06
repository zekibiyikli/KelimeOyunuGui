import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class Main {
	
	static JFrame frame;
	static JPanel panel;
	static JLabel kelime,scorel,alýnabilecekpuanl,sorul;
	static char[] kelimechart;
	static JButton tahmin,harfal,restart;
	static int seviye=0,score=0,alýnabilecekpuan=0;
	static String kelimes,soru;
	public static String[] seviye1=Words.level1();
	public static String[] seviye2=Words.level2();
	public static String[] seviye3=Words.level3();
	public static String[] seviye4=Words.level4();
	public static String[] seviye5=Words.level5();
	public static String[] seviye1soru=Words.level1soru();
	public static String[] seviye2soru=Words.level2soru();
	public static String[] seviye3soru=Words.level3soru();
	public static String[] seviye4soru=Words.level4soru();
	public static String[] seviye5soru=Words.level5soru();
	static JTextField tahmintf;
	static Random random=new Random();
	static String[] deger= {"","","","","","","","","",""};
	static int degervalue=0;

	public static void main(String[] args) {
		KelimeAl();
	}
	
	public static void MainScreen() {
		frame=new JFrame("Tabu");
		frame.setSize(600, 600);//frame boyutunu ayarlama
		frame.setVisible(true);//frame gosterme
		frame.setResizable(true);//framein boyutunu ayarlamayý negelliyor
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//frame kapattýktan sonra arkada çalýþmayý durduruyor
		
		panel=new JPanel();
		panel.setSize(600,600);
		panel.setLocation(0, 0);
		panel.setLayout(null);
		
		if(seviye==0 || seviye==1) {
			kelime=new JLabel(""+kelimechart[0]+kelimechart[1]+kelimechart[2]+kelimechart[3]+kelimechart[4]+kelimechart[5]);
			kelime.setSize(100,200);
			kelime.setLocation(200,200);
			panel.add(kelime);
		}
		else if(seviye==2 || seviye==3) {
			kelime=new JLabel(""+kelimechart[0]+kelimechart[1]+kelimechart[2]+kelimechart[3]+kelimechart[4]+kelimechart[5]+kelimechart[6]);
			kelime.setSize(100,200);
			kelime.setLocation(200,200);
			panel.add(kelime);
		}
		else if(seviye==4 || seviye==5) {
			kelime=new JLabel(""+kelimechart[0]+kelimechart[1]+kelimechart[2]+kelimechart[3]+kelimechart[4]+kelimechart[5]+kelimechart[6]+kelimechart[7]);
			kelime.setSize(100,200);
			kelime.setLocation(200,200);
			panel.add(kelime);
		}
		else if(seviye==6 || seviye==7) {
			kelime=new JLabel(""+kelimechart[0]+kelimechart[1]+kelimechart[2]+kelimechart[3]+kelimechart[4]+kelimechart[5]+kelimechart[6]+kelimechart[7]+kelimechart[8]);
			kelime.setSize(100,200);
			kelime.setLocation(200,200);
			panel.add(kelime);
		}
		else if(seviye==8 || seviye==9) {
			kelime=new JLabel(""+kelimechart[0]+kelimechart[1]+kelimechart[2]+kelimechart[3]+kelimechart[4]+kelimechart[5]+kelimechart[6]+kelimechart[7]+kelimechart[8]+kelimechart[9]);
			kelime.setSize(100,200);
			kelime.setLocation(200,200);
			panel.add(kelime);
		}
		
		sorul=new JLabel(soru);
		sorul.setSize(400,150);
		sorul.setLocation(200,200);
		panel.add(sorul);
		
		tahmintf=new JTextField();
		tahmintf.setSize(100,30);
		tahmintf.setLocation(50,450);
		panel.add(tahmintf);
		
		tahmin=new JButton("Tahmin Et");
		tahmin.setSize(200, 45);
		tahmin.setLocation(200,450);
		tahmin.addActionListener(new Action());
		panel.add(tahmin);
		
		if(alýnabilecekpuan==0) {
			harfal=new JButton("Sonraki");
			harfal.setSize(200, 45);
			harfal.setLocation(200,400);
			harfal.addActionListener(new Action());
			panel.add(harfal);
		}
		else {
			harfal=new JButton("Harf Al");
			harfal.setSize(200, 45);
			harfal.setLocation(200,400);
			harfal.addActionListener(new Action());
			panel.add(harfal);
		}
		
		
		scorel=new JLabel("Score: "+score);
		scorel.setSize(150,50);
		scorel.setLocation(100,100);
		panel.add(scorel);
		
		alýnabilecekpuanl=new JLabel("Alýnabilecek Puan: "+alýnabilecekpuan);
		alýnabilecekpuanl.setSize(150,50);
		alýnabilecekpuanl.setLocation(100,150);
		panel.add(alýnabilecekpuanl);
		
		frame.add(panel);
		frame.repaint();
	}
	
	public static void KelimeAl(){
		
		if(seviye==0 || seviye==1) {
			kelimechart=new char[6];
			int randnum=random.nextInt(seviye1.length);
			kelimes=seviye1[randnum];
			soru=seviye1soru[randnum];
			for(int i=0;i<=5;i++) {
				kelimechart[i]='-';
			}
			alýnabilecekpuan=60;
		}
		else if(seviye==2 || seviye==3) {
			kelimechart=new char[7];
			int randnum=random.nextInt(seviye2.length);
			kelimes=seviye2[randnum];
			soru=seviye2soru[randnum];
			for(int i=0;i<=6;i++) {
				kelimechart[i]='-';
			}
			alýnabilecekpuan=70;

		}
		else if(seviye==4 || seviye==5) {
			kelimechart=new char[8];
			int randnum=random.nextInt(seviye3.length);
			kelimes=seviye3[randnum];
			soru=seviye3soru[randnum];
			for(int i=0;i<=7;i++) {
				kelimechart[i]='-';
			}
			alýnabilecekpuan=80;

		}
		else if(seviye==6 || seviye==7) {
			kelimechart=new char[9];
			int randnum=random.nextInt(seviye4.length);
			kelimes=seviye4[randnum];
			soru=seviye4soru[randnum];
			for(int i=0;i<=8;i++) {
				kelimechart[i]='-';
			}
			alýnabilecekpuan=90;

		}
		else if(seviye==8 || seviye==9) {
			kelimechart=new char[10];
			int randnum=random.nextInt(seviye5.length);
			kelimes=seviye5[randnum];
			soru=seviye5soru[randnum];
			for(int i=0;i<=9;i++) {
				kelimechart[i]='-';
			}
			alýnabilecekpuan=100;

		}
		
		MainScreen();
	}
	
	public static void Finish(){
		frame=new JFrame("Tabu");
		frame.setSize(600, 600);//frame boyutunu ayarlama
		frame.setVisible(true);//frame gosterme
		frame.setResizable(true);//framein boyutunu ayarlamayý negelliyor
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//frame kapattýktan sonra arkada çalýþmayý durduruyor
		
		panel=new JPanel();
		panel.setSize(600,600);
		panel.setLocation(0, 0);
		panel.setLayout(null);
		
		restart=new JButton("Tekrar");
		restart.setSize(200, 45);
		restart.setLocation(200,300);
		restart.addActionListener(new Action());
		panel.add(restart);
		
		scorel=new JLabel("Score: "+score);
		scorel.setSize(75,50);
		scorel.setLocation(200,10);
		panel.add(scorel);
		
		frame.add(panel);
		frame.repaint();
	}
	
	static void aa() {
		int randnum=random.nextInt(kelimechart.length);
		int durum=0;
		String randnum2=Integer.toString(randnum);
		System.out.println(randnum2);
		for(int i=0;i<degervalue+1;i++) {
			if(deger[i].equals(randnum2)) {
				durum=1;
			}
		}
		if(durum==1) {			
			System.out.println(randnum);
			for(int i=0;i<deger.length;i++) {
				System.out.print("*"+deger[i]+"-");
			}
			System.out.println();
			aa();
		}else {
			kelimechart[randnum]=kelimes.charAt(randnum);
			alýnabilecekpuan=alýnabilecekpuan-10;
			deger[degervalue]=randnum2;
			degervalue++;
			for(int i=0;i<deger.length;i++) {
				System.out.print(deger[i]+"-");
			}
			System.out.println();
			frame.dispose();
			MainScreen();
		}
		
	}
	
	static class Action implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==harfal){
				if(alýnabilecekpuan!=0) {
					aa();
				}
				else {
					if(seviye!=9) {
						if(alýnabilecekpuan==0) {
							score=score+(alýnabilecekpuan);
						}
						else {
							score=score+(alýnabilecekpuan-10);
						}
						for(int i=0;i<deger.length;i++) {
							deger[i]="";
						}
						degervalue=0;
						frame.dispose();
						seviye++;
						KelimeAl();
					}
					else {
						score=score+(alýnabilecekpuan-10);
						frame.dispose();
						Finish();
					}
				}
			}
			else if(e.getSource()==tahmin) {
				String inkelime=tahmintf.getText().toUpperCase();
				System.out.println(kelimes+"-"+inkelime);
				if(inkelime.equals(kelimes)) {
					score=score+alýnabilecekpuan;
					if(seviye!=9) {
						seviye++;
						for(int i=0;i<deger.length;i++) {
							deger[i]="";
						}
						degervalue=0;
						frame.dispose();
						KelimeAl();
					}
					else {
						frame.dispose();
						Finish();
					}
				}
			}
			else if(e.getSource()==restart) {
				seviye=0;
				alýnabilecekpuan=0;
				score=0;
				for(int i=0;i<deger.length;i++) {
					deger[i]="";
				}
				degervalue=0;
				kelimes="";
				frame.dispose();
				KelimeAl();
			}
		}
	}

}
