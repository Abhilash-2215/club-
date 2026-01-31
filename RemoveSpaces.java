public class RemoveSpaces
{
	public static void main(String[] args)
	{
		String str="Java is fun";
		String noSpaces=str.replaceAll(" ","");
		System.out.println("String without spaces:"+noSpaces);
	}
}