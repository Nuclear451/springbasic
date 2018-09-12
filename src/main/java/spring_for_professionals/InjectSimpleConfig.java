package spring_for_professionals;

public class InjectSimpleConfig {
	private String name = "Tom";
	private int age = 32;
	private int height = 180;
	private boolean programmer = false;
	private long ageInSeconds = 3600 * 24 * 365 * 32;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isProgrammer() {
		return programmer;
	}

	public void setProgrammer(boolean programmer) {
		this.programmer = programmer;
	}

	public long getAgeInSeconds() {
		return ageInSeconds;
	}

	public void setAgeInSeconds(long ageInSeconds) {
		this.ageInSeconds = ageInSeconds;
	}
}
