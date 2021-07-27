import java.util.Scanner;
import java.io.*;

public class TestaData
{
public static void main(String[] args) {

int opc1;
int d1;
int m1;
int a1;
Data hr = new Data();
int opc;
Scanner ler = new Scanner(System.in);
do{

System.out.println("Controle de Data");

System.out.println("0 - Sair");
System.out.println("1 - Passar Dia");
System.out.println("2 - Passar Mes");
System.out.println("3 - Passar Ano");
System.out.println("4 - informar Dia");
System.out.println("5 - informar Mes");
System.out.println("6 - informar Ano");
System.out.println("7 - Recuperar Dia");
System.out.println("8 - Recuperar Mes");
System.out.println("9 - Recuperar Ano");
System.out.println("10 - Mostra 1");
System.out.println("11 - Mostra 2");
System.out.println("12 - Verifica Ano Bisexto");
System.out.println("13 - dias transcorridos");
System.out.println("Digite sua opção");
do{
opc1 = ler.nextInt();
}while(opc1<0||opc1>13);

opc=opc1;
switch(opc)
{
case 1:
{
//System.out.println("Digite o dia");
//d1 = ler.nextInt();
hr.entraDia(10);
break;
}
case 2:
{
//System.out.println("Digite o mes");
//m1 = ler.nextInt();
hr.entraMes(5);
break;
}

case 3:
{
//System.out.println("Digite o ano");
//d1 = ler.nextInt();
hr.entraAno(2018);
break;
}

case 4:
hr.entraDia();
break;

case 5:
hr.entraMes();
break;

case 6:
hr.entraAno();
break;

case 7:
System.out.println(hr.retDia());
break;

case 8:
System.out.println(hr.retMes());
break;

case 9:
System.out.println(hr.retAno());
break;

case 10:
System.out.println(hr.mostra1());
break;

case 11:
System.out.println(hr.mostra2());
break;

case 12:
if (hr.bissexto())
{
System.out.println("Ano bissexto");
}else
{
System.out.println("Não é Ano bissexto");
}

break;

case 13:
System.out.println(hr.diasTranscorridos());
break;
}//switch

System.out.println("Digite algo");

ler.next();

}while(opc!=0);

}//main
}//class
