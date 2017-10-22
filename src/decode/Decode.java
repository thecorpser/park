/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decode;

/**
 *
 * @author victormanuel
 */
public class Decode {
 static String alfabeto= "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHI";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // decode3();
       decode3();
//     String string="AAA" ;
//     while(string.length()<5){string=generarnuevacadena(string,string.length()-1);}
    }
    
    public static void decode3()
    {
    String mensaje="no hay resultados";
    String cod2 = "HJDTP";
    String[] lista=generarcadenas(536);
  System.out.println(lista.length);
    for(int i=0;i<lista.length;i++){
    String aux = "" + codificar(lista[i],10);
    String pagina = decodificar(cod2, aux);
    double porcentaje= ((i+1)*100)/lista.length;
    System.out.println(porcentaje+"% ("+lista.length+")");
    if (pagina.equals(lista[i])) {
    if(mensaje!="no hay resultados")
    {
        mensaje+=", "+lista[i];
    }
        else
    {
        mensaje=lista[i];
    }
        System.out.println("Respuesta Correcta!!!!!!!! "+lista[i] );

    }
    }
    System.out.println("la contraseña es: "+mensaje);
    }
    public static String[] generarcadenas(int valor)
    {
        String str="HXZY";
        int codigo=0; 
        String array="";
        while(!(str.equals("ACABAC")))
        {
         codigo=codificar(str,3);
    if(codigo==valor)
    {
        array+=str+"%";
        System.out.println(str);
    }
    str=generarnuevacadena(str,str.length()-1);
        }
        return array.split("%");
    }
    public static int codificar(String str, int num){
     
        int codigo = 0;
        for (int i=0; i<str.length(); i++) 
    {
        char letra = str.charAt(i);
        int c = alfabeto.indexOf(letra,0) + 1;
        codigo = codigo * num + c;
    }
        return codigo;
    }
    public static String decodificar(String pagina, String num){
      String result="";
    for (int i=0;i<pagina.length();i++) {
      char letra=pagina.charAt(i);
      int a=alfabeto.indexOf(letra,0);
      a-=(Character.getNumericValue(num.charAt(i))*1);
      if (a<0) a+=26;
      result += alfabeto.charAt(a);
    }
 return result;
    }
    public static String generarnuevacadena(String str, int index){
    String nstr="";
    if (index==-1)
    {
        for (int i=0;i<str.length()+1;i++)
        {
            
            nstr+="A";
        }
    }
    else
    {
        if(str.charAt(index)=='Z')
            {
                for(int i=0;i<str.length();i++)
                {
                    if (i==index)
                    {
                        nstr=nstr+"A";
                    }
                    else
                    {
                        nstr=nstr+str.charAt(i);  
                    }
                }
                nstr=generarnuevacadena(nstr,index-1);
                      
            }
        else
        {
            for(int i=0;i<str.length();i++)
                {
                    if (i==index)
                    {
                        nstr=nstr+ alfabeto.charAt(alfabeto.indexOf(str.charAt(index),0)+1);
                    }
                    else
                    {
                        nstr=nstr+str.charAt(i);
                    }  
                }
           
        }
    }
    return nstr;
    }
    
    public static void decode2(){
String str="0";
long cstr=0;
long x=0;
long d=0;
int cont=1;
int contd=0;
while(!(x==35081 && d==36551900)){
long a;
long b;
long c;
d=1;
cstr++;
str=String.valueOf(cstr);
x=(cstr);
for (int i=0;i< str.length();i++)
    
	{       
                 
		a=(x-100)^x-(x-50)^(x-1);
		b=(x-30)^(x-2);
		c=a-b;		
                if(i==str.length()-1)
                {
                    d=(Character.getNumericValue(str.charAt (i) ) * ( Integer.parseInt(str.substring( i,i+1 ) ))) * d + d;
                }
                else
                {
                    d=(Character.getNumericValue(str.charAt (i) ) * ( Integer.parseInt(str.substring( i,i+2 ) ))) * d + d;
                }
                
                x =c*((a-a%b)/b+1)+a+b;
                if(d==36551900){cont++; System.out.println("cantidad d: "+contd);}

	
	}if(cstr>Math.pow(10, cont)){System.out.println(cont);cont++;}
}
System.out.println(str);
		

//-->
  
    
    
    
    }
    
    public static void decode1(){
int a=1846;
int b=1835;
String str2="0";
String str="00000";
int cstr;
int cstr2=0;
int num;
int acum=0;
while ((str.length()<6)){

cstr= Integer.parseInt(str)+1;

str=String.valueOf(cstr);
num=Integer.parseInt(str);
acum=0;
    for(int i=0;i<str.length();i++){
    acum+=num%10;
    num=num/10; }
if((str.length()==5) && (acum==33) )
{
	cstr2=((a-b)*(cstr-a)^(cstr-b)>>a)<<b;
        str2=String.valueOf(cstr2);
        if(cstr2==1737089024)
            System.out.println(str);
}

 }

if(str.length()==6){
    System.out.println("gg");
}
    }
}

