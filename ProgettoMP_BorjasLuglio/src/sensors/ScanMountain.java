package sensors;

public class ScanMountain extends Satellite{
	
	private int aboveSeaLevel;

	public ScanMountain(double grades, double sizeArea, String weatherType, int aboveSeaLevel) {
		super(grades, sizeArea, weatherType);
		this.aboveSeaLevel = aboveSeaLevel;
	}

	public int getAboveSeaLevel() {
		return aboveSeaLevel;
	}

	public void setAboveSeaLevel(int aboveSeaLevel) {
		this.aboveSeaLevel = aboveSeaLevel;
	}
	

}
