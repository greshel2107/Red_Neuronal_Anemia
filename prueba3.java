import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class prueba3 {

  public static void main(String []args){
    JFrame ventana = new JFrame();
    ventana.setTitle("Red neuronal");
    ventana.setBounds(0, 0, 900, 700);
    ventana.setResizable(false);

    JPanel panel = new JPanel();
    panel.setBounds(0, 0, 700, 700);
    panel.setBackground(new Color(225,149,133));
    panel.setLayout(null);

    JLabel imagen = new JLabel();
    ImageIcon persona= new ImageIcon("imagen4.jpg");
    Icon iconPersona = new ImageIcon(persona.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT));
  
   
    JLabel imagen2 = new JLabel();
    ImageIcon persona2= new ImageIcon("imagen2.png");
    Icon iconPersona2 = new ImageIcon(persona2.getImage().getScaledInstance(150,150, Image.SCALE_DEFAULT));
    imagen2.setIcon(iconPersona2);
    imagen2.setBounds(733, 0, 150, 150);

    JLabel imagen3 = new JLabel();
    ImageIcon persona3= new ImageIcon("imagen5.png");
    Icon iconPersona3 = new ImageIcon(persona3.getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT));



    JLabel titulo1= new JLabel("Ayudemos a prevenir ");
    titulo1.setBounds(300, 40, 450, 60);
    titulo1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 35));
    titulo1.setForeground(Color.BLACK);

    JLabel titulo2= new JLabel("La Anemia ");
    titulo2.setBounds(350, 80, 400, 50);
    titulo2.setFont(new Font("Baskerville Old Face", Font.PLAIN, 35));
    titulo2.setForeground(Color.BLACK);
 
    JLabel titulo3 = new JLabel("Edad: ");
    titulo3.setBounds(35, 260, 300, 30);
    titulo3.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
    titulo3.setForeground(Color.BLACK);
    JTextField entEdad = new JTextField();
    entEdad.setBounds(90, 265, 40, 22);

    JLabel titulo4 = new JLabel("Genero:");
    titulo4.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
    titulo4.setBounds(35, 320, 300, 30);
    titulo4.setForeground(Color.BLACK);
    
    String[] sexos = {"Mujer","Hombre"};
    JComboBox<String> comboSexo = new JComboBox<String>(sexos);
    comboSexo.setBounds(95, 325, 100, 22);

    JLabel titulo5 = new JLabel(" RBC:");
    titulo5.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
    titulo5.setBounds(35, 380, 300, 30);
    titulo5.setForeground(Color.BLACK);
    JTextField text5 = new JTextField();
    text5.setBounds(95, 385, 40, 22);


    JLabel titulo6 = new JLabel("PVC: ");
    titulo6.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
    titulo6.setBounds(360, 260, 300, 30);
    titulo6.setForeground(Color.BLACK);
    JTextField text6 = new JTextField();
    text6.setBounds(415, 265, 40, 22);


    JLabel titulo7 = new JLabel(" MCV:");
    titulo7.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
    titulo7.setBounds(360, 320, 300, 30);
    titulo7.setForeground(Color.BLACK);
    JTextField text7 = new JTextField();
    text7.setBounds(415, 325, 40, 22);


    JLabel titulo8 = new JLabel(" MCH: ");
    titulo8.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
    titulo8.setBounds(620, 380, 300, 30);
    titulo8.setForeground(Color.BLACK); 
    JTextField text8 = new JTextField();
    text8.setBounds(680, 385, 40, 22);

    JLabel titulo9 = new JLabel(" MCHC: ");
    titulo9.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
    titulo9.setBounds(620, 320, 300, 30);
    titulo9.setForeground(Color.BLACK); 
    JTextField text9 = new JTextField();
    text9.setBounds(690, 325, 40, 22);

    JLabel titulo10 = new JLabel(" PLT: ");
    titulo10.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
    titulo10.setBounds(360, 380, 300, 30);
    titulo10.setForeground(Color.BLACK); 
    JTextField text10 = new JTextField();
    text10.setBounds(415, 385, 40, 22);

    JLabel titulo11 = new JLabel(" HGB: ");
    titulo11.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
    titulo11.setBounds(620, 260, 300, 30);
    titulo11.setForeground(Color.BLACK); 
    JTextField text11 = new JTextField();
    text11.setBounds(680, 265, 40, 22);

    JLabel titulo12 = new JLabel(" RESULTADO: ");
    titulo12.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
    titulo12.setBounds(300, 530, 300, 30);
    titulo12.setForeground(Color.BLACK); 

    //Iniciar red neuronal
    JButton btn_Help = new JButton("kedm",iconPersona);
    btn_Help.setBounds(25,0,100,100);
    btn_Help.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          JOptionPane.showMessageDialog(ventana, "Insuficiencia de globulos rojos saludables debido a la falta de hierro en el cuerpo.");
      }
  });
   
    JButton btn_RBC = new JButton("kedm",iconPersona3);
    btn_RBC.setBounds(5,375,30,30);
    btn_RBC.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          JOptionPane.showMessageDialog(ventana, "Recuento de globulos rojos");
      }
  });


  JButton btn_PVC = new JButton("kedm",iconPersona3);
  btn_PVC.setBounds(330,265,30,30);
  btn_PVC.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(ventana, "Volumen de celulas en la sangre ");
    }
});


JButton btn_MCV = new JButton("kedm",iconPersona3);
btn_MCV.setBounds(330,320,30,30);
btn_MCV.addActionListener(new ActionListener() {
  @Override
  public void actionPerformed(ActionEvent e) {
      JOptionPane.showMessageDialog(ventana, "Tamaño promedio de los glóbulos rojos ");
  }
});


JButton btn_PLT = new JButton("kedm",iconPersona3);
btn_PLT.setBounds(330,380,30,30);
btn_PLT.addActionListener(new ActionListener() {
  @Override
  public void actionPerformed(ActionEvent e) {
      JOptionPane.showMessageDialog(ventana, "Volumen de Plaquetas en la sangre ");
  }
});


JButton btn_HGB = new JButton("kedm",iconPersona3);
btn_HGB.setBounds(590,260,30,30);
btn_HGB.addActionListener(new ActionListener() {
  @Override
  public void actionPerformed(ActionEvent e) {
      JOptionPane.showMessageDialog(ventana, "Proteina que trasporta oxigeno a los pulmones ");
  }
});


JButton btn_MCHC = new JButton("kedm",iconPersona3);
btn_MCHC.setBounds(590,380,30,30);
btn_MCHC.addActionListener(new ActionListener() {
  @Override
  public void actionPerformed(ActionEvent e) {
      JOptionPane.showMessageDialog(ventana, "Mide la concentración de hemoglobina en un glóbulo rojo promedio. ");
  }
});


JButton btn_MCH = new JButton("kedm",iconPersona3);
btn_MCH.setBounds(590,320,30,30);
btn_MCH.addActionListener(new ActionListener() {
  @Override
  public void actionPerformed(ActionEvent e) {
      JOptionPane.showMessageDialog(ventana, "Cantidad de hemoglobina en un glóbulo rojo promedio ");
  }
});



    JButton btnAnalizar = new JButton(" Analizar Datos");
    btnAnalizar.setBounds(330,450,200,44);
    btnAnalizar.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
    btnAnalizar.setBackground(Color.WHITE);
    
    JLabel resultado = new JLabel("");
    resultado.setFont(new Font("Baskerville Old Face", Font.PLAIN, 18));
    resultado.setBounds(420, 530, 300, 30);
    resultado .setForeground(Color.BLACK); 
    
    btnAnalizar.addActionListener(event->{
      String[] inputs = {
        entEdad.getText(),
        Integer.toString(comboSexo.getSelectedIndex()),
        text5.getText(),
        text6.getText(),
        text7.getText(),
        text8.getText(),
        text9.getText(),
        text10.getText(),
        text11.getText()
      };      

      System.out.println("hola");


      for(int cont = 0; cont < inputs.length ; cont++){
        if(inputs[cont].length() == 0){
          System.out.println("Hay campos vacios");
          return;
        }
        if(!isNumeric(inputs[cont])){
          System.out.println("Lo valores debe ser numeros");
          return;
        }
      }

      double[] entradas = {
        0,
        Double.parseDouble(entEdad.getText()),
        comboSexo.getSelectedIndex(),
        Double.parseDouble(text5.getText()),
        Double.parseDouble(text6.getText()),
        Double.parseDouble(text7.getText()),
        Double.parseDouble(text8.getText()),
        Double.parseDouble(text9.getText()),
        Double.parseDouble(text10.getText()),
        Double.parseDouble(text11.getText())
      };

      for(int cont = 1; cont < entradas.length ; cont++){
        System.out.println(entradas[cont]);
      }

      int TotalEntradas = 5; // Numero de entradas externas del perceptron
      int TotalSalidas = 1; // Numero de salidas externas del perceptron
      int TotalCapas = 4; // Total capas que tendra el perceptron
      int[] neuronasporcapa = new int[TotalCapas + 1]; // Los indices iniciaran en 1 en esta implementacion
      neuronasporcapa[1] = TotalEntradas; // Entradas externas del perceptron
      neuronasporcapa[2] = 5; // Capa oculta con 8 neuronas
      neuronasporcapa[3] = 5; // Capa oculta con 8 neuronas
      neuronasporcapa[4] = TotalSalidas; // Capa de salida con 1 neurona
      Perceptron objP = new Perceptron(TotalEntradas, TotalSalidas, TotalCapas, neuronasporcapa);
      // Lee los datos de un archivo plano

      double[][][] pesos = LeePesos("Pesos.csv", objP.getW());
      objP.setW(pesos);
      double[][] umbrales = LeeUmbrales("Umbrales.csv", objP.getU());
      objP.setU(umbrales);
      
      int MaximosRegistros = 365;
      double[][] entrada = new double[MaximosRegistros + 1][];
      double[][] salidas = new double[MaximosRegistros + 1][];
      final String urlArchivo = "dataset.csv";
      double[][][] retorno = LeeDatosArchivo(urlArchivo, entrada, salidas);
      entrada = retorno[1];
      salidas = retorno[2];
      
      int ConjuntoEntradas = (int) retorno[0][0][0];
      
      System.out.println("Registros Ingresados: "+ConjuntoEntradas);
  
      // ==================[Normalizar Entradas]=============================
      double[] min = {0 ,11,0,1.36,13.1,55.7,14.7,23.6,10,5};
      double[] max = {0 ,89,1,6.9,52.2,124.1,41.4,42,660,16.2};

      
      for(int i=1; i < 9; i++){
          entradas[i] = (entradas[i] - min[i]) / (max[i] - min[i]);
          System.out.print(entrada[i] + " | ");
      }
      
      //Mostrar Entradas
      System.out.println("Entradas: ");
      for(int i=0; i < entradas.length; i++){
          System.out.print(entradas[i]+" | ");
      }

        //Imgresar a la Red Neuronal
        objP.Procesa(entradas);
        int salida = objP.Resultado();

        if(salida == 1){
          resultado.setText(" Tiene Anemia");
        }else{
          resultado.setText("No Tiene Anemia");
        }

    });



    ventana.add(titulo1);
    ventana.add(titulo2);

    ventana.add(btnAnalizar);
    ventana.add(btn_RBC);
    ventana.add(btn_Help);
    ventana.add(btn_PVC);
    ventana.add(btn_MCH);
    ventana.add(btn_MCHC);
    ventana.add(btn_MCV);
    ventana.add(btn_PLT);
    ventana.add(btn_HGB);







    ventana.add(imagen);
    ventana.add(imagen2);
    ventana.add(imagen3);

    ventana.add(titulo3);
    ventana.add(entEdad);
    ventana.add(titulo4);
    ventana.add(comboSexo);
    ventana.add(titulo5);
    ventana.add(text5);
    ventana.add(titulo6);
    ventana.add(text6);
    ventana.add(titulo7);
    ventana.add(text7);
    ventana.add(titulo8);
    ventana.add(text8);
    ventana.add(titulo9);
    ventana.add(text9);
    ventana.add(titulo10);
    ventana.add(text10);
    ventana.add(titulo11);
    ventana.add(text11);
    ventana.add(titulo12);

    ventana.add(resultado);

    ventana.add(panel);
    ventana.setVisible(true);
  }
  
  private static double[][][] LeeDatosArchivo(String urlArchivo, double[][] entrada, double[][] salida) {
    double[][][] retornar = new double[3][][];
    String archCSV = urlArchivo;
    try {
        BufferedReader lector = new BufferedReader(new FileReader(archCSV));
        String fila = null;
        String[] campos;
        double limValores = 0.0;
        while ((fila = lector.readLine()) != null && limValores < 364) {
            campos = fila.split(";");
            limValores += 1;
            
            entrada[(int) limValores] = new double[] { 
                0, 
                Double.parseDouble(campos[0]),
                Double.parseDouble(campos[1]), Double.parseDouble(campos[2]), Double.parseDouble(campos[3]),
                Double.parseDouble(campos[4]), Double.parseDouble(campos[5]), Double.parseDouble(campos[6]),
                Double.parseDouble(campos[7]), Double.parseDouble(campos[8]), Double.parseDouble(campos[9])
            };
            
            if(campos[9].equals("1")){
                salida[(int)limValores] = new double[] { 0, 1.0 };
            }else{
                salida[(int)limValores] = new double[] { 0, 0.0 };
            }
           
        }

        retornar[0] = new double[][] { { limValores } };
        retornar[1] = entrada;
        retornar[2] = salida;
        lector.close();
        return retornar;
    } catch (Exception e) {
        System.out.println(e);
    }
    return retornar;
}

  private static double[][][] LeePesos(String urlArchivo, double[][][] pesos) {
    String archCSV = urlArchivo;
    try {
        BufferedReader lector1 = new BufferedReader(new FileReader(archCSV));
        String fila = null;
        String[] campos;
        fila = lector1.readLine();
        campos = fila.split(",");
        int l = 0;
        for (int i = 1; i < pesos.length; i++) {
            for (int j = 1; j < pesos[i].length; j++) {
                for (int k = 1; k < pesos[i][j].length; k++) {
                    pesos[i][j][k] = Double.parseDouble(campos[l]);
                    l++;
                }
            }
        }
        lector1.close();
        return pesos;
    } catch (Exception e) {
        System.out.println(e);
    }
    return pesos;
  }

  private static double[][] LeeUmbrales(String urlArchivo, double[][] umbrales) {
    String archCSV = urlArchivo;
    try {
        BufferedReader lector1 = new BufferedReader(new FileReader(archCSV));
        String fila = null;
        String[] campos;
        fila = lector1.readLine();
        campos = fila.split(",");
        int l = 0;
        for (int i = 1; i < umbrales.length; i++) {
            for (int j = 1; j < umbrales[i].length; j++) {
                umbrales[i][j] = Double.parseDouble(campos[l]);
                l++;
            }
        }
        lector1.close();
        return umbrales;
    } catch (Exception e) {
        System.out.println(e);
    }
    return umbrales;
}   

  private static boolean isNumeric(String cadena){
    try {
        Double.parseDouble(cadena);
        return true;
    } catch (NumberFormatException nfe){
        return false;
    }
}
}