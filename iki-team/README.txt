compile:
    javac -d classes --source-path src $(find . -name '*.java')

making jar:
    jar cf ../mods/iki-team.jar -C classes/ .

viewing content of jar:
    jar tf ../mods/iki-team.jar

