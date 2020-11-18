
public class App {

	public static void main(String[] args) {
		IMediaPlayer lecture=new Mp3();
		lecture.play("fichier.mp3");
		System.out.println("----------------------");
		lecture=new FormatAdapter(new MP4());
		lecture.play("fichier.mp4");
		System.out.println("--------------------------");
		lecture=new FormatAdapter(new Vlc());
		lecture.play("fichier.vlc");
		
	}
}
