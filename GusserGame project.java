import java.util.Scanner;

class  Gusser
{
	int gnum;
	int guessnum()
	{
		System.out.println("Guess the number from 1-50");
		Scanner sc=new Scanner(System.in);
		gnum=sc.nextInt();
		return gnum;
	}
}

class Player
{
	int pnum;
	int playernum()
{
		System.out.println("Player choose a number from 1-50");
		Scanner sc=new Scanner(System.in);
		pnum=sc.nextInt();
		return pnum;
}
}

class Umpier
{
	int ugnum;
	int up1num;
	int up2num;
	int up3num;

	void collectgnum()
	{
		Gusser g = new Gusser();
		ugnum=g.guessnum();
	}
	void collectpnum()
	{
		System.out.println("Player1:");
		Player p1=new Player();
		up1num=p1.playernum();

		System.out.println("Player2:");
		Player p2=new Player();
		up2num=p2.playernum();

		System.out.println("Player3:");
		Player p3=new Player();
		up3num=p3.playernum();
	}
	void compare()
	{
		if(ugnum==up1num)
		{
			System.out.println("Player 1 Wins");
		}
		else if(ugnum==up2num)
		{
			System.out.println("Player 2 Wins");
		}
		else if(ugnum==up3num)
		{
			System.out.println("Player3 Wins");
		}
		else
		{
			System.out.println("GAME OVER");
		}
	}
}
 
 class GusserGame
 {
	 public static void main(String[] args)
	 {
		 Umpier u=new Umpier();
		 u.collectgnum();
		 u.collectpnum();
		 u.compare();
	 }
 }




		



	