package fr.zenika.iki.team.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.zenika.iki.team.domain.Member;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.util.logging.Logger;

public class TeamManager {

    List<Member> members = new ArrayList<>();

    private final static Logger LOGGER = Logger.getLogger(TeamManager.class.getName());

    public void addMember(Member member){
        LOGGER.info("Adding a new member");
        members.add(member);
    }

    public void removeMember(Member member){
        LOGGER.info("removing a member");
        members.remove(member);
    }

   public void logIkiMembers() throws  IOException {
       LOGGER.info("Logging iki team members in Json format.");
       File json =  new File("iki-team.json");
       ObjectMapper objectMapper = new ObjectMapper();
       for (Member member:members ){
           objectMapper.writeValue(json, members);
       }
   }

   public static void main(String[] args) throws IOException {
       TeamManager teamManager = new TeamManager();

       teamManager.addMember(new Member(1,"Ung", "Celine","celine.ung@zenika.com"));
       teamManager.addMember(new Member(2,"Laporte", "Olivier","olivier.laporte@zenika.com"));
       teamManager.addMember(new Member(3,"Labusquière", "Maxence","maxence.Labusquiere@zenika.com"));
       teamManager.addMember(new Member(4,"Levandowski", "Cyrille","cyrille.levandowski@zenika.com"));
       teamManager.addMember(new Member(5,"Blanchard", "Tony","tony.blanchard@zenika.com"));
       teamManager.addMember(new Member(6,"Pierre", "Raby","pierre.raby@zenika.com"));
       teamManager.addMember(new Member(7,"ElGhaouat", "Mohammed","mohammed.elghaouat@zenika.com"));

       teamManager.logIkiMembers();
   }
}
