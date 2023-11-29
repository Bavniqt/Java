Scanner kb=new Scanner(System.in);
int i,n;
n=kb.nextInt();
if(n>0)
{
for(i=2; i<n; i+=2)

System.out.println(“i="+i);

}
else

System.out.println("!!n<=0!! Error");

kb.close();
