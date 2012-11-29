public class SignatureDecorator {

	public String applyDecoration(String name, String[] commands, String[] decorations) {
		for (int i = 0; i < commands.length; i++)
			if (commands[i].equals("prepend")) name = decorations[i] + name;
			else if (commands[i].equals("append")) name += decorations[i];
			else name = decorations[i] + name + new StringBuffer(decorations[i]).reverse();
		return name;
	}

}
