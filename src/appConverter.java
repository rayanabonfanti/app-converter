//pacote do programa
package conversão;

/*
 * @author Rayana
 */

//importações-bibliotecas
import javax.swing.JOptionPane;

//classe principal do programa
public class Conversão 
{
    public static void main(String[] args)
    {
        //variáveis
        String menuPrimeiro1="", numero="",menuSegundo1="",opcao;
        int menuPrimeiro2,menuSegundo2,opcaoN,tamanho=100;
        
        //do while para repetir o menu
        
        opcao = JOptionPane.showInputDialog("Programa para conversão de binário, hexadecimal e decimal \n\n1 - Conversão\n0 - Sair\n ");
        opcaoN = Integer.parseInt(opcao); 
        while(opcaoN!=0)
        {
            char[] cadaDigito1 = null;
            char[] cadaDigito2 = null;
            int tamanhoNumero =0, cont=0;    
            
            menuPrimeiro1 = JOptionPane.showInputDialog("O dígito que será informado é qual desses tipos:\n\n"
                + "1 - Binário\n"
                + "2 - Decimal\n"
                + "3 - Hexadecimal\n\n "
                + "(Digite o número correspondente)");
            menuPrimeiro2 = Integer.parseInt(menuPrimeiro1); 
        
            numero = JOptionPane.showInputDialog("Informe o dígito: \n ");
            
            menuSegundo1 = JOptionPane.showInputDialog("O dígito informado quer converter para qual desses:\n\n"
                + "1 - Binário\n"
                + "2 - Decimal\n"
                + "3 - Hexadecimal\n\n "
                + "(Digite o número correspondente)");
            menuSegundo2 = Integer.parseInt(menuSegundo1); 
            
        
        //conversão do número para array invertido
        cadaDigito1 = numero.toCharArray();
        cadaDigito2 = numero.toCharArray();
        tamanhoNumero=cadaDigito1.length;
        for(int i = tamanhoNumero-1; i >= 0; i--)
        {
            cadaDigito2[cont]=cadaDigito1[i];
            cont++;
        }
        
        //switch para os tipos de conversões
        switch(menuPrimeiro2)
        {
            case 1:
                if (menuSegundo2==2)
                {
                    int n,a;
                    double b;
                    n = Character.getNumericValue(cadaDigito2[0]);
                    a=n*((2^0)-1);
                    for(int i = 1; i < tamanhoNumero; i++)
                    {
                        n = Character.getNumericValue(cadaDigito2[i]);
                        b=Math.pow(2, i);
                        a+=(n*b);                   
                    }
                    JOptionPane.showMessageDialog(null, "Digitou binário " + numero + " e decimal ficou " + a);
                }
                else if (menuSegundo2==3)
                {
                    int y,u;
                    double k;
                    y = Character.getNumericValue(cadaDigito2[0]);
                    u=y*((2^0)-1);
                    for(int i = 1; i < tamanhoNumero; i++)
                    {
                        y = Character.getNumericValue(cadaDigito2[i]);
                        k=Math.pow(2, i);
                        u+=(y*k);                   
                    }
                    
                    int a=0,c,b,cont1=0,cont2=0;
                    int g[] = new int[tamanho];
                    int d[] = new int[tamanho];
                    String s="";
                    
                    do
                    {
                        g[cont1] = u % 16;
                        u = u/16;
                        cont1++;                        
                    }while(u>0);
                    for(int i = cont1-1; i >= 0; i--)
                    {
                        d[cont2]=g[i];
                        cont2++;
                    }
                    
                    //converter os números para A,B,C,D,E,F
                    String stringO[] = new String[tamanho];
                    
                    for(int i = 0; i < cont2; i++)
                    {
                        if(d[i]==10)
                        {
                            stringO[i]="A";
                        }
                        else if(d[i]==11)
                        {
                            stringO[i]="B";
                        }
                        else if(d[i]==12)
                        {
                            stringO[i]="C";
                        }
                        else if(d[i]==13)
                        {
                            stringO[i]="D";
                        }
                        else if(d[i]==14)
                        {
                            stringO[i]="E";
                        }
                        else if(d[i]==15)
                        {
                            stringO[i]="F";
                        }
                        else
                        {
                            stringO[i]=""+d[i];
                        }
                    }
                    for(int i = 0; i < cont2;i++)
                    {
                        s=s+stringO[i];
                    }
                    JOptionPane.showMessageDialog(null, "Digitou binário " + numero + " e hexadecimal ficou " + s);
                
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Digitou número errado!");
                    break;
                }
            break;
            case 2:                
                if(menuSegundo2==1)
                {
                    int n,cont1=0,cont2=0;
                    int g[] = new int[tamanho];
                    int d[] = new int[tamanho];
                    String s="";
                    
                    n = Integer.parseInt(numero);
                    do
                    {
                        g[cont1] = n % 2;
                        n = n/2;
                        cont1++;                        
                    }while(n>0);
                    for(int i = cont1-1; i >= 0; i--)
                    {
                        d[cont2]=g[i];
                        cont2++;
                    }
                    
                    for(int i = 0; i < cont2;i++)
                    {
                        System.out.print(d[i]);
                        s=s+String.valueOf(d[i]);                        
                    }
                    JOptionPane.showMessageDialog(null, "Digitou decimal " + numero + " e binário ficou " + s);
                    
                }
                else if (menuSegundo2==3)
                {
                    int n,a=0,c,b,cont1=0,cont2=0;
                    int g[] = new int[tamanho];
                    int d[] = new int[tamanho];
                    String s="";
                    
                    n = Integer.parseInt(numero);
                    do
                    {
                        g[cont1] = n % 16;
                        n = n/16;
                        cont1++;                        
                    }while(n>0);
                    for(int i = cont1-1; i >= 0; i--)
                    {
                        d[cont2]=g[i];
                        cont2++;
                    }
                    
                    //converter os números para A,B,C,D,E,F
                    String stringO[] = new String[tamanho];
                    
                    for(int i = 0; i < cont2; i++)
                    {
                        if(d[i]==10)
                        {
                            stringO[i]="A";
                        }
                        else if(d[i]==11)
                        {
                            stringO[i]="B";
                        }
                        else if(d[i]==12)
                        {
                            stringO[i]="C";
                        }
                        else if(d[i]==13)
                        {
                            stringO[i]="D";
                        }
                        else if(d[i]==14)
                        {
                            stringO[i]="E";
                        }
                        else if(d[i]==15)
                        {
                            stringO[i]="F";
                        }
                        else
                        {
                            stringO[i]=""+d[i];
                        }
                    }
                    for(int i = 0; i < cont2;i++)
                    {
                        s=s+stringO[i];
                    }
                    JOptionPane.showMessageDialog(null, "Digitou decimal " + numero + " e binário ficou " + s);
                
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Digitou número errado!");
                    break;
                }
            break;
            case 3:                
                if(menuSegundo2==1)
                {
                    String stringO[] = new String[tamanho];
                    
                    for(int i = 0; i < tamanhoNumero; i++)
                    {
                        stringO[i]=""+cadaDigito2[i];
                    }
                    
                    for(int i =0; i < tamanhoNumero; i++)
                    {
                        if(stringO[i].equals("a") || stringO[i].equals("A"))
                        {
                            stringO[i] = "10";
                        }
                        else if (stringO[i].equals("b") || stringO[i].equals("B"))
                        {
                            stringO[i] = "11";
                        }
                        else if (stringO[i].equals("c") || stringO[i].equals("C"))
                        {
                            stringO[i] = "12";
                        }
                        else if (stringO[i].equals("d") || stringO[i].equals("D"))
                        {
                            stringO[i] = "13";
                        }
                        else if (stringO[i].equals("e") || stringO[i].equals("E"))
                        {
                            stringO[i] = "14";
                        }
                        else if (stringO[i].equals("f") || stringO[i].equals("F"))
                        {
                            stringO[i] = "15";
                        }
                        else
                        {
                            stringO[i] = stringO[i];
                        }
                    }
                    int n,a;
                    double b;
                    n = Integer.parseInt(stringO[0]);
                    a=n*1;
                    for(int i = 1; i < tamanhoNumero; i++)
                    {
                        n = Integer.parseInt(stringO[i]);
                        b=Math.pow(16, i);
                        a+=(n*b);                   
                    }
                    
                    int cont1=0,cont2=0;
                    int g[] = new int[tamanho];
                    int d[] = new int[tamanho];
                    String s="";
                    
                    do
                    {
                        g[cont1] = a % 2;
                        a = a/2;
                        cont1++;                        
                    }while(a>0);
                    for(int i = cont1-1; i >= 0; i--)
                    {
                        d[cont2]=g[i];
                        cont2++;
                    }
                    
                    for(int i = 0; i < cont2;i++)
                    {
                        s=s+String.valueOf(d[i]);                        
                    }
                    JOptionPane.showMessageDialog(null, "Digitou hexadecimal " + numero + " e binário ficou " + s);
                    
                }
                else if (menuSegundo2==2)
                {
                    String stringO[] = new String[tamanho];
                    
                    for(int i = 0; i < tamanhoNumero; i++)
                    {
                        stringO[i]=""+cadaDigito2[i];
                    }
                    
                    for(int i =0; i < tamanhoNumero; i++)
                    {
                        if(stringO[i].equals("a") || stringO[i].equals("A"))
                        {
                            stringO[i] = "10";
                        }
                        else if (stringO[i].equals("b") || stringO[i].equals("B"))
                        {
                            stringO[i] = "11";
                        }
                        else if (stringO[i].equals("c") || stringO[i].equals("C"))
                        {
                            stringO[i] = "12";
                        }
                        else if (stringO[i].equals("d") || stringO[i].equals("D"))
                        {
                            stringO[i] = "13";
                        }
                        else if (stringO[i].equals("e") || stringO[i].equals("E"))
                        {
                            stringO[i] = "14";
                        }
                        else if (stringO[i].equals("f") || stringO[i].equals("F"))
                        {
                            stringO[i] = "15";
                        }
                        else
                        {
                            stringO[i] = stringO[i];
                        }
                    }
                    int n,a;
                    double b;
                    n = Integer.parseInt(stringO[0]);
                    a=n*1;
                    for(int i = 1; i < tamanhoNumero; i++)
                    {
                        n = Integer.parseInt(stringO[i]);
                        b=Math.pow(16, i);
                        a+=(n*b);                   
                    }
                    JOptionPane.showMessageDialog(null, "Digitou hexadecimal " + numero + " e decimal ficou " + a);
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Digitou número errado!");
                    break;
                }
            break;
            default:
                JOptionPane.showMessageDialog(null, "Digitou número errado!");                
            break;
        }
        opcao = JOptionPane.showInputDialog("Programa para conversão de binário, hexadecimal e decimal \n\n1 - Conversão\n0 - Sair\n ");
        opcaoN = Integer.parseInt(opcao); 
        
        }
    }
}
