import java.util.Random;
public class threeDice {	
		
		private int Dice;
		
		Dice D1;
		Dice D2;
		Dice D3;
		
		ThreeDice( int value)
		{
			 D1 = new Dice(value);
			 D2 = new Dice(value);
			 D3 = new Dice(value);
		}
		
		public int Throw()
		{
			return (D1.Throw() + D2.Throw() + D3.Throw() / 3;			
		}
		
}
