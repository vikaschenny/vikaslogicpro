package GenarutilityPrograms;

public class fibonaciinforloop {
	public static void main(String args[])
	{
		int varbleone=0,varibletwo=1,results;
		for(int i=0;i<10;i++)
		{
			results=varbleone+varibletwo;
			if(results>=10)
			{
				break;
			}
			varbleone=varibletwo;
			varibletwo=results;
			System.out.println(results);
		}
	}

}