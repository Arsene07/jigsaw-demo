echo 'compiling module'
javac -d classes --module-path ../mods --source-path src $(find . -name '*.java')


echo 'making module jar'
jar --create  --file ../mods/iki-mission.jar -C classes/ .

