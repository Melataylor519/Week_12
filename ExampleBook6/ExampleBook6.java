package ExampleBook6;

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
	class ExampleBook6
	{
		public static void main(String[] args)
		{
			
			Book b1, b2;
			
			b1 = new Book("Thinking in Java", "Bruce Eckel", 1129);
			b2 = new Book("Thinking in Java", "Bruce Eckel", 1129);
			
			if (b1 == b2)
			System.out.println("The two books are the same");
			else
				System.out.println("The two books are different");
		}
	}
}
