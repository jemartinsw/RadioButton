import javax.swing.JFrame;//importa biblioteca (pacote)

public class RadioButtonTest//declara exportação da classe radiobuttontest. O nome da classe tem que ter o mesmo nome do arquivo.
{//inicio do codigo da classe
   public static void main(String[] args)//declara o método principal (executor) estático e vazio.
   {//inicio do codigo do método;
      RadioButtonFrame radioButtonFrame = new RadioButtonFrame();//declara um novo objeto radiobuttonframe
      radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//invoca metodo 
      radioButtonFrame.setSize(300, 200); 
      radioButtonFrame.setVisible(true); 
   } 
}
