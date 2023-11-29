Scanner kb=new Scanner(System.in);
int i,n,p=1;
n=kb.nextInt();
if(n>0)

{ for(i=1; i<=n; i++)

p*=i;

System.out.println("p="+p);

}
else

System.out.println("!!n<=0!! Error");

kb.close();
