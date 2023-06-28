package tv;

public class TV {
	private int channel; // 1 - 255
	private int volume; // 0 - 100
	private boolean power;

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public void power(boolean on) {
		this.power = on;
	}

	public void volume(int volume) {
		// volume 값을 줘서 값을 증가
		if(volume > 100) {
			this.volume = 100;
		} else if (volume < 0) {
			this.volume = 0;
		} else {
			this.volume = volume;
		}
	}

	public void volume(boolean up) {
		if (up) {
			volume += 1;
			if (volume > 100) {
				volume = 0;
			}
		} else {
			volume -= 1;
			if (volume < 0) {
				volume = 100;
			}
		}
	}

	public void channel(int channel) {
		// channel 값을 줘서 값을 증가
		if(channel > 255) {
			this.channel = 255;
		} else if (channel < 1) {
			this.channel = 1;
		} else {
			this.channel = channel;
		}
	}

	public void channel(boolean up) {
		if (up) {
			channel += 1;
			if (channel > 255) {
				channel = 1;
			}
		} else {
			channel -= 1;
			if (channel < 1) {
				channel = 255;
			}
		}
	}

	public void status() {
		System.out.println("TV[power=" + (power ? "on" : "off") + ", channel=" + channel + ", volume=" + volume + "]");
	}
}
