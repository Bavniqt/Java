Scanner kb=new Scanner(System.in);
int number;
int broi=0;
while (broi<3)
{

number=kb.nextInt();
if(number>0)
broi++;

}
System.out.println("Готово! Въведохте 3 положителни числа!");
kb.close();
