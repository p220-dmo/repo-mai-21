package fr.htc.library.dao;

import java.util.Collection;

import fr.htc.library.entity.Member;

public class MemberDaoImpl implements MemberDao {

	public Member save(Member member) {
		LibraryDatabase.getMemberTable().put(member.getMatricule(), member);
		return LibraryDatabase.getMemberTable().get(member.getMatricule());
	}

	public Collection<Member> getAllMember() {
		return LibraryDatabase.getMemberTable().values();
	}

	public Member getMemberByMatricule(String matricule) {
		
		return LibraryDatabase.getMemberTable().get(matricule);
	}

}
