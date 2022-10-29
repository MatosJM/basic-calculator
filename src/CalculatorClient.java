import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.*;

public class CalculatorClient {

    public static void main(String[] args) 	{
        try {
            Socket s = new Socket("127.0.0.1", 9999);
            InputStream i = null;
            OutputStream o = null;
            String str = "";
            Formatter fmt;
            boolean validExpr = false;

            do {
                byte[] line = new byte[100];
                Scanner sc;
                System.out.println("==========CALCULADORA==============");
                System.out.print("Expressão: ");

                sc = new Scanner(System.in);
                line = sc.next().getBytes();

                if (Utils.isValidExpr(new String(line).trim()) || new String(line).equals("sair")){

                    i = s.getInputStream();
                    o = s.getOutputStream();
                    o.write(new String(line).trim().getBytes());

                    Arrays.fill(line, (byte)0);
                    i.read(line);

                    str = new String(line).trim();

                    fmt = new Formatter();

                    if (Double.parseDouble(str)%1 == 0) {
                        String s1 = str.replaceAll("\\.\\d+", "");
                        fmt.format("Resultado: %,d", Integer.parseInt(s1));
                    } else {
                        fmt.format("Resultado: %,.2f", Double.parseDouble(str));
                    }

                    System.out.println(fmt);

                    fmt.close();

                }else{
                    System.out.println("Expressão Inválida! Tente novamente.");
                }

            } while ( !str.trim().equals("sair") );
            s.close();

        }
        catch (Exception err) {
            System.err.println(err);
        }
    }

}
