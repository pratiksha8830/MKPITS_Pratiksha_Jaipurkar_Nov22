import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JRadioDemo extends JFrame implements ItemListener
{
JRadioButton shirtbut, pantbut, sareebut, brownbut, graybut, creambut ;
public JRadioDemo()
{
Container c = getContentPane();
c.setLayout(new FlowLayout()); // to create Button objects that group checkboxes
ButtonGroup group1 = new ButtonGroup();
ButtonGroup group2 = new ButtonGroup();// first set of radio buttons for clothes selection

shirtbut = new JRadioButton("Shrit");
pantbut = new JRadioButton("Pant");
sareebut = new JRadioButton("Saree");// second set of radio buttons for color selection

brownbut = new JRadioButton("Brown");
graybut = new JRadioButton("Gray");
creambut = new JRadioButton("Cream"); // actually here, checkboxes are conveted into radio buttons

group1.add(shirtbut);// shirtbut, pantbut and sareebut are made into
group1.add(pantbut);// one group by using group1 object of ButtonGroup class
group1.add(sareebut);



group2.add(brownbut); //brownbut, graybut and creambut are make into
group2.add(graybut); //one group using group2 object
group2.add(creambut); //add individual checkboxes to the container


c.add(shirtbut);
c.add(pantbut);
c.add(sareebut);
c.add(brownbut);
c.add(graybut);
c.add(creambut);

//register each checkbox with the listener

shirtbut.addItemListener(this);
pantbut.addItemListener(this);
sareebut.addItemListener(this);
brownbut.addItemListener(this);
graybut.addItemListener(this);
creambut.addItemListener(this);
setTitle("Learning Radio Buttons");
setSize(250,200);  setVisible(true);
}

public void itemStateChanged(ItemEvent e)
{
String name = "",color = ""; //two local varieable
if(shirtbut.isSelected())
name = "Shirt";
else
if(pantbut.isSelected())
name = "Pant";
else
if(sareebut.isSelected())
name = "Saree";

if(brownbut.isSelected())
color = "Brown";
else
if(graybut.isSelected())
color = "Gray";
else
if (creambut.isSelected())
color = "Cream";
else

JOptionPane.showMessageDialog(null,  "you wanted " + name+ " in color " + color, "Selection Application", JOptionPane.INFORMATION_MESSAGE);
}
public static void main (String args[])
{
new  JRadioDemo();
   }
 }










