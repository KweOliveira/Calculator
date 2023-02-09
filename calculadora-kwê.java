import javax.swing.JOptionPane;

public class calculadora {
  
     public static void main (String[] args) {
        String PrimeiroNúmero = 
            JOptionPane.showInputDialog("Insira o primeiro Número");
        String SegundoNúmero=
            JOptionPane.showInputDialog("Insira o segundo Número ");
        String operador=
            JOptionPane.showInputDialog("Digite um dos operadores:\n* = Multiplicação\n+ = Soma\n- = Subtração\n/ = Divisão");


        int number1 = Integer.parseInt(PrimeiroNúmero);
        int number2 = Integer.parseInt(SegundoNúmero);

        int sum = number1 + number2;
        int mult = number1 * number2;
        int sub = number1 - number2;
        int div = number1 / number2;

        if (operador.equals("+") ) {
                
            JOptionPane.showMessageDialog( null, "A soma é: " + sum, "Soma de dois inteiros", JOptionPane.PLAIN_MESSAGE);
        
        }else if(operador.equals("-")) {

        JOptionPane.showMessageDialog( null, "A subetração é: " + sub, "Subtração de dois inteiros", JOptionPane.PLAIN_MESSAGE);
        
        }else if(operador.equals("*")){

            JOptionPane.showMessageDialog( null, "A Multiplicação é: " + mult, "Multiplicação de dois inteiros", JOptionPane.PLAIN_MESSAGE);

        }else if(operador.equals("/")){

            
            JOptionPane.showMessageDialog( null, "A Divisão é: " + div, "Divisão de dois inteiros", JOptionPane.PLAIN_MESSAGE);
        }else{
            
            JOptionPane.showMessageDialog( null, "\n  VOCÊ NÃO DIGITOU UM OPERADOR VALIDO! " , "Ocorreu um erro!", JOptionPane.PLAIN_MESSAGE);
        
        }
    }
}
