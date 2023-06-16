import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;


public class Anemia {
    public static void main(String[] args) {
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
        int MaximosRegistros = 365;
        double[][] entrada = new double[MaximosRegistros + 1][];
        double[][] salidas = new double[MaximosRegistros + 1][];
        final String urlArchivo = "dataset.csv";
        double[][][] retorno = LeeDatosArchivo(urlArchivo, entrada, salidas);
        entrada = retorno[1];
        salidas = retorno[2];

        int ConjuntoEntradas = (int) retorno[0][0][0];
        System.out.println("1 " + ConjuntoEntradas);

        /*double[][][] pesos = LeePesos("Pesos.csv", objP.getW());
        objP.setW(pesos);
        double[][] umbrales = LeeUmbrales("Umbrales.csv", objP.getU());
        objP.setU(umbrales);
        */


        double[] min = {0 ,11,0,1.36,13.1,55.7,14.7,23.6,10,5};
        double[] max = {0 ,89,1,6.9,52.2,124.1,41.4,42,660,16.2};

        for(int cont=1; cont < ConjuntoEntradas; cont++){
            for(int i=1; i < 9; i++){
                entrada[cont][i] = (entrada[cont][i] - min[i]) / (max[i] - min[i]);
                System.out.print(entrada[cont][i] + " | ");
            }
            System.out.println(" ");
        }

        /*//normalizar
        double minAge = entrada[1][1], maxAge = entrada[1][1];
        double minSex = entrada[1][2], maxSex = entrada[1][2]; 
        double minRBC = entrada[1][3], maxRBC = entrada[1][3]; 
        double minPVC = entrada[1][4], maxPVC = entrada[1][4]; 
        double minMCV = entrada[1][5], maxMCV = entrada[1][5]; 
        double minMCH = entrada[1][6], maxMCH = entrada[1][6]; 
        double minMCHC = entrada[1][7], maxMCHC = entrada[1][7]; 
        double minPLT = entrada[1][8], maxPLT = entrada[1][8]; 
        double minHGB = entrada[1][9], maxHGB= entrada[1][9]; 
        double minY = salidas[1][1], maxY = salidas[1][1]; 

        for (int cont = 1; cont <= ConjuntoEntradas; cont++) {
            
            //Maximos
            if (entrada[cont][1] > maxAge){  maxAge = entrada[cont][1];}
            if (entrada[cont][2] > maxSex){  maxSex = entrada[cont][2];}
            if (entrada[cont][3] > maxRBC){  maxRBC = entrada[cont][3];}
            if (entrada[cont][4] > maxPVC){  maxPVC = entrada[cont][4];}
            if (entrada[cont][5] > maxMCV){  maxMCV = entrada[cont][5];}
            if (entrada[cont][6] > maxMCH){  maxMCH = entrada[cont][6];}
            if (entrada[cont][7] > maxMCHC){  maxMCHC = entrada[cont][7];}
            if (entrada[cont][8] > maxPLT){  maxPLT = entrada[cont][8];}
            if (entrada[cont][9] > maxHGB){  maxHGB = entrada[cont][9];}

            if (salidas[cont][1] > maxY){  maxY = salidas[cont][1];}

            //Minimo
            if (entrada[cont][1] < minAge){  minAge = entrada[cont][1];}
            if (entrada[cont][2] < minSex){  minSex = entrada[cont][2];}
            if (entrada[cont][3] < minRBC){  minRBC = entrada[cont][3];}
            if (entrada[cont][4] < minPVC){  minPVC = entrada[cont][4];}
            if (entrada[cont][5] < minMCV){  minMCV = entrada[cont][5];}
            if (entrada[cont][6] < minMCH){  minMCH = entrada[cont][6];}
            if (entrada[cont][7] < minMCHC){  minMCHC = entrada[cont][7];}
            if (entrada[cont][8] < minPLT){  minPLT = entrada[cont][8];}
            if (entrada[cont][9] < minHGB){  minHGB = entrada[cont][9];}
            if (salidas[cont][1] < minY){  minY = salidas[cont][1];}
        }

        for (int cont = 1; cont <= ConjuntoEntradas; cont++) {
            entrada[cont][1] = (entrada[cont][1] - minAge) / (maxAge - minAge);
            entrada[cont][2] = (entrada[cont][2] - minSex) / (maxSex - minSex);
            entrada[cont][3] = (entrada[cont][3] - minRBC) / (maxRBC - minRBC);
            entrada[cont][4] = (entrada[cont][4] - minPVC) / (maxPVC - minPVC);
            entrada[cont][5] = (entrada[cont][5] - minMCV) / (maxMCV - minMCV);
            entrada[cont][6] = (entrada[cont][6] - minMCH) / (maxMCH - minMCH);
            entrada[cont][7] = (entrada[cont][7] - minMCHC) / (maxMCHC - minMCHC);
            entrada[cont][8] = (entrada[cont][8] - minPLT) / (maxPLT - minPLT);
            entrada[cont][9] = (entrada[cont][9] - minHGB) / (maxHGB - minHGB);
            salidas[cont][1] = (salidas[cont][1] - minY) / (maxY - minY);
        */
        
    
       //==================[Inicia el proceso de la red neuronal]==============================
       System.out.println("=========[Entrenamiento]=========");
       System.out.println("registros:" + ConjuntoEntradas);


       double alpha = 0.01; // Factor de aprendizaje
       for (int epoca = 1; epoca <= 50000; epoca++) {
           if (epoca % 500 == 0) {
               System.out.println("Iteracion: " + epoca);
           }
           // Importante: Se envía el primer conjunto de entradas-salidas, luego el segundo, tercero y cuarto por cada ciclo de entrenamiento.
           for (int entra = 1; entra <= ConjuntoEntradas; entra++) {
               objP.Procesa(entrada[entra]);
               objP.Entrena(alpha, entrada[entra], salidas[entra]);
           }
       }

       // Mostar Resultados finales
       System.out.println("=========[Resultados]=========");
       int mal = 0;
       for (int entra = 1; entra <= ConjuntoEntradas; entra++) {
           objP.Procesa(entrada[entra]);
           if (objP.Muestra(entrada[entra], salidas[entra]) == false) {
               mal++;
           }
       }

       double precision = ((ConjuntoEntradas - mal) * 100) / ConjuntoEntradas;
       System.out.println("Registros errados: " + mal + " Exactitud: " + precision + "%");

       escribirDatosArchivo(objP.getW());
       escribirDatosUmbral(objP.getU());
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

    private static void escribirDatosArchivo(double[][][] pesos) {
        File archivo = new File("Pesos.csv");
        String archCSV = "Pesos.csv";
        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archCSV));
            for (int i = 1; i < pesos.length; i++) {
                for (int j = 1; j < pesos[i].length; j++) {
                    for (int k = 1; k < pesos[i][j].length; k++) {
                        escritor.write(pesos[i][j][k] + ",");
                        escritor.flush();
                    }
                }
            }
            escritor.close();
        } catch (Exception e) {
            System.out.println(e);
        }
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

    private static void escribirDatosUmbral(double[][] umbrales) {
        File archivo = new File("Umbrales.csv");
        String archCSV = "Umbrales.csv";
        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archCSV));
            for (int i = 1; i < umbrales.length; i++) {
                for (int j = 1; j < umbrales[i].length; j++) {
                    escritor.write(umbrales[i][j] + ",");
                    escritor.flush();
                }
            }
            escritor.close();
        } catch (Exception e) {
            System.out.println(e);
        }
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
}

