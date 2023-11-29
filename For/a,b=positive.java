Scanner kb=new Scanner(System.in);
int a,b;
a=kb.nextInt();
b=kb.nextInt();
if(a>0 && b>0 && a<b)
for(i=a; i<b; i++)

System.out.println("i="+i);

else

System.out.println(" Error!!!");

kb.close();
