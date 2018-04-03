import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
import java.util.*;
public class Gui extends JFrame
{
	JTQ1 J1=new JTQ1();
	//加载背景图片
	ImageIcon bg = new ImageIcon("384454.jpg");
	//把背景图加入一个标签里
	JLabel la1 = new JLabel(bg);
	//定义显示题目文本框
	JTextField f1=new JTextField();
	JTextField f2=new JTextField();
	JTextField f3=new JTextField();
	JTextField f4=new JTextField();
	JTextField f5=new JTextField();
	JTextField f6=new JTextField();
	JTextField f7=new JTextField();
	JTextField f8=new JTextField();
	JTextField f9=new JTextField();
	JTextField f10=new JTextField();
	JTextField f11=new JTextField();
	JTextField f12=new JTextField();
	JTextField f13=new JTextField();
	JTextField f14=new JTextField();
	JTextField f15=new JTextField();
	JTextField f16=new JTextField();
	JTextField f17=new JTextField();
	JTextField f18=new JTextField();
	JTextField f19=new JTextField();
	JTextField f20=new JTextField();
	JTextField f21=new JTextField();
	//定义输入答案文本框
	JTextField a1=new JTextField();
	JTextField a2=new JTextField();
	JTextField a3=new JTextField();
	JTextField a4=new JTextField();
	JTextField a5=new JTextField();
	JTextField a6=new JTextField();
	JTextField a7=new JTextField();
	JTextField a8=new JTextField();
	JTextField a9=new JTextField();
	JTextField a10=new JTextField();
	JTextField a11=new JTextField();
	JTextField a12=new JTextField();
	JTextField a13=new JTextField();
	JTextField a14=new JTextField();
	JTextField a15=new JTextField();
	JTextField a16=new JTextField();
	JTextField a17=new JTextField();
	JTextField a18=new JTextField();
	JTextField a19=new JTextField();
	JTextField a20=new JTextField();	
	//Lable 变换：
	String La1="得分";
	String La2="计时";
	String La4="下一轮";
	String La5="提交答案";
	String La6="测评";
	String La7="简体中文";
	String La8="繁体中文";
	String La9="英文";
	String La10="整数运算";
	String La11="分数运算";	
	//定义按钮
		JButton BT2=new JButton(La5);//提交按钮
		JButton BT4=new JButton(La6);//测评
		JButton BT5=new JButton(La7);//简体中文
		JButton BT6=new JButton(La8);//繁体中文
		JButton BT7=new JButton(La9);//英文
		JButton BT8=new JButton(La2);//計時
		JButton BT9=new JButton(La10);//整数运算
		JButton BT10=new JButton(La11);//分数运算	
	//定义得分
	JLabel l1=new JLabel(La1);
	JTextField l2=new JTextField();
	JTextField l4=new JTextField();
	JPanel pan1=new JPanel();
	static ArrayList<String>  Grade = new ArrayList<String>();//定义一个得数	
	public Gui()
	{
		
		this.setTitle("四则运算");
		//设置窗体
		this.setSize(600,550);
		this.setLocationRelativeTo(null);//窗体居中显示
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		this.setVisible(true);
		this.setLayout(null);
		
		l1.setBounds(390,10,80,30);
		l2.setBounds(455,10,80,30);
	//	l4.setBounds(100,10,100,30);
		
		
		
		//设置面板
		pan1.setLayout(null);
		pan1.setBounds(0,0,600,550);
		//设置按钮
		BT4.setBounds(50,400,100,50);//测评
		BT2.setBounds(450,400,100,50);
//		BT3.setBounds(310,400,100,50);
//		BT4.setBounds(250,400,100,50);
		
		BT5.setBounds(50,460,100,30);
		BT6.setBounds(250,460,100,30);
		BT7.setBounds(450,460,100,30);
		BT8.setBounds(10,10,80,30);//計時
		BT9.setBounds(110,10,100,30);//整数
		BT10.setBounds(230,10,100,30);//分数
		
		//设置文本框
		
		f1.setBounds(10,45,120,30);
	//	f2.setBounds(10,80,120,30);
		f3.setBounds(10,115,120,30);
		f4.setBounds(10,150,120,30);
		f5.setBounds(10,185,120,30);
		f6.setBounds(10,220,120,30);
		f7.setBounds(10,255,120,30);
		f8.setBounds(10,290,120,30);
		f9.setBounds(10,325,120,30);
		f10.setBounds(10,360,120,30);
		f21.setBounds(10,80,120,30);
		
		f11.setBounds(310,45,120,30);
		f12.setBounds(310,80,120,30);
		f13.setBounds(310,115,120,30);
		f14.setBounds(310,150,120,30);
		f15.setBounds(310,185,120,30);
		f16.setBounds(310,220,120,30);
		f17.setBounds(310,255,120,30);
		f18.setBounds(310,290,120,30);
		f19.setBounds(310,325,120,30);
		f20.setBounds(310,360,120,30);
		
		
		
		a1.setBounds(145,45,80,30);
		a2.setBounds(145,80,80,30);
		a3.setBounds(145,115,80,30);
		a4.setBounds(145,150,80,30);
		a5.setBounds(145,185,80,30);
		a6.setBounds(145,220,80,30);
		a7.setBounds(145,255,80,30);
		a8.setBounds(145,290,80,30);
		a9.setBounds(145,325,80,30);
		a10.setBounds(145,360,80,30);
	
		a11.setBounds(455,45,80,30);
		a12.setBounds(455,80,80,30);
		a13.setBounds(455,115,80,30);
		a14.setBounds(455,150,80,30);
		a15.setBounds(455,185,80,30);
		a16.setBounds(455,220,80,30);
		a17.setBounds(455,255,80,30);
		a18.setBounds(455,290,80,30);
		a19.setBounds(455,325,80,30);
		a20.setBounds(455,360,80,30);
		//背景图设置
		this.getLayeredPane().add(la1,new Integer(Integer.MIN_VALUE));
		la1.setBounds(0, 0, bg.getIconWidth(), bg.getIconHeight());//设置背景图大小
		Container cp=this.getContentPane(); 
		cp.setLayout(new BorderLayout());
		((JPanel)cp).setOpaque(false);
		pan1.setOpaque(false);
			
		//将组件添加到面板
		this.add(pan1);
		pan1.add(l1);
		pan1.add(l2);
		pan1.add(BT8);
		pan1.add(l4);
		
		pan1.add(f1);//加入题目文本框
		pan1.add(f2);
		pan1.add(f21);
		pan1.add(f3);
		pan1.add(f4);
		pan1.add(f5);
		pan1.add(f6);
		pan1.add(f7);
		pan1.add(f8);
		pan1.add(f9);
		pan1.add(f10);
		pan1.add(f11);
		pan1.add(f12);
		pan1.add(f13);
		pan1.add(f14);
		pan1.add(f15);
		pan1.add(f16);
		pan1.add(f17);
		pan1.add(f18);
		pan1.add(f19);
		pan1.add(f20);
		pan1.add(a1);//加入答案文本框
		pan1.add(a2);
		pan1.add(a3);
		pan1.add(a4);
		pan1.add(a5);
		pan1.add(a6);
		pan1.add(a7);
		pan1.add(a8);
		pan1.add(a9);
		pan1.add(a10);
		pan1.add(a11);
		pan1.add(a12);
		pan1.add(a13);
		pan1.add(a14);
		pan1.add(a15);
		pan1.add(a16);
		pan1.add(a17);
		pan1.add(a18);
		pan1.add(a19);
		pan1.add(a20);
		
//		pan1.add(BT1);
		pan1.add(BT2);
//		pan1.add(BT3);
		pan1.add(BT4);
		pan1.add(BT5);
		pan1.add(BT6);
		pan1.add(BT7);
		pan1.add(BT8);
		pan1.add(BT9);
		pan1.add(BT10);
	
		
		
		
		
		//添加监听器	
	//	BT1.addActionListener(J1);
	//	BT1.setActionCommand("S1");
		BT2.addActionListener(J1);
		BT2.setActionCommand("S2");
		
		BT4.addActionListener(J1);
		BT4.setActionCommand("S4");
		BT5.addActionListener(J1);
		BT5.setActionCommand("S5");
		BT6.addActionListener(J1);
		BT6.setActionCommand("S6");
		BT7.addActionListener(J1);
		BT7.setActionCommand("S7");
		BT8.addActionListener(J1);
		BT8.setActionCommand("S8");
		BT9.addActionListener(J1);
		BT9.setActionCommand("S9");
		BT10.addActionListener(J1);
		BT10.setActionCommand("S10");
		
		
	}
	
	//内部类监听
	private class JTQ1 implements ActionListener
    {
	    public void actionPerformed(ActionEvent event)
	   {
	    //	double IN1=Double.parseDouble(Grade1.getText());
			String input = event.getActionCommand();
	//		if(input.equals("S1"))//button1信号
	//		{
				//清空文本框
				
				//
				
		//	}
			if(input.equals("S2"))//提交答案
			{
				String []res = new String[20];
				//获取结果数组
				try {
					
					int i = 1;
					BufferedReader br = new BufferedReader(new FileReader("result1.txt"));
					String nString = br.readLine();
					res[0] = nString;
					System.out.println(res[0]);
					while (nString != null) {
						nString=br.readLine();
			            res[i]= nString;
			            System.out.println(res[i]);
			            i++;
			            
			        }
			        br.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
				
		
				int sum = 0;
				//获取答案内容
				if(a1.getText().equals(res[0]))
				{
					sum += 5;	
					System.out.println(sum);
				}
				if(a2.getText().equals(res[1]))
					sum += 5;

				if(a3.getText().equals(res[2]))
					sum += 5;
				if(a4.getText().equals(res[3]))
					sum += 5;
				if(a5.getText().equals(res[4]))
					sum += 5;
				if(a6.getText().equals(res[5]))
					sum += 5;
				if(a7.getText().equals(res[6]))
					sum += 5;
				if(a8.getText().equals(res[7]))
					sum += 5;
				if(a9.getText().equals(res[8]))
					sum += 5;
				if(a10.getText().equals(res[9]))
					sum += 5;
				if(a11.getText().equals(res[10]))
					sum += 5;
				if(a12.getText().equals(res[11]))
					sum += 5;
				if(a13.getText().equals(res[12]))
					sum += 5;
				if(a14.getText().equals(res[13]))
					sum += 5;
				if(a15.getText().equals(res[14]))
					sum += 5;
				if(a16.getText().equals(res[15]))
					sum += 5;
				if(a17.getText().equals(res[16]))
					sum += 5;
				if(a18.getText().equals(res[17]))
					sum += 5;
				if(a19.getText().equals(res[18]))
					sum += 5;
				if(a20.getText().equals(res[19]))
					sum += 5;
			//	System.out.println(sum);
				String sco = sum + "";
				l2.setText(sco);
				
				Grade.add(sco);
						
			}
			if(input.equals("S3"))
			{
				f1.setText(null);
				f2.setText(null);
			}
			if(input.equals("S4"))//测评
			{			
				setVisible(false); 
    			BarGraph SS = new BarGraph(Grade);
    			JFrame jf=new JFrame();
    			jf.setTitle("静态柱状图");
    			jf.add(SS); 
    			jf.setVisible(true);
    			int len = Grade.size();
    			jf.setSize( 30*len+50,700);
    			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    			jf.setResizable(false);
			}
			if(input.equals("S5"))
			{
				La1="得分";
				La2="计时";
				La4="下一轮";
				La5="提交答案";
				La6="测评";
				La7="简体中文";
				La8="繁体中文";
				La9="英文";
				La10="整数运算";
				La11="分数运算";
				
				l1.setText(La1);
				
	//			BT1.setText(La4);
				BT4.setText(La6);
				BT2.setText(La5);
				BT5.setText(La7);
				BT6.setText(La8);
				BT7.setText(La9);
				BT8.setText(La2);
				BT9.setText(La10);
				BT10.setText(La11);
			}	
			if(input.equals("S6"))//繁体中文
			{
				La1="得分";
				La2="計時";
				La4="下一輪";
				La5="提交答案";
				La6="測評";
				La7="簡體中文";
				La8="繁體中文";
				La9="英文";
				La10="整數運算";
				La11="分數運算";
				
				l1.setText(La1);
				
		//		BT1.setText(La4);
				BT4.setText(La6);
				BT2.setText(La5);
				BT5.setText(La7);
				BT6.setText(La8);
				BT7.setText(La9);
				BT8.setText(La2);
				BT9.setText(La10);
				BT10.setText(La11);
				
			}	
			if(input.equals("S7"))
			{
				La1="Grade";
				La2="Time";
				La4="Next Turn";
				La5="Submit";
				La6="Measurement";
				La7="Simplified Chinese";
				La8="Traditional Chinese";
				La9="English";
				La10="Integer arithmetic";
				La11="Fraction arithmetic";
		
				l1.setText(La1);
				
		//		BT1.setText(La4);
				BT4.setText(La6);
				BT2.setText(La5);
				BT5.setText(La7);
				BT6.setText(La8);
				BT7.setText(La9);
				BT8.setText(La2);
				BT9.setText(La10);
				BT10.setText(La11);
				
			}	
			if(input.equals("S8"))//計時功能
			{
				Time frame2= new Time("计时器");
				frame2.pack();
				frame2.setVisible(true);

			}
			if(input.equals("S9"))//整数运算
			{
				Arithmetic ar = new Arithmetic();
				String  str1 = ar.getString() ;
				String  str2 = ar.getString() ;
				String  str3 = ar.getString() ;
				String  str4 = ar.getString() ;
				String  str5 = ar.getString() ;
				String  str6 = ar.getString() ;
				String  str7 = ar.getString() ;
				String  str8 = ar.getString() ;
				String  str9 = ar.getString() ;
				String  str10 = ar.getString() ;
				String  str11 = ar.getString();
				String  str12 = ar.getString() ;
				String  str13 = ar.getString();
				String  str14 = ar.getString() ;
				String  str15 = ar.getString() ;
				String  str16 = ar.getString() ;
				String  str17 = ar.getString() ;
				String  str18 = ar.getString() ;
				String  str19 = ar.getString() ;
				String  str20 = ar.getString() ;
				
				f1.setText(str1);
		//		f2.setText(str2);
				f21.setText(str2);
				f3.setText(str3);
				f4.setText(str4);
				f5.setText(str5);
				f6.setText(str6);
				f7.setText(str7);
				f8.setText(str8);
				f9.setText(str9);
				f10.setText(str10);
				f11.setText(str11);
				f12.setText(str12);
				f13.setText(str13);
				f14.setText(str14);
				f15.setText(str15);
				f16.setText(str16);
				f17.setText(str17);
				f18.setText(str18);
				f19.setText(str19);
				f20.setText(str20);
			
				String result1 = ar.dealEquation(ar.toSuffix(str1));
				String result2 = ar.dealEquation(ar.toSuffix(str2));
				String result3 = ar.dealEquation(ar.toSuffix(str3));
				String result4 = ar.dealEquation(ar.toSuffix(str4));
				String result5 = ar.dealEquation(ar.toSuffix(str5));
				String result6 = ar.dealEquation(ar.toSuffix(str6));
				String result7 = ar.dealEquation(ar.toSuffix(str7));
				String result8 = ar.dealEquation(ar.toSuffix(str8));
				String result9 = ar.dealEquation(ar.toSuffix(str9));
				String result10 = ar.dealEquation(ar.toSuffix(str10));
				String result11 = ar.dealEquation(ar.toSuffix(str11));
				String result12 = ar.dealEquation(ar.toSuffix(str12));
				String result13 = ar.dealEquation(ar.toSuffix(str13));
				String result14 = ar.dealEquation(ar.toSuffix(str14));
				String result15 = ar.dealEquation(ar.toSuffix(str15));
				String result16 = ar.dealEquation(ar.toSuffix(str16));
				String result17 = ar.dealEquation(ar.toSuffix(str17));
				String result18 = ar.dealEquation(ar.toSuffix(str18));
				String result19 = ar.dealEquation(ar.toSuffix(str19));
				String result20 = ar.dealEquation(ar.toSuffix(str20));
				
				try {
					BufferedWriter bw = new BufferedWriter(new FileWriter("result.txt"));
					
					if(result1!=null){
							 bw.write(str1 + "=" + result1);
							 bw.newLine();			
					}
					if(result2!=null){
							 bw.write(str2 + "=" + result2);
							
							 bw.newLine();			
					}
					if(result3!=null){
						 bw.write(str3 + "=" + result3);
						 bw.newLine();			
					}
					if(result4!=null){
						 bw.write(str4 + "=" + result4);
						 bw.newLine();			
					}
					if(result5!=null){
						 bw.write(str5 + "=" + result5);
						 bw.newLine();			
					}
					if(result6!=null){
						 bw.write(str6 + "=" + result6);
						 bw.newLine();			
					}
					if(result7!=null){
						 bw.write(str7 + "=" + result7);
						 bw.newLine();			
				}
				if(result8!=null){
						 bw.write(str8 + "=" + result8);
						 bw.newLine();			
				}
				if(result9!=null){
					 bw.write(str9 + "=" + result9);
					 bw.newLine();			
				}
				if(result10!=null){
					 bw.write(str10 + "=" + result10);
					 bw.newLine();			
				}
				if(result11!=null){
					 bw.write(str11 + "=" + result11);
					 bw.newLine();			
				}
				if(result12!=null){
					 bw.write(str12 + "=" + result12);
					 bw.newLine();			
				}
				if(result13!=null){
					 bw.write(str13 + "=" + result13);
					 bw.newLine();			
			}
			if(result14!=null){
					 bw.write(str14 + "=" + result14);
					 bw.newLine();			
			}
			if(result15!=null){
				 bw.write(str15 + "=" + result15);
				 bw.newLine();			
			}
			if(result16!=null){
				 bw.write(str16 + "=" + result16);
				 bw.newLine();			
			}
			if(result17!=null){
				 bw.write(str17 + "=" + result17);
				 bw.newLine();			
			}
			if(result18!=null){
				 bw.write(str18 + "=" + result18);
				 bw.newLine();			
			}
			if(result19!=null){
				 bw.write(str19 + "=" + result19);
				 bw.newLine();			
			}
			if(result20!=null){
				 bw.write(str20 + "=" + result20);
				 bw.newLine();			
			}
									
			bw.close();			
		} 
		catch (IOException e) {					
					e.printStackTrace();
		}
		
				
				try {
					BufferedWriter bw = new BufferedWriter(new FileWriter("result1.txt"));
					
					if(result1!=null){
							 bw.write(result1);
							 bw.newLine();			
					}
					if(result2!=null){
							 bw.write(result2);
							
							 bw.newLine();			
					}
					if(result3!=null){
						 bw.write(result3);
						 bw.newLine();			
					}
					if(result4!=null){
						 bw.write(result4);
						 bw.newLine();			
					}
					if(result5!=null){
						 bw.write(result5);
						 bw.newLine();			
					}
					if(result6!=null){
						 bw.write(result6);
						 bw.newLine();			
					}
					if(result7!=null){
						 bw.write(result7);
						 bw.newLine();			
				}
				if(result8!=null){
						 bw.write(result8);
						 bw.newLine();			
				}
				if(result9!=null){
					 bw.write(result9);
					 bw.newLine();			
				}
				if(result10!=null){
					 bw.write(result10);
					 bw.newLine();			
				}
				if(result11!=null){
					 bw.write(result11);
					 bw.newLine();			
				}
				if(result12!=null){
					 bw.write(result12);
					 bw.newLine();			
				}
				if(result13!=null){
					 bw.write( result13);
					 bw.newLine();			
			}
			if(result14!=null){
					 bw.write(result14);
					 bw.newLine();			
			}
			if(result15!=null){
				 bw.write(result15);
				 bw.newLine();			
			}
			if(result16!=null){
				 bw.write(result16);
				 bw.newLine();			
			}
			if(result17!=null){
				 bw.write(result17);
				 bw.newLine();			
			}
			if(result18!=null){
				 bw.write(result18);
				 bw.newLine();			
			}
			if(result19!=null){
				 bw.write(result19);
				 bw.newLine();			
			}
			if(result20!=null){
				 bw.write( result20);
				 bw.newLine();			
			}
									
			bw.close();			
		} 
		catch (IOException e) {					
					e.printStackTrace();
		}
				a1.setText("");
				a2.setText("");
				a3.setText("");
				a4.setText("");
				a5.setText("");
				a6.setText("");
				a7.setText("");
				a8.setText("");
				a9.setText("");
				a10.setText("");
				a11.setText("");
				a12.setText("");
				a13.setText("");
				a14.setText("");
				a15.setText("");
				a16.setText("");
				a17.setText("");
				a18.setText("");
				a19.setText("");
				a20.setText("");
				l2.setText("");
	}
	if(input.equals("S10"))//分数运算{
		f1.setText(null);
		f2.setText(null);
	}
	  }
    }		

