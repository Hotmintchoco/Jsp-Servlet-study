
class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
}

public class Ex7_4 {

	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("Volume:" + t.getVolume());
	}

}
