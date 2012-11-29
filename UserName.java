import java.util.HashSet;

public class UserName {

	public String newMember(String[] existingNames, String newName) {
		HashSet<String> names = new HashSet<String>();
		for (String s : existingNames)
			names.add(s);
		if (!names.contains(newName))
			return newName;
		else
			for (int i = 1;; i++)
				if (!names.contains(newName+i))
					return newName+i;
	}

}
