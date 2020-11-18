
public class FormatAdapter implements IMediaPlayer {

	private IMediaType media;
	public FormatAdapter(IMediaType m) {
		this.media=m;
	}
	@Override
	public void play(String filename) {

	System.out.print(" utiliser Adapter --> " );
	media.playFile(filename);
	}

}
