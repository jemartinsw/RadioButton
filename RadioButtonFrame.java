import java.awt.Color;
import java.awt.FlowLayout;//
import java.awt.Font;//
import java.awt.event.ItemListener;//
import java.awt.event.ItemEvent;//
import javax.swing.JFrame;//
import javax.swing.JTextField;//
import javax.swing.JRadioButton;//
import javax.swing.ButtonGroup;//

public class RadioButtonFrame extends JFrame //declaração de classe que herda outra classe
{//incio do bloco de código da classe
   private JTextField textField; // conteudo exclusivo da classe (private). declara variavel do tipo textfiel 

   private Font plainFont; // declara variavel do tipo fonte  
   private Font boldFont; // declara variavel do tipo fonte 
   private Font italicFont; // declara variavel do tipo fonte 
   private Font boldItalicFont; // declara variavel do tipo fonte 

   private Color blackColor; // declara variavel do tipo Colore  
   private Color redColor; // declara variavel do tipo Colore 
   private Color blueColor; // declara variavel do tipo Colore 
   private Color yellowColor; // declara variavel do tipo Colore 

   private JRadioButton plainJRadioButton; // 
   private JRadioButton boldJRadioButton; // 
   private JRadioButton italicJRadioButton; // 
   private JRadioButton boldItalicJRadioButton; // 

   private ButtonGroup radioGroup; // organiza botoes. desmarca aoclicar em um botao
   private ButtonGroup colorRadioGroup;

   private JRadioButton blackJRadioButton; // 
   private JRadioButton redJRadioButton; // 
   private JRadioButton blueJRadioButton; // 
   private JRadioButton yellowJRadioButton; 


      public RadioButtonFrame()//construtor publico sem parametro.
   {//inicio do codigo do bloco construtor
      super("RadioButton Test");//titulo superior da janela
      setLayout(new FlowLayout()); //define o layout

      textField = new JTextField("Watch the font style change", 25);// cria novo objeto com parametro texto e tamanho
      add(textField); // adiciona variavel declarada anteriormente no frame

     
      plainJRadioButton = new JRadioButton("Plain", true);// parametro true significa que esta ativo
      boldJRadioButton = new JRadioButton("Bold", false);// parametro false significa que esta desativado
      italicJRadioButton = new JRadioButton("Italic", false);
      boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);
      add(plainJRadioButton); // adiciona no frame
      add(boldJRadioButton); // 
      add(italicJRadioButton); // 
      add(boldItalicJRadioButton); // 

      radioGroup = new ButtonGroup(); // cria objeto buttongroup
      radioGroup.add(plainJRadioButton); // adiciona cada botao
      radioGroup.add(boldJRadioButton); // 
      radioGroup.add(italicJRadioButton); // 
      radioGroup.add(boldItalicJRadioButton); // 

      plainFont = new Font("Serif", Font.PLAIN, 14);// atribui texto, fonte e tamanho das paalavras dos pontos para a variavel
      boldFont = new Font("Serif", Font.BOLD, 14);
      italicFont = new Font("Serif", Font.ITALIC, 14);
      boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
      textField.setFont(plainFont);//sem estilos

      plainJRadioButton.addItemListener(
         new RadioButtonHandler(plainFont));//adiciona novo radiobuttonhandler. itemlistener é um objeto que "escuta o comando"
      boldJRadioButton.addItemListener(
         new RadioButtonHandler(boldFont));
      italicJRadioButton.addItemListener(
         new RadioButtonHandler(italicFont));
      boldItalicJRadioButton.addItemListener(
         new RadioButtonHandler(boldItalicFont));

      blackJRadioButton = new JRadioButton("Black", true);// parametro true significa que esta ativo
      redJRadioButton = new JRadioButton("Red", false);// parametro false significa que esta desativado
      blueJRadioButton = new JRadioButton("Blue", false);
      yellowJRadioButton = new JRadioButton("Yellow", false);
      add(blackJRadioButton); // adiciona no frame
      add(redJRadioButton); // 
      add(blueJRadioButton); // 
      add(yellowJRadioButton); // 

      colorRadioGroup = new ButtonGroup(); // cria objeto buttongroup
      colorRadioGroup.add(blackJRadioButton); // adiciona cada botao
      colorRadioGroup.add(redJRadioButton); // 
      colorRadioGroup.add(blueJRadioButton); // 
      colorRadioGroup.add(yellowJRadioButton); // 

      blackColor = Color.BLACK;// atribui texto, fonte e tamanho das paalavras dos pontos para a variavel
      redColor = Color.RED;
      blueColor = Color.BLUE;
      yellowColor = Color.YELLOW;
      textField.setForeground(blackColor);//sem estilos

      blackJRadioButton.addItemListener(
         new ColorRadioButtonHandler(blackColor));//adiciona novo radiobuttonhandler. itemlistener é um objeto que "escuta o comando"
      redJRadioButton.addItemListener(
         new ColorRadioButtonHandler(redColor));
      blueJRadioButton.addItemListener(
         new ColorRadioButtonHandler(blueColor));
      yellowJRadioButton.addItemListener(
         new ColorRadioButtonHandler(yellowColor));
   } 

   private class ColorRadioButtonHandler implements ItemListener 
   {
      private Color color; // define variavel fonte do tipo fonte

      public ColorRadioButtonHandler(Color c)
      {
         color = c; //
      } 
   
      @Override
      public void itemStateChanged(ItemEvent event)
      {
         textField.setForeground(color); 
      } 
   }

   private class RadioButtonHandler implements ItemListener 
   {
      private Font font; // define variavel fonte do tipo fonte

      public RadioButtonHandler(Font f)
      {
         font = f; //
      } 
   
      @Override
      public void itemStateChanged(ItemEvent event)
      {
         textField.setFont(font); 
      } 
   } 
}
