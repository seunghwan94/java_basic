package lesson13_collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetEx02 {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>();
		set.add("가");
		set.add("가");
		System.out.println(set);
		set.add(new Member("홍길동", 40));
		set.add(new Member("홍길동", 40));
		System.out.println(set);
		
		System.out.println("홍길동".hashCode());
		System.out.println(new String("홍길동").hashCode());
 	}
}


class Member implements Comparable<Member>{
	String name;
	int age;
	
	public Member(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age); // 이걸로 사용해라	
//		return name.hashCode() + age;	
	}



	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Member)) {
			return false;
		}
		Member member =(Member)obj;
		return name.equals(member.name) && age == member.age;
	}



	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}



	@Override
	public int compareTo(Member o) {
		return -name.compareTo(o.name);
	}
	
	
	
}