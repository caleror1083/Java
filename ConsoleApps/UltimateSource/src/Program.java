// this program displays GUI frames
public class Program
	{
		public static void main(String[] args)
			{
				LinkedList llist = new LinkedList();
				
				for (int i = 5; i > 0; --i)
					{
						llist.push(i);
						llist.printList();
						llist.printMiddle();
					}
			}
	}