package fr.zenika.iki.api.controller;

import fr.zenika.iki.recruitment.domain.Candidat;

import fr.zenika.iki.team.domain.Member;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by melghaouat on 27/08/2017.
 */
public class AdhesionCtl {

    List<Candidat> candidats = new ArrayList<Candidat>();
    List<Member> members = new ArrayList<Member>();


    public AdhesionCtl(){
        candidats = new ArrayList<Candidat>();
        candidats.add(new Candidat(1,"John","Matt","john.matt@yahoo.fr"));
        candidats.add(new Candidat(2,"Brad","Pitt","brad.pitt@yahoo.fr"));
        candidats.add(new Candidat(3,"Alain","Delon","alain.delon@yahoo.fr"));

    }

    public List<Candidat> getCandidatsList(){
        return new ArrayList<Candidat>();
    }

    public void addMember(Member membre){
        members.add(membre);
    }

    public void removeMembre(Candidat membre){
        candidats.remove(membre);
    }

}

