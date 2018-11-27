package strings;

public class Essay {
	private String name;
	private String essay;

	public Essay() {
		name = "Jack Cooney";
		essay = "My name is jack.";
	}

	public void setName(String newName) {
		name = newName;

	}

	public void setText(String newEssay) {
		essay = newEssay;
	}

	public String getName() {
		int space = name.indexOf(' ');
		String last = name.substring(space + 1, name.length());
		return last.toUpperCase();
	}

	public int getLetters() {
		int space = name.indexOf(' ');
		String first = name.substring(0, space);
		return first.length();
	}

	public boolean ifX() {
		return name.contains("X");

	}
	public int words() {
		int spaces = 0;
		for(int i = 1; i < essay.length(); i++)
		{
			if (essay.charAt(i) == ' ')
			{
			spaces++;
			}
		}
		return spaces + 1;
	}

}
