    Scanner kb = new Scanner(System.in);
		double x,y;
		int k;
		System.out.println(" Enter x:");
		x = kb.nextDouble();
		System.out.println("Enter y:");
		y = kb.nextDouble();
		if ((x*y)>0)
		if (x>0)
		k=1;
		else
			k=3;
		else 
			if (x>0)
				k=4;
			else 
				k=2;
	System.out.println("k="+k);
	if (x==0)
		System.out.println("the axis of x is:");
	if (y==0)
		System.out.println("the axis of y is:");
	if (x==0)
		if (y==0)
			System.out.println("In the center");


