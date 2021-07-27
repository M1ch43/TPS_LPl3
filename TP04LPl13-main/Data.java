import java.util.Scanner;
import java.util.Date;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;

public class Data
{
//atributos (privados)
private int dia;
private int mes;
private int ano;
Scanner ler = new Scanner(System.in);

public Data()
{

int d1;
int m1;
int a1;

do{
System.out.println("Digite o Dia");
d1 = ler.nextInt();
}while(d1>31 || d1<0);
do{
System.out.println("Digite o Mes");
m1 = ler.nextInt();
}while(m1>12 || m1<0);
do{
System.out.println("Digite o Ano");
a1 = ler.nextInt();
}while(a1>3000 || a1<1000);

this.dia = d1;
this.mes = m1;
this.ano = a1;

if((dia == 29) && (mes == 2) && (!bissexto()))
{
System.out.println("Data invalida");
this.dia = 0;
this.mes = 0;
this.ano = 0;
}

}//Data

public Data(int d1, int m1, int a1)
{
this.dia = d1;
this.mes = m1;
this.ano = a1;
}

public void entraDia(int D)
{


this.dia = D;
}

public void entraMes(int M)
{

this.mes = M;
}

public void entraAno(int A)
{
this.ano = A;

}
public void entraDia()
{
int D;

System.out.println("Digite o dia");
D = ler.nextInt();
this.dia = D;
}

public void entraMes()
{
int D;
System.out.println("Digite o mes");
D = ler.nextInt();

this.mes = D;
}

public void entraAno()
{
int D;
System.out.println("Digite o ano");
D = ler.nextInt();
this.ano = D;

}

public int retDia()
{
return dia;
}

public int retMes()
{
return mes;
}

public int retAno()
{
return ano;
}

public String mostra1()
{
return (dia + "/" + mes + "/" + ano);
}

public String mostra2()
{
String mes1="a";
if(mes==1)
{ mes1 = "Janeiro"; }
else if(mes==2)
{ mes1 = "Fevereiro"; }
else if(mes==3)
{ mes1 = "Março"; }
else if(mes==4)
{ mes1 = "Abril"; }
else if(mes==5)
{ mes1 = "Maio"; }
else if(mes==6)
{ mes1 = "Junho"; }
else if(mes==7)
{ mes1 = "Julho"; }
else if(mes==8)
{ mes1 = "Agosto"; }
else if(mes==9)
{ mes1 = "Setembro"; }
else if(mes==10)
{ mes1 = "Outubro"; }
else if(mes==11)
{ mes1 = "Novembro"; }
else if(mes==12)
{ mes1 = "Dezembro"; }

return (dia + "/" + mes1 + "/" + ano);

}

public boolean bissexto()
{
boolean anobisex = false;
if ( ( ano % 4 == 0 && ano % 100 != 0 ) || ( ano % 400 == 0 ) ){
            anobisex = true;
        }
       return anobisex;
}

public int diasTranscorridos()
{int dias = 0;
int x1 = 31;
int x2 = 28;
int x3 = 31;
int x4 = 30;
int x5 = 31;
int x6 = 30;
int x7 = 31;
int x8 = 31;
int x9 = 30;
int x10 = 31;
int x11 = 30;
int x12 = 31;

if (bissexto())
{
x2 = 29;
}

if (mes == 1)
{
dias = dia;
}

if (mes == 2)
{
dias = dia + x1;
}

if (mes == 3)
{
dias = dia + x1 + x2;
}

if (mes == 4)
{
dias = dia + x1 + x2 + x3;
}

if (mes == 5)
{
dias = dia + x1 + x2 + x3 + x4;
}

if (mes == 6)
{
dias = dia + x1 + x2 + x5 + x3 + x4;
}

if (mes == 7)
{
dias = dia + x1 + x2 + x6 + x5 + x3 + x4;
}

if (mes == 8)
{
dias = dia + x1 + x2 + x7 + x6 + x5 + x3 + x4;
}

if (mes == 9)
{
dias = dia + x1 + x2 + x8 + x7 + x6 + x5 + x3 + x4;
}

if (mes == 10)
{
dias = dia + x1 + x2 + x9 + x8 + x7 + x6 + x5 + x3 + x4;
}

if (mes == 11)
{
dias = dia + x1 + x2 + x9 + x8 + x7 + x6 + x5 + x3  + x4 + x10 ;
}

if (mes == 12)
{
dias = dia + x1 + x2 + x9 + x8 + x7 + x6 + x5 + x3 + x4 + x10 + x11;
}

return dias;
}


//private String getDateTime() {
//    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
///    Date date = new Date();
//    return dateFormat.format(date);
//}
}