package spring_for_professionals;

public class InjectSimpleSpel {
	private String name;
	private int age;
	private int height;
	private boolean programmer;
	private long ageInSeconds;

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

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("InjectSimpleSpel{");
		sb.append("name='").append(name).append('\'');
		sb.append(", age=").append(age);
		sb.append(", height=").append(height);
		sb.append(", programmer=").append(programmer);
		sb.append(", ageInSeconds=").append(ageInSeconds);
		sb.append('}');
		return sb.toString();
	}
}
