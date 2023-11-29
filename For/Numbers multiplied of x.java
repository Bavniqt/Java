Scanner kb=new Scanner(System.in);
int a=kb.nextInt();
int b=kb.nextInt();
int x=kb.nextInt();
if(a>0 && b>0 && a<b && x>0)
for(i=a; i<b; i++)

if(i%x==0)

System.out.println("i="+i);

else

System.out.println(" Error!!!");

kb.close();
