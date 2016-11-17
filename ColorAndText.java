package GUI;

public class ColorAndText {
	public String text = null;
	public Integer[] RGB = new Integer[3];
	
	public ColorAndText(String text, int R, int G, int B){
		this.text = text;
		this.RGB[0] = R;
		this.RGB[1] = G;
		this.RGB[2] = B;
	}
}
