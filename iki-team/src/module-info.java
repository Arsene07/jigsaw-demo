module iki.team{
    exports fr.zenika.iki.team.domain;
    exports fr.zenika.iki.team.service;
    opens fr.zenika.iki.team.domain;
    requires java.logging;
    requires java.sql;
    requires jackson.databind;
    requires jdk.unsupported;
    requires java.desktop;
}
