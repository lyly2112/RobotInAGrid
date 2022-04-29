import java.util.Objects;

public class Position {

	int r;
	int c;

	public Position(int r, int c) {
		super();
		this.r = r;
		this.c = c;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(c, r);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		return c == other.c && r == other.r;
	}


	@Override
	public String toString() {
		return "Position [r=" + r + ", c=" + c + "]";
	}
	
	
}
