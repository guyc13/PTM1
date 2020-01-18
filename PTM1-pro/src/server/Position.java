package server;

public class Position {

	private int x, y;

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	};

	public Position() {
	};
	
	public Position(String str) {
		String[] arr= str.split(",");
		x = Integer.parseInt(arr[0]);
		y = Integer.parseInt(arr[1]);
	}

	public boolean equals(Position p) {
		if ((this.x == p.x) && (this.y == p.y))
			return true;
		else
			return false;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return ( "(" + x + "," + y + ")" );
	}
}
