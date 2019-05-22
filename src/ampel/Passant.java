package ampel;

public class Passant extends Verkehr {
	public Passant( int x,  int y) {
		super(x, y);
	}

	@Override
	public String toString() {
		return "P";
	}
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void movePassant(String moveString) {
        switch (moveString) {
            case "sn":
            	this.y--;
                break;
            case "ns":
                this.y++;     
                break;
            case "ow":
                this.x--;
                break;
           
            case "wo":
                this.x++;
                break;
            
              
        }
    }

}