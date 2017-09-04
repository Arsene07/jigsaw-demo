package fr.zenika.iki.team.service;

import fr.zenika.iki.team.domain.Member;

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

}
