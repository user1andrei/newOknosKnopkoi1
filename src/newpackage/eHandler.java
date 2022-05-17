

package newpackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

/**
 *
 * @author Большой Босс
 */
   public class eHandler extends okoshko implements ActionListener{
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
                    d3="Прокоат'259'" ;     
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