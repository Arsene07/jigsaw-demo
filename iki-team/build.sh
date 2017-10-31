echo 'compiling module'
#javac -d classes --module-path ../modules --source-path src $(find . -name '*.java')
javac -d classes/ -cp ../libs/jackson-core-2.8.10.jar:../libs/jackson-annotations-2.8.10.jar --add-exports java.desktop/sun.font=iki.team --module-path ../modules/ --source-path src/ $(find . -name '*.java')


#for sun.font:
# javac -d classes --module-path ../modules  --class-path ../lib/jackson-core-2.8.10.jar  --add-exports java.desktop/sun.font=iki.team --source-path src $(find . -name '*.java')


echo 'making module jar'
jar --create  --file ../modules/iki-team.jar -C classes/ .


echo 'Launching module jar'
java -cp ../libs/jackson-core-2.8.10.jar:../libs/jackson-annotations-2.8.10.jar --module-path ../modules/ -m iki.team/fr.zenika.iki.team.service.TeamManager

#jdeps --module-path ../modules/  ../modules/iki-team.jar

#jdeps --module-path ../modules/ --jdk-internals  ../modules/iki-team.jar
