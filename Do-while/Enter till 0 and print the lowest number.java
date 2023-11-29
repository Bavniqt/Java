Scanner kb=new Scanner(System.in);
int a, min;
System.out.println("Въведи число:");
a=kb.nextInt();
min=a;
while (a!=0)
{

System.out.println("Въведи число:");
a=kb.nextInt();
if((a<min)&&(a!=0))
min=a;

}
System.out.println("min="+min);
kb.close();
