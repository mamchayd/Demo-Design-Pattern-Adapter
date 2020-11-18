
public class Vlc implements IMediaType{

	@Override
	public void playFile(String filename) {
		System.out.println("lecture avec VLC "+filename);
	}

}
