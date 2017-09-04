javac -d classes --module-path mods --source-path src $(find . -name '*.java')

jar --create  --file libs/iki-team.jar -C classes/ .

java --module-path libs/ -m iki.team/fr.zenika.iki.team.service.TeamManager