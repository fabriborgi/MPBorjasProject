package sensors;

public class ScanForest extends Satellite {

	private String categoryTree;

	public ScanForest(double grades, double sizeArea, String weatherType, String categoryTree) {
		super(grades, sizeArea, weatherType);
		this.categoryTree = categoryTree;
	}

	public String getCategoryTree() {
		return categoryTree;
	}

	public void setCategoryTree(String categoryTree) {
		this.categoryTree = categoryTree;
	}

}
