

package newpackage;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.io.BufferedWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.*;

/**
 *
 * @author Большой Босс new версия 6
 */
public class okoshko extends JFrame {
    
     JButton b1,b2;    
    JLabel l1, l2, l3, l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
    JTextField tp,tp1,tp2,tp3,tp4,tp5,tp6;
    double i,i2,i3, k, rastv, smesOtvBaza, otv, baza,g,pr,pr1;    
    String a,b,c,d,d1,d2,d3,d4,d5,s,l;
    eHandler handler = new eHandler();
   
      
    
    public okoshko(){
        
        
        
        
        
     
        JFrame okno = new JFrame("Вычисление V затраченой краски");   //создаем окно
        okno.setLayout(new BorderLayout());
        okno.setBounds(50,50,800,400);  // выставляем размеры и расположение окна
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // обработчик выхода из окна
      
       
        
    
     
  JPanel panel = new JPanel(null);//устанавливаем менеджер расстановки элементов в положение null 
  okno.add(panel, BorderLayout.CENTER);//устанавливаем панель с элементами в центр окна

b1 = new JButton("Вычислить");// создаем кнопку
b1.setBounds(100,300,150,30);//выставляем положение кнопки относительно панели и ее размер
panel.add(b1);//добавляем кнопку на панель

tp = new JTextField("");
tp.setBounds(180,40,80,20);
panel.add(tp);

tp1 = new JTextField("");
tp1.setBounds(180,70,80,20);
panel.add(tp1);


tp2 = new JTextField("");
tp2.setBounds(240,110,80,20);
panel.add(tp2);

tp3 = new JTextField("");
tp3.setBounds(240,140,80,20);
panel.add(tp3);

tp4 = new JTextField("");
tp4.setBounds(390,40,80,20);
panel.add(tp4);

tp5 = new JTextField("");
tp5.setBounds(390,70,80,20);
panel.add(tp5);

l1= new JLabel("Радиус тары в см");
l1.setBounds(20,40,120,20);
panel.add(l1);

l2= new JLabel("Высота краски в см");
l2.setBounds(20,70,120,20);
panel.add(l2);

l3= new JLabel("Пропорция с отвердителем по V");
l3.setBounds(20,110,220,20);
panel.add(l3);

l4= new JLabel("Количество растворителя по V в %");
l4.setBounds(20,140,220,20);
panel.add(l4);

l5= new JLabel("Приготовленно смеси с растворителем");
l5.setBounds(30,10,280,20);
panel.add(l5);

/**
 *
 * Сколько смеси осталось после окраски
 */

b2 = new JButton("Очистить");// создаем кнопку
b2.setBounds(360,300,150,30);//выставляем положение кнопки относительно панели и ее размер
panel.add(b2);//добавляем кнопку на панель



l6= new JLabel("Осталось смеси с растворителем");
l6.setBounds(350,10,280,20);
panel.add(l6);

l7= new JLabel("");
l7.setBounds(40,200,200,20);
panel.add(l7);

l8= new JLabel("");
l8.setBounds(40,220,200,20);
panel.add(l8);

l9= new JLabel("");
l9.setBounds(40,240,200,20);
panel.add(l9);

l10= new JLabel("");
l10.setBounds(320,240,100,20);
panel.add(l10);

l11= new JLabel("");
l11.setBounds(460,200,200,20);
panel.add(l11);

l12= new JLabel("");
l12.setBounds(460,220,200,20);
panel.add(l12);

l13= new JLabel("");
l13.setBounds(460,240,200,20);
panel.add(l13);

l14= new JLabel("");
l14.setBounds(460,180,200,20);
panel.add(l14);

     
     okno.setVisible(true);// делаем окно видимым
      
         b1.addActionListener(handler);
         b2.addActionListener(handler);
      
            }
    

  
   
    
    
     public class eHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            try{
                if(e.getSource()==b1){
                   double i=Double.parseDouble(tp.getText());
                   double k = Double.parseDouble(tp1.getText());
                    i=i*i*3.14*k;                               
                    k=k++;
                    double newDouble = new BigDecimal(i).setScale(3, RoundingMode.UP).doubleValue();//округление до 3 знаков после запятой
                    double i1=Double.parseDouble(tp4.getText());
                    double k1 = Double.parseDouble(tp5.getText());
                    i1=i1*i1*3.14*k1;
                    double newDouble1 = new BigDecimal(i1).setScale(3, RoundingMode.UP).doubleValue();//округление до 3 знаков после запятой
                    a = "Приготовили куб.см :  "+newDouble;
                    b = "Осталось куб.см  :  "+newDouble1;
                   
                    l7.setText(a);
                    l8.setText(b);
                    c = "Затрачено куб.см  :  "+(newDouble-newDouble1);
                    l9.setText(c);               
                        
                                               
                    double i2=Double.parseDouble(tp2.getText()); 
                    double i3=Double.parseDouble(tp3.getText()); 
                    pr = 100;
                    pr1 = pr+i3;
                    g = newDouble-newDouble1;
                    rastv =g/pr1*i3;
                    smesOtvBaza = g-rastv;
                    otv = smesOtvBaza/(i2+1);
                    baza = otv*i2;
                    
                     double newDouble2 = new BigDecimal(baza).setScale(2, RoundingMode.UP).doubleValue();//округление до 2 знаков после запятой
                     d= "База(Компонент А):       "+newDouble2+"мл";
                     l11.setText(d);
                     double newDouble3 = new BigDecimal(otv).setScale(2, RoundingMode.UP).doubleValue();//округление до 2 знаков после запятой
                     d1="Активатор(Компонент В): "+newDouble3+"мл";
                     l12.setText(d1);
                     double newDouble4 = new BigDecimal(rastv).setScale(2, RoundingMode.UP).doubleValue();
                     d2="Растворитель:    "+newDouble4+"мл";
                     l13.setText(d2);
                   
                      if (i2 == 4){
                    d3="Изопур Финиш 80:" ;     
                     l14.setText(d3);
} 
                      else if (i2 == 4.25){
                    d3="Дюропокс ДТМ 70:" ;     
                     l14.setText(d3);
} 
                    else if (i2 == 8){
                    d3="Прокоат '259'" ;     
                     l14.setText(d3);
} 
                     else if (i2 == 3){
                    d3="Прокоат '259'GLOSS" ;     
                     l14.setText(d3);
                     }
                  else {
                    d3="Лакокрасочный материал" ;     
                     l14.setText(d3);
                  }
                      
                      
                      
                      
                }
                        
                        
                if(e.getSource()==b2){
                tp.setText(null);
                tp1.setText(null);
                tp4.setText(null);
                tp5.setText(null);
                l7.setText("");
                l8.setText("");
            }
                
            }catch (NumberFormatException ex){JOptionPane.showMessageDialog(null,"Введите в поле число, если дробное вместо запятой ставьте точку"
                    + "");}
        }

        
        
        
        }
     
     
    
    
 public static void main(String[] args) {  
 okoshko app =new okoshko();
 
 
 
   try {
                       FileWriter file = new FileWriter("data.txt");
     try (BufferedWriter buffer = new BufferedWriter(file)) {
         buffer.write("Я");
         buffer.newLine();
         buffer.write("Знания и усердие!");
     }
}
                      catch (IOException e){
                     System.out.println("Произошла ошибка");}
 
 } 

 
}
