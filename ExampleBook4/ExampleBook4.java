package ExampleBook4;
class Book
{
	String title;
	String author;
	int numberOfPages;
	String ISBN;
	
	Book(String tit, String aut, int num)
	{
		title = tit; author = aut;
		numberOfPages = num;
		ISBN = "unknown";
	}
	//compute initials of author's name
	public String getInitials()
	{
		String initials = "";
		for(int i = 0; i < author.length(); i++)
		{
			char currentChar = author.charAt(i);
			if(currentChar >= 'A' && currentChar <='Z')
				initials = initials + currentChar + '.';
		}
		return initials;
	}
	public static void main(String[] args)
	{
		Book b;
		
		b = new Book("Thinking in Java", "Bruce Eckel", 1129);
		System.out.println("Initials: " + b.getInitials());
	}
}