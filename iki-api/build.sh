echo 'compiling module'
javac -d classes --module-path ../modules --source-path src $(find . -name '*.java')


echo 'making module jar'
jar --create  --file ../modules/iki-api.jar -C classes/ .


echo 'Launching module jar'
java --module-path ../modules/ --class-path ../libs/jackson-core-2.8.10.jar:../libs/jackson-annotations-2.8.10.jar -m iki.api/fr.zenika.iki.api.controller.IkiAPI
