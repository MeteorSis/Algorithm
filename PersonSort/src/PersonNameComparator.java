import java.util.Comparator;

class PersonNameComparator implements Comparator<Person>
{
	@Override
	public int compare(Person p1, Person p2) {
		int r=p1.getName().compareTo(p2.getName());
		if(r!=0)
			return r;
		return p1.getAge()-p2.getAge();
	}

}
