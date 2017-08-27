package fr.zenika.iki.api.controller;

import fr.zenika.iki.recruitment.domain.Candidat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by melghaouat on 27/08/2017.
 */
public class AdhesionCtl {

    List<Candidat> candidats;

    public AdhesionCtl(){
        candidats = new ArrayList<Candidat>();
        candidats.add(new Candidat(1,"John","Matt","john.matt@yahoo.fr"));
        candidats.add(new Candidat(2,"Brad","Pitt","brad.pitt@yahoo.fr"));
        candidats.add(new Candidat(3,"Alain","Delon","alain.delon@yahoo.fr"));

    }

    public List<Candidat> getMemberList(){
        return new ArrayList<Candidat>();
    }

    public void addMember(Candidat membre){
        candidats.add(membre);
    }

    public void removeMembre(Candidat membre){
        candidats.remove(membre);
    }

}

